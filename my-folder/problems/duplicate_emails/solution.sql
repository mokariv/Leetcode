# Write your MySQL query statement below
with cteemail as 
(
    select email, count(*) from Person 
    group by email
    having count(*) >1
)
select email as Email from cteemail