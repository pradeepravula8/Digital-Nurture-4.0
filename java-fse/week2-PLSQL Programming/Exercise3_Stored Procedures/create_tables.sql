BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE accounts';
   EXECUTE IMMEDIATE 'DROP TABLE employees';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/


CREATE TABLE accounts (
    account_id      NUMBER PRIMARY KEY,
    customer_name   VARCHAR2(50),
    account_type    VARCHAR2(20), 
    balance         NUMBER(10, 2)
);

INSERT INTO accounts VALUES (1001, 'Alice', 'savings', 10000);
INSERT INTO accounts VALUES (1002, 'Bob', 'savings', 5000);
INSERT INTO accounts VALUES (1003, 'Charlie', 'current', 7000);
INSERT INTO accounts VALUES (1004, 'David', 'savings', 8000);


CREATE TABLE employees (
    emp_id          NUMBER PRIMARY KEY,
    emp_name        VARCHAR2(50),
    department      VARCHAR2(30),
    salary          NUMBER(10, 2)
);

INSERT INTO employees VALUES (201, 'John', 'IT', 60000);
INSERT INTO employees VALUES (202, 'Jane', 'HR', 55000);
INSERT INTO employees VALUES (203, 'Alex', 'IT', 65000);
INSERT INTO employees VALUES (204, 'Sara', 'Finance', 70000);

COMMIT;
