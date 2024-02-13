-- -----------------------
-- VIEW
-- -----------------------
-- 사용자에게 접근이 허용된 자료만을 제한적으로 보여주기 위한 가상 테이블

use shopdb;
select * from usertbl;
select * from buytbl;

create or replace view view_usertbl
as
select userid, name, concat(mobile1, '-', mobile2) as phone 
from usertbl;

select * from view_usertbl;
-- -------------------------------------
create or replace view view_usertbl2
as
select userid, name, concat(mobile1, '-', mobile2) as phone 
from usertbl
where addr in('서울','경기','경남');

select * from view_usertbl;
show tables;
select * from information_schema.views where table_schema='shopdb';
-- ------------------------------
-- JOIN

select U.userid,addr,concat(mobile1, '-', mobile2) as phone, prodname, amount
from usertbl U
inner join buytbl B
on U.userid = B.userid;

create or replace view view_user_buytbl
as
select U.userid,addr,concat(mobile1, '-', mobile2) as phone, prodname, amount
from usertbl U
inner join buytbl B
on U.userid = B.userid;

select * from view_user_buytbl;
select * from view_user_buytbl where amount >= 5;

-- 쉬는시간에 보완함
create table tbl_a(
	col1 int primary key,
    col2 int
);
create table tbl_b(
	col3 int primary key,
    col4 int
);

create or replace view view_a_b
as
select *
from tbl_a
inner join tbl_b;

select * from view_a_b;
desc view_a_b;
insert into view_a_b(col1,col2) values (1,2);

drop view view_a_b;
drop table tbl_a;
drop table tbl_b;
-- ---------------------------제약조건을 잘 확인해야함, not null인 column이 view로 만들어지지 않았을 때, 해당 view table에 값을 입력하면(insert into) 입력되지 않음.
desc usertbl;

create view view_test
as
select userid,name,birthyear,addr,height from usertbl;

select * from view_test;

insert into view_test values('aaa','에이',1999,'경기',188);
select * from view_test;

-- 문제
-- classicmodels 예시
-- products,orderdetails,orders 에 대한 관계도를 확인해서
-- 열항목이 productname, productvendor, quantityordered, priceeach, orderdate 가 포함된
-- view_product_order을 만들어보세요
-- quantityOrdered가 5이상인 값만 포함되어야 합니다
-- inner join으로 작업합니다.
use classicmodels;

create or replace view view_product_order
as
select productname, productvendor, quantityordered, priceeach, orderdate
from orderdetails OD
inner join products P
on OD.productCode = P.productCode
inner join orders O
on OD.orderNumber = O.orderNumber
where quantityordered >= 25;

select * from view_product_order;
select * from view_product_order where quantityordered >= 95;

desc products;
desc orders;
desc orderdetails;









