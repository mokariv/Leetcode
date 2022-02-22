# Write your MySQL query statement below
with ctecustomers as (
select c.id, c.name, o.customerId 
from Customers as c
left join Orders as o
on c.id = o.customerId
    )
select name as Customers from ctecustomers
where customerId is null