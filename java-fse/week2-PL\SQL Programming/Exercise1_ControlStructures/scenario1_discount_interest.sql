BEGIN
    FOR rec IN (SELECT customer_id, interest_rate, age FROM loan_customers) LOOP
        IF rec.age > 60 THEN
            UPDATE loan_customers
            SET interest_rate = interest_rate - 1
            WHERE customer_id = rec.customer_id;

            DBMS_OUTPUT.PUT_LINE('Interest rate updated for Customer ID: ' || rec.customer_id);
        END IF;
    END LOOP;
END;
/
