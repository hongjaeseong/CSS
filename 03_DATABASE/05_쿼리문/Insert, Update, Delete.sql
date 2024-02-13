-- INSERT
use shopdb;
select * from tbl_buy_copy3;

insert into tbl_buy_copy3 values
(8, 'AAB', '운동화', '의류', 1000, 2),
(9, 'AAB', '운동화', '의류', 1000, 2),
(10, 'AAB', '운동화', '의류', 1000, 2),
(11, 'AAB', '운동화', '의류', 1000, 2);
select * from tbl_buy_copy3;

-- auto_increment
desc tbl_a;
insert into tbl_a(name) values('홍재성');
insert into tbl_a(name) values('김현진');
insert into tbl_a(name) values('아무개');
select * from tbl_a;

insert into tbl_a values(null, '김민수');		-- atuo_increment 부분은 null처리
select * from tbl_a;

delete from tbl_a;
select * from tbl_a;
insert into tbl_a(name) values('홍재성');
select * from tbl_a;

-- auto_increment 초기화
delete from tbl_a;
alter table tbl_a auto_increment=0;
insert into tbl_a(name) values('홍재성');
select * from tbl_a;

-- UPDATE

-- DELETE