# Write your MySQL query statement belows
select s.name from salesperson s
where s.sales_id not in
(
select o.sales_id from orders o 
left join Company c
on o.com_id = c.com_id 
where c.name = 'Red'
    )
