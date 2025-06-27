#  PL/SQL Stored Procedures – Banking Operations

## 1. Overview

This project demonstrates the use of PL/SQL stored procedures to automate common banking operations. The procedures handle real-world use cases such as monthly interest calculation, employee bonus allocation, and secure fund transfers.



## 2. Project Summary

Stored procedures allow reusable, efficient, and secure logic to be encapsulated within the database. This project simulates three important scenarios using:

- ✅ Relational database schema
- ✅ PL/SQL stored procedure creation
- ✅ Transactional updates and business rule validation
- ✅ Logging with `DBMS_OUTPUT`



## 3. Key Functionalities

### 🔹 Scenario 1: Monthly Interest Processing

- Procedure: `ProcessMonthlyInterest`
- Goal: Apply a 1% interest to all accounts of type `'savings'`
- Use Case: Automates regular interest computation at the database level

---

### 🔹 Scenario 2: Employee Bonus Allocation

- Procedure: `UpdateEmployeeBonus(dept_name IN VARCHAR2, bonus_pct IN NUMBER)`
- Goal: Apply a bonus to all employees within a specific department
- Use Case: Incentivize employees based on performance or role

---

### 🔹 Scenario 3: Fund Transfer System

- Procedure: `TransferFunds(from_acct_id IN NUMBER, to_acct_id IN NUMBER, amount IN NUMBER)`
- Goal: Transfer money between two accounts with a balance check
- Use Case: Simulates safe and validated fund movement in banking systems



## 4. Database Design

###  Tables Used

| Table      | Description                                              |
|------------|----------------------------------------------------------|
| `accounts` | Stores customer account data: account ID, name, type, and balance |
| `employees`| Contains employee details including department and salary |

---

## 5. Logic Components

| Component             | Purpose                                                       |
|----------------------|---------------------------------------------------------------|
| PL/SQL Procedures     | Encapsulate and execute business logic directly in the database |
| Conditional Logic     | Use `IF` statements to check conditions (e.g., sufficient balance) |
| Loops (if used)       | Iterate over rows for mass updates                             |
| Transactions (`COMMIT`) | Ensure consistent updates across related operations           |
| Output (`DBMS_OUTPUT`) | Display messages for verification and logs                    |

---

## 6.  File Structure

| File Name                              | Description                                                        |
|----------------------------------------|--------------------------------------------------------------------|
| `create_tables.sql`                    | Creates the `accounts` and `employees` tables with sample data     |
| `scenario1_process_monthly_interest.sql`| Procedure to apply interest to all savings accounts                |
| `scenario2_update_employee_bonus.sql`  | Procedure to update salaries with a bonus by department            |
| `scenario3_transfer_funds.sql`         | Procedure to transfer funds between two accounts with validation   |
| `usage_examples.sql`                   | Contains example execution blocks for each stored procedure        |
| `README.md`                            | Project summary and usage guide                                    |


## 7. How to Run

1. Execute `create_tables.sql`** to create tables and insert sample data.
2. Run each scenario file** to create the corresponding stored procedure.
3. Use `usage_examples.sql`** to run and test the procedures.
4. Make sure `DBMS_OUTPUT` is enabled to see printed messages.

