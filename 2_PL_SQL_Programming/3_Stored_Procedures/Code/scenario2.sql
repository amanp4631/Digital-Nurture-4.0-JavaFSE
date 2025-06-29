CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  dept IN VARCHAR2,
  bonus_percent IN NUMBER
) AS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * bonus_percent / 100)
  WHERE Department = dept;
  
  COMMIT;
END;
/