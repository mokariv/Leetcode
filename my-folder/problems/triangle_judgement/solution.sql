# Write your MySQL query statement below
select * ,
(case 
when x + y > z and x+z > y and y+z > x then 'Yes' Else 'No' End) as triangle
from Triangle