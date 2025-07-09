CREATE OR REPLACE PROCEDURE TransferFunds(fromacc IN NUMBER, toacc IN NUMBER, amt IN NUMBER) IS
    temp_balance NUMBER;
BEGIN
    SELECT balance INTO temp_balance
    FROM ACCOUNTS
    WHERE accountid = fromacc
    FOR UPDATE;

    IF temp_balance < amt THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
    END IF;

    UPDATE ACCOUNTS
    SET balance = balance - amt
    WHERE accountid = fromacc;

    UPDATE CUSTOMERS
    SET balance = balance - amt
    WHERE CUSTOMERID = fromacc;

    UPDATE ACCOUNTS
    SET balance = balance + amt
    WHERE accountid = toacc;

    UPDATE CUSTOMERS
    SET balance = balance + amt
    WHERE CUSTOMERID = toacc;

    INSERT INTO TRANSACTIONS (
        transactionid,
        accountid,
        transactiondate,
        amount,
        transactiontype
    )
    VALUES (
        transaction_seq.NEXTVAL,
        fromacc,
        SYSDATE,
        amt,
        'Withdrawal'
    );

    INSERT INTO TRANSACTIONS (
        transactionid,
        accountid,
        transactiondate,
        amount,
        transactiontype
    )
    VALUES (
        transaction_seq.NEXTVAL,
        toacc,
        SYSDATE,
        amt,
        'Deposit'
    );

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RAISE_APPLICATION_ERROR(-20002, 'Account not found.');
    WHEN OTHERS THEN
        ROLLBACK;
        RAISE;
END;
/
