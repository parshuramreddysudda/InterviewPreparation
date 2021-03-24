SELECT * FROM  orders 
WHERE NOT ((ord_date ='2012-09-10' 
AND salesman_id>5005) 
OR purch_amt>1000.00);