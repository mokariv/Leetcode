with cte as (
select o.customer_id, o.product_id, dense_rank() over (partition by customer_id order by count(o.product_id) desc) as rank
from orders o
group by o.customer_id, o.product_id
)

select c.customer_id, c.product_id, p.product_name from cte c
join products p
on c.product_id = p.product_id
where rank = 1