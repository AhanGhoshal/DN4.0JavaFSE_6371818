DECLARE
    CURSOR senior IS
        SELECT c.customerid, l.interestrate from CUSTOMERS c
        JOIN LOANS l ON c.customerid = l.customerid
        where MONTHS_BETWEEN(SYSDATE, c.DOB) > 60;

BEGIN
    FOR data in senior LOOP
        UPDATE LOANS
        SET interestrate = interestrate - 1
        WHERE customerid = data.customerid;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Interest rates updated for senior customers.');

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('An error occurred: ' || SQLERRM);
END;
/