# Write your MySQL query statement below
select w.Id from Weather w 
join Weather w2 on DATEDIFF(w.RecordDate, w2.RecordDate) = 1 and w.Temperature > w2.Temperature