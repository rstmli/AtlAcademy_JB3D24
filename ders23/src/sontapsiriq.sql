select * from dersler.products ;
select * from dersler.categories;
select * from dersler.customers;
select * from dersler.orders;
select * from dersler.orderdetails;
select * from dersler.products where id = 1;
select products.name, c.name from dersler.products left join dersler.categories c on c.id = products.categories_id
select * from dersler.customers where id = 1;
select f_name,l_name, date from dersler.orders left join dersler.customers c on c.id = orders.customers_id
select product_id, quantity ,date from dersler.orderdetails left join dersler.orders o on o.id = orderdetails.order_id
update dersler.products set name = 'Apple iPhone 16' where id = 4;
insert into dersler.products (name, price, quantity, description, categories_id) values ('Apple iPhone 13',2300,5,'...............',2);
delete from dersler.products where id = 6