# Write your MySQL query statement below
select c.name as Customers from customers c
where c.id not in (
select o.CustomerId from orders o
)