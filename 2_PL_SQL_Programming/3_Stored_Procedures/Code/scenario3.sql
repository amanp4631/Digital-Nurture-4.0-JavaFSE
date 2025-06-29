CREATE OR REPLACE PROCEDURE TransferFunds(
  from_acc IN NUMBER,
  to_acc IN NUMBER,
  amount IN NUMBER
) AS
  insufficient_balance EXCEPTION;
BEGIN
  -- Check balance
  DECLARE current_balance NUMBER;
  BEGIN
    SELECT Balance INTO current_balance
    FROM Accounts
    WHERE AccountID = from_acc;

    IF current_balance < amount THEN
      RAISE insufficient_balance;
    END IF;
  END;

  -- Perform transfer
  UPDATE Accounts SET Balance = Balance - amount WHERE AccountID = from_acc;
  UPDATE Accounts SET Balance = Balance + amount WHERE AccountID = to_acc;

  COMMIT;

EXCEPTION
  WHEN insufficient_balance THEN
    DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient balance.');
    ROLLBACK;
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
    ROLLBACK;
END;
/