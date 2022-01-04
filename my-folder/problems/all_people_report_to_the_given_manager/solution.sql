/* Write your T-SQL query statement below */
select e1.employee_id from employees e1
left join employees m1 on e1.manager_id = m1.employee_id
left join employees m2 on m1.manager_id = m2.employee_id
left join employees m3 on m2.manager_id = m3.employee_id
where m3.employee_id = 1 and m3.employee_id != e1.employee_id