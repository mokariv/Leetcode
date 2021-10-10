# Write your MySQL query statement below
with cte as(
select count(distinct c.student) as studentnum, c.class from courses c
group by c.class
HAVING COUNT(DISTINCT c.student) >= 5
    )
select class from cte