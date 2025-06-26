
 # Stored Procedures in PL/SQL: Banking Use Cases

This project demonstrates the use of PL/SQL procedural logic to implement real-world banking operations

Using structured PL/SQL blocks, we automate tasks such as:

- Adjusting loan interest rates
- Recognizing VIP customers
- Issuing timely loan due date reminders



##  Project Summary

This project simulates three real-world banking scenarios using:

-  Relational database design  
-  Control structures (`FOR` loops, `IF` conditions)  
-  Transactional updates (`UPDATE`, `COMMIT`)  
-  Dynamic message generation via `DBMS_OUTPUT`



##  Key Functionalities

## 1. Interest Rate Adjustment for Senior Citizens

- Goal: Customers aged above 60 receive a 1% reduction on their loan interest rate.
- Why it matters: This supports financial inclusivity and simulates age-based incentives banks might offer.



##  2. VIP Status Assignment Based on Balance

- Goal: Customers with balances over $10,000 are promoted to VIP status.
- Why it matters: High-value customers are automatically recognized and rewarded through this automated logic.



###  3. Loan Repayment Reminder System

- Goal: Identify loans due within 30 days and print reminder messages.
- Why it matters: This simulates real-time alerts used in modern banking platforms, helping reduce loan defaults.



##  System Design Overview

## Tables Used

| Table     | Description                                                                 |
|-----------|-----------------------------------------------------------------------------|
| `customers` | Stores customer details, age, balance, and VIP status flags                |
| `loans`      | Contains loan amounts, interest rates, due dates, and links to customers  |



##  Logic Design Components

| Component           | Description                                                                     |
|---------------------|---------------------------------------------------------------------------------|
| PL/SQL Control Flow | Loops over customers/loans using `FOR` loops                                    |
| Conditional Logic   | Decision-making using `IF` statements                                           |
| Joins               | Links customer and loan information together                                    |
| Transaction Control | Ensures consistency using `COMMIT` after each update                           |
| Output Logging      | Uses `DBMS_OUTPUT.PUT_LINE` to print meaningful logs for each transaction       |



##  File Structure

| File Name                           | Purpose                                                                 |
|-------------------------------------|-------------------------------------------------------------------------|
| `create_tables_and_sample_data.sql` | Creates `customers` and `loans` tables and inserts initial data         |
| `scenario1_discount.sql`            | Applies 1% interest discount for senior citizens                        |
| `scenario2_vip.sql`                 | Flags customers as VIP based on balance                                 |
| `scenario3_reminders.sql`           | Sends reminder messages for upcoming loan due dates                     |



##   Technologies Used

- Oracle SQL / PL/SQL
- Oracle Live SQL Platform
- Compatible with SQL Developer and other Oracle tools



##   How to Run

1. Run `create_tables_and_sample_data.sql` to create tables and insert test data.
2. Execute each scenario file (`scenario1_discount.sql`, etc.) to simulate operations.
3. Make sure DBMS_OUTPUT is enabled to see reminder messages and logs.
