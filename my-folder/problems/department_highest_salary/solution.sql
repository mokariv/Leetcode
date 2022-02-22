# Write your MySQL query statement below
with ctesalary as (
select e.name as Employee, e.salary, d.name as Department, dense_rank() over(partition by e.departmentId order by e.salary desc) rank1
from Employee as e, Department as d
where e.departmentId = d.id
)
select Employee, Department, salary 
from ctesalary 
where rank1 =1

    
