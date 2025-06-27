CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE ACCOUNTS
    SET balance = balance + (balance * 0.01)
    WHERE LOWER(accounttype) = 'savings';

END;
/

