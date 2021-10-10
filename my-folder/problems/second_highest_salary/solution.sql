SELECT
    IFNULL(
        (SELECT DISTINCT Salary FROM Employee
        Order By Salary desc
        Limit 1 Offset 1),
    NULL) AS SecondHighestSalary
