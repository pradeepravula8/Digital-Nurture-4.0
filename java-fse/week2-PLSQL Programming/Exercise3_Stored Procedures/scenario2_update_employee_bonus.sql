CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept_name IN VARCHAR2,
    bonus_pct IN NUMBER
) IS
BEGIN
    FOR emp IN (SELECT emp_id, salary FROM employees WHERE department = dept_name) LOOP
        UPDATE employees
        SET salary = salary + (emp.salary * bonus_pct / 100)
        WHERE emp_id = emp.emp_id;

        DBMS_OUTPUT.PUT_LINE('Bonus applied to Employee ID: ' || emp.emp_id);
    END LOOP;
END;
/


--To run the Procedure
BEGIN
    UpdateEmployeeBonus('IT', 10);
END;
/
