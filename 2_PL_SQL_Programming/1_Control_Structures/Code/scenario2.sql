ALTER TABLE Customers ADD (IsVIP CHAR(1));

BEGIN
  FOR cust IN (SELECT * FROM Customers) LOOP
    IF cust.Balance > 10000 THEN
      UPDATE Customers SET IsVIP = 'Y' WHERE CustomerID = cust.CustomerID;
    ELSE
      UPDATE Customers SET IsVIP = 'N' WHERE CustomerID = cust.CustomerID;
    END IF;
  END LOOP;
END;
/