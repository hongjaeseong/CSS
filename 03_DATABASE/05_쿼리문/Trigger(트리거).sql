-- ------------------------------
-- TRIGGER
-- ------------------------------

use shopdb;
-- 01 After Trigger
drop table c_usertbl_bak;
drop table c_usertbl;												-- c_usertbl 있다면 삭제
create table c_usertbl select * from usertbl;						-- c_usertbl의 usertbl의 구조+값 복사
select * from c_usertbl;											-- c_usertbl 확인
create table c_usertbl_bak like c_usertbl;							-- c_usertbl_bak의 c_usertbl의 구조만 복사
select * from c_usertbl_bak;										-- c_usertbl_bak 확인
alter table c_usertbl_bak add column type char(5);					-- type column 추가('수정'인지 '삭제'인지 표시)
alter table c_usertbl_bak add column U_D_date char(5);				-- U_D_date column 추가('날짜' 표시)
alter table c_usertbl_bak change column U_D_date U_D_date datetime;	-- U_D_date column 의 자료형(datetime으로) 변경
desc c_usertbl_bak;
select * from c_usertbl_bak;


delimiter $$
create trigger trg_c_usertbl_update				-- 'trg_c_usertbl_update'트리거 생성
after update									-- update 시 발생하는 after 트리거다
on c_usertbl									-- c_usertbl 대상으로
for each row									-- 각각의 내용을 실행하겠다
begin
	insert into c_usertbl_bak values(
    old.userid,old.name,old.birthyear,old.addr,old.mobile1,old.mobile2,old.height,
    old.mDate,'수정',now()
    );
end $$
delimiter ;

show triggers;									-- trigger 정보 확인
show create trigger trg_c_usertbl_update;		-- trigger 정보 확인

select * from c_usertbl;
select * from c_usertbl_bak;
update c_usertbl set name='바비' where userid='BBK';
update c_usertbl set addr='경남' where userid='EJW';


-- 02 삭제 트리거
delimiter $$
create trigger trg_c_usertbl_delete
after delete
on c_usertbl
for each row
begin
	insert into c_usertbl_bak values(
    old.userid,old.name,old.birthyear,old.addr,old.mobile1,old.mobile2,old.height,
    old.mDate,'삭제',now()
    );
end $$
delimiter ;

select * from c_usertbl;
delete from c_usertbl where userid='KKH';
select * from c_usertbl_bak;

-- buytbl의 c_buytbl의 구조+값복사
-- c_buytbl의 구조만 복사한 c_buytbl_bak 만들기
-- c_buytbl_bak 에 type char(5)와 mDate datetime 을 열로 추가
-- c_buytbl의 update시 c_buytbl_bak에 내용저장되는 trg_c_buytbl_update 트리거 만들기
-- c_buytbl의 delete시 c_buytbl_bak에 내용저장되는 trg_c_buytbl_delete 트리거 만들기