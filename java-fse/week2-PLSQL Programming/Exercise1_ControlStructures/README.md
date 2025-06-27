# 🔁 PL/SQL Control Structures – Loan Management Scenarios

This project demonstrates the use of PL/SQL control structures to automate real-world banking tasks. Using anonymous PL/SQL blocks, we simulate logic-driven workflows such as applying discounts, promoting VIPs, and generating reminders — all with conditional checks and loops.



##  File Structure

| File Name                        | Description                                                                 |
|----------------------------------|-----------------------------------------------------------------------------|
| `create_tables.sql`              | Creates `loan_customers` and `loan_details` tables and inserts sample data |
| `scenario1_discount_interest.sql`| Reduces interest rates by 1% for senior citizens (age > 60)                 |
| `scenario2_promote_vip.sql`      | Promotes customers to VIP if balance > $10,000                              |
| `scenario3_loan_reminder.sql`    | Prints reminders for loans due in the next 30 days                          |



## 📌 Project Summary

This project showcases how PL/SQL control structures can be used to handle:

-  Business logic decisions (`IF`)
-  Data iteration (`FOR` loops)
-  Table updates (`UPDATE`)
-  Output generation (`DBMS_OUTPUT.PUT_LINE`)



##  Tables Used

### `loan_customers`

| Column         | Description                            |
|----------------|----------------------------------------|
| `customer_id`  | Unique ID for each customer            |
| `customer_name`| Name of the customer                   |
| `age`          | Customer's age                         |
| `balance`      | Customer's account balance             |
| `interest_rate`| Current interest rate on loan          |
| `is_vip`       | Flag to indicate VIP status (TRUE/FALSE)|


### `loan_details`

| Column         | Description                              |
|----------------|------------------------------------------|
| `loan_id`      | Unique ID for each loan                  |
| `customer_id`  | Foreign key linking to loan_customers    |
| `loan_amount`  | Amount of the loan                       |
| `due_date`     | Repayment due date                       |



##  Functional Scenarios

### 🔹 Scenario 1: Interest Discount for Senior Citizens

- File: `scenario1_discount_interest.sql`
- Logic: Loops through all customers and reduces their `interest_rate` by 1% if `age > 60`.


### 🔹 Scenario 2: VIP Promotion Based on Balance

- File: `scenario2_promote_vip.sql`
- Logic: Checks all customers and sets `is_vip = 'TRUE'` if `balance > 10000`.



### 🔹 Scenario 3: Loan Due Reminder

- File: `scenario3_loan_reminder.sql`
- Logic: Scans upcoming loans with `due_date` in the next 30 days and prints a reminder message.


