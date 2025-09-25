# Write your MySQL query statement Products where product_id in ('low_fats' , 'recyclable');
select product_id
from Products
where low_fats = 'Y' and recyclable = 'Y';
