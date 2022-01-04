/* Write your T-SQL query statement below */
with cte as(
select e.id, e.name, e.salary, e.departmentId, dense_rank() over (partition by e.departmentId order by e.salary desc) as rank
from employee e
)

select d.name as Department, c.name as Employee, c.salary from cte c
join department d 
on c.departmentId = d.id
where rank = 1