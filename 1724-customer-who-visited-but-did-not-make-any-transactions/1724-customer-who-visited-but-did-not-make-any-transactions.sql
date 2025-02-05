# Write your MySQL query statement below
select Visits.customer_id, count(Visits.visit_id) AS count_no_trans
From Visits
Left Join Transactions
ON Visits.visit_id = Transactions.visit_id
where Transactions.transaction_id is NULL
Group by Visits.customer_id;