CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(dept IN VARCHAR2, bonus IN NUMBER) IS
BEGIN
    UPDATE employees
    SET salary = salary + (salary * bonus/100)
    WHERE LOWER(department) = LOWER(dept);

END;
/



