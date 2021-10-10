# Write your MySQL query statement below
Select e.Name as Employee from Employee e
join Employee e2 on e.ManagerId = e2.Id
and e.Salary > e2.Salary