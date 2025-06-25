BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE loan_details';
   EXECUTE IMMEDIATE 'DROP TABLE loan_customers';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/

CREATE TABLE loan_customers (
    customer_id     NUMBER PRIMARY KEY,
    customer_name   VARCHAR2(50),
    age             NUMBER,
    balance         NUMBER(10, 2),
    interest_rate   NUMBER(5, 2),
    is_vip          VARCHAR2(5)
);


INSERT INTO loan_customers VALUES (101, 'Alice', 65, 12000, 7.5, 'FALSE');
INSERT INTO loan_customers VALUES (102, 'Bob', 45, 8000, 8.0, 'FALSE');
INSERT INTO loan_customers VALUES (103, 'Charlie', 61, 15000, 7.0, 'FALSE');
INSERT INTO loan_customers VALUES (104, 'David', 30, 4000, 9.0, 'FALSE');
INSERT INTO loan_customers VALUES (105, 'Eve', 70, 9500, 6.5, 'FALSE');

CREATE TABLE loan_details (
    loan_id         NUMBER PRIMARY KEY,
    customer_id     NUMBER,
    loan_amount     NUMBER(10, 2),
    due_date        DATE,
    FOREIGN KEY (customer_id) REFERENCES loan_customers(customer_id)
);

INSERT INTO loan_details VALUES (301, 101, 5000, SYSDATE + 10);
INSERT INTO loan_details VALUES (302, 102, 3000, SYSDATE + 40);
INSERT INTO loan_details VALUES (303, 103, 7000, SYSDATE + 5);
INSERT INTO loan_details VALUES (304, 104, 2000, SYSDATE - 1);
INSERT INTO loan_details VALUES (305, 105, 4500, SYSDATE + 25);

COMMIT;
