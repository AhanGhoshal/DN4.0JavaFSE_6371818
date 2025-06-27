BEGIN
    FOR dat IN (
        SELECT customerid, balance
        FROM customers
        WHERE balance > 10000
    ) LOOP
        UPDATE customers
        SET ISVIP = 'TRUE'
        WHERE customerid = dat.customerid;
    END LOOP;
END;
/
