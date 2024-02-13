-- ----------------------------------
-- TRANSACTION
-- ----------------------------------
-- 데이터베이스의 상태를 변환시키는 작업 단위

-- ----------------------------------
-- 트랜잭션 성질
-- ----------------------------------
-- 원자성
-- 일관성
-- 독립선, 격리성
-- 영속성, 지속성

-- mysql에서 하나의 쿼리 당 하나의 커밋을 함 -> 이를 아래와 같이 취소할 수 있음
insert into tbl_a values(5,10,11);		-- auto commit false
insert into tbl_a values(1,2,3);		-- auto commit false
update tbl_a set name=123 where a=4;	-- auto commit false
-- 작업 단위를 하나로 묶음 -> transaction
-- 중간에 오류가 생기면 처음의 작업 이전의 상태로 복귀 -> rollback
-- 예를 통해 알아보는 transaction의 필요성에 대해 검색해보기!!!

-- 트랜잭션 예제
create table tbl_tx(
	no int primary key,
    name varchar(20),
    age int,
    gender char(1)
);

insert into tbl_tx values(1, 'aa', 55, 'W');
insert into tbl_tx values(2, 'bb', 44, 'M');
select * from tbl_tx;

start transaction;		-- transaction 예약어 : auto commit이 사라짐/주로 예외처리와 함께 사용됨
	insert into tbl_tx values(3, 'cc', 55, 'W');
	insert into tbl_tx values(4, 'dd', 55, 'W');
	insert into tbl_tx values(5, 'ee', 55, 'W');
	rollback;		-- 전체 롤백 : 커밋하기 전 시점으로 돌아감
    commit;
    
start transaction;
	savepoint s1;
	insert into tbl_tx values(3, 'cc', 55, 'W');
	insert into tbl_tx values(4, 'dd', 55, 'W');
	savepoint s2;		-- rollback 하는 위치를 설정
    insert into tbl_tx values(5, 'cc', 55, 'W');
	insert into tbl_tx values(6, 'dd', 55, 'W');
	savepoint s3;
	insert into tbl_tx values(7, 'cc', 55, 'W');
	insert into tbl_tx values(8, 'dd', 55, 'W');
    rollback to s2;		-- savepoint s2 시점으로 rollback
    commit;
    
select * from tbl_tx;


-- 예외처리(트랜잭션과 함께 사용)
delete from tbl_tx;		-- table 비워주어서 세팅 완료
select * from tbl_tx;

drop procedure Tx_test;
delimiter $$
create procedure Tx_test()
begin
	declare continue handler for SQLEXCEPTION		-- 예외 처리를 하는 핸들러를 등록한다는 의미
    begin
		show errors;								-- 에러를 표시함
        rollback;
    end;
	
    start transaction;
		insert into tbl_tx values(1, 'dd', 55, 'W'); -- SQL
        insert into tbl_tx values(2, 'dd', 55, 'W'); -- SQL
        insert into tbl_tx values(2, 'dd', 55, 'W'); -- SQL, 여기서 primary 중복 에러 발생
    commit;

end $$
delimiter ;

call Tx_test();
select * from tbl_tx;









