CREATE FUNCTION getNthHighestSalary(@N INT) RETURNS INT AS
BEGIN
     declare @MaxSalary int=null;

     SELECT @MaxSalary= MAX(distinct Salary) 
     FROM (
     SELECT * ,DENSE_Rank()OVER(ORDER BY Salary DESC) Rn
     FROM Employee
     )A
     WHERE Rn=@N
     RETURN @MaxSalary
END