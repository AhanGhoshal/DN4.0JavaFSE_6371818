BEGIN
    FOR dat IN (
        SELECT l.loanid, l.enddate, l.loanamount, c.customerid, c.name
        FROM loans l
        JOIN customers c ON l.customerid = c.customerid
        WHERE l.enddate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Dear ' || dat.name ||', your loan (ID: ' || dat.loanid ||') of amount ₹' || dat.loanamount ||' is due on ' || TO_CHAR(dat.enddate, 'DD-Mon-YYYY') || '.');
    END LOOP;
END;
/
