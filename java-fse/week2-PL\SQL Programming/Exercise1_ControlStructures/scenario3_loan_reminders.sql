BEGIN
    FOR rec IN (
        SELECT customer_id, due_date
        FROM loan_details
        WHERE due_date BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan for Customer ID ' || rec.customer_id ||
                             ' is due on ' || TO_CHAR(rec.due_date, 'DD-MON-YYYY'));
    END LOOP;
END;
/
