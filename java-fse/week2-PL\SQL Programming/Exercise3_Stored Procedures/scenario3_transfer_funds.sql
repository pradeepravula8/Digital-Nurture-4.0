CREATE OR REPLACE PROCEDURE TransferFunds(
    from_acct_id IN NUMBER,
    to_acct_id IN NUMBER,
    amount IN NUMBER
) IS
    from_balance NUMBER;
BEGIN
    SELECT balance INTO from_balance FROM accounts WHERE account_id = from_acct_id;

    IF from_balance >= amount THEN
        UPDATE accounts
        SET balance = balance - amount
        WHERE account_id = from_acct_id;

        UPDATE accounts
        SET balance = balance + amount
        WHERE account_id = to_acct_id;

        DBMS_OUTPUT.PUT_LINE('Transferred ' || amount || ' from Account ' || from_acct_id || ' to Account ' || to_acct_id);
    ELSE
        DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient balance in Account ' || from_acct_id);
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Account not found.');
END;
/


--To run the Procedure
BEGIN
    TransferFunds(1001, 1003, 2000);
END;
/