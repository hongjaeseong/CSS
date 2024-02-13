-- Function : 기능
-- Method : 함수
-- 함 + 수
-- 공간에 담다 + Data (선저장 후처리)
-- => 수를 받아서 처리하는 논리적 공간
-- ---------------------------
-- 프로그램이란(program)?
-- 접두사 pro : 앞으로
-- gram : 문서, 도해
-- program : 앞으로 실행되어질 계획
-- ---------------------------
--  Stored Procedure
-- ---------------------------
-- 데이터베이스에서 실행 가능한 저장 프로그램
-- SQL문들의 논리적인 묶음
-- Function(함수)와 유사한 특정부분에서의 차이점이 존재한다.

-- ---------------------------
-- Stored Procedure 와 Function 과의 공통점
-- ---------------------------
-- 01 재사용성
-- 02 모듈화
-- 03 매개변수의 존재
-- 04 흐름제어 처리(if,case,while 사용가능)
-- 05 트랜잭션 처리
-- 06 커서사용
-- 07 반환값 존재
-- 08 동적 SQL문 실행가능(prepare - execute)

-- ---------------------------
-- Stored Procedure 와 Function 과의 차이점
-- ---------------------------
-- 반환값 
	-- 프로시저에서는 반환값이 필수는 아니다
    -- 함수에서는 항상 값을 반환한다
    
-- 허용되는 문맥
	-- 프로시저는 SELECT,INSERT,UPDATE,DELETE문과 같은 SQL문 내에서 직접호출 가능
    -- 함수는 주로 SELECT 문이나 WHERE절에서 호출되어 사용, SQL문에서 직접호출되는 경우가 적음

-- 트랜잭션
	-- 프로시저 : 트랜잭션 내에서 여러 SQL문을 실행할 수 있다
    -- 함수 : 주로 읽기 전용 작업에 사용되며, 트랜잭션에서 변경 사항을 가지지 않도록 설계
    
-- 예외처리
	-- 프로시저 : 프로시저 내에서 예외처리 가능
    -- 함수 : 예외처리도 가능하지만 주로 SELECT문을 사용하기 때문에(조회) 예외처리를 적용하는 경우가 적음
    
-- ---------------------------
-- 예제 01
-- ---------------------------
-- 프로시저 생성
delimiter $$
create procedure pro1()        -- 매개변수를 받지 않아도 됨 Ex) 동전을 안 넣어도 나오는 커피 자판기
begin 
	-- 변수 선언
    declare var1 int;
    -- 값 삽입
    set var1 = 100;
    -- if문(조건절=분기(나눠처리)문)
    if var1 = 100 
		then
			select 'var1 은 100 입니다';
        else
			select 'var1 은 100 아닙니다';
	end if;

end $$
delimiter ;

-- 프로시저 확인
show procedure status where db='shopdb';

-- 프로시저 실행
call pro1();

-- ----------------------------
-- 02 파라미터
-- ----------------------------
-- 프로시저 생성
delimiter $$
create procedure pro2(in param int)        -- (외부로부터) 매개변수를 받는 경우
begin
	
    -- if문(조건절=분기(나눠처리)문)
    if param = 100 
		then
			select param,'은 100 입니다';
        else
			select param,'은 100 아닙니다';
	end if;

end $$
delimiter ;
-- 프로시저 실행 (재사용성)
call pro2(105);
call pro2(100);
call pro2(99);

-- 예제 03
delimiter $$
create procedure pro3(in amt int)        
begin	
    select * from buytbl where amount>=amt;
end $$
delimiter ;

call pro3(4);
call pro3(6);
-- 예제 04
delimiter $$
create procedure pro4(in amt int,in isGt int)        
begin	
    if isGt != 0
		then
			select * from buytbl where amount>=amt;
		else
			select * from buytbl where amount<=amt;
	end if;
end $$
delimiter ;

call pro4(5,0);
call pro4(5,1);

-- 예제 05 (총구매액 평균과 비교해보기)
-- 프로시저 생성
delimiter $$
create procedure pro5()        
begin	
	declare avg_total_price int;
    set avg_total_price = (select avg(amount*price) from buytbl);
    select *,price*amount as '구매총액',if(price*amount>=avg_total_price,'평균이상','평균이하') as '평균이상/이하' from buytbl;
end $$
delimiter ;

-- 프로시저 삭제
drop procedure pro5;

-- 프로시저 실행
call pro5();

-- 밖에서 매번 하는 법 (프로시저로 만들면 반복 작업 최소화)
select * from buytbl;
select avg(amount*price) from buytbl;		-- 총구매액 평균: 291.6667
set @avr=(select avg(amount*price) from buytbl);

select *,price*amount as '총구매액',if(price*amount>=@avr,'평균이상','평균이하') as '평균이상/이하' from buytbl;

-- 문제 01
-- usertbl에서 출생년도를 입력받아 해당 출생년도보다 나이가 많은 행만 출력
-- birthyear열을 이용
-- 프로시저명 : older (in param int)
select * from usertbl;
-- 프로시저 생성
\delimiter $$
create procedure older(in param int)        
begin	
	select * from usertbl where birthyear <= param;
end $$
delimiter ;
-- 프로시저 실행
call older(1997);
call older(1970);

-- 문제 02
-- 가입일수와 가입연도를 가입일로부터 지난일 구하기
-- 가입일로부터 지난날짜 확인
-- select curdate();   -- 현재 날짜(YYYY-MM-DD)
-- select now();       -- 현재 날짜시간
-- select curtime();   -- 현재 시간
-- select *,ceil(datediff(curdate(),mDate)/365) from usertbl;     -- ceil() : 인수로 전달된 숫자를 올림해서 반환
-- DATEDIFF() 함수는 두 날짜 사이의 차이를 일 단위로 계산하는 MySQL의 내장 함수이다. 이 함수를 사용하여 두 날짜 간의 날짜 차이를 계산할 수 있다
-- 프로시저 생성
delimiter $$
create procedure ser_year()
begin
	select *,curdate() as '현재날짜',ceil(datediff(curdate(),mDate)) as '가입일수',ceil(datediff(curdate(),mDate)/365) as '가입연수' from usertbl;
end $$
delimiter ;
-- 프로시저 삭제
drop procedure ser_year;
-- 프로시저 실행
call ser_year();

-- 문제 03 만나이 계산하기

-- -------------------------
-- 인자 2개
-- -------------------------

delimiter $$
create procedure pro6(in arg1 int, in arg2 int)
begin
	select * from usertbl where height between arg1 and arg2;
end $$;
delimiter ;

call pro6(170,180);

-- -------------------------
-- 인자 3개   인자 : 외부에서 주는 값 / 매개변수 : 내부에서 인자를 받을 공간
-- -------------------------
delimiter $$
create procedure pro7(in arg1 int, in arg2 int, in arg3 int)
begin
	select 
	*,
	case
		when amount >= arg1 then 'VIP'
		when amount >= arg2 then '우수'
		when amount >= arg3 then '일반'
		else '구매없음'
	end as 'GRADE'
	from buytbl;
    
end $$;
delimiter ;

call pro7(5,3,1);

select 
*,
case
	when amount >= 10 then 'VIP'
    when amount >= 5 then '우수'
    when amount >= 1 then '일반'
    else '구매없음'
end as 'GRADE'
from buytbl;


-- ----------------------------
-- 프로시저 + 반복문					흐름제어 <- 조건식이 선행이 되어야 함(조건에 따라 반복되거나 중지되거나 이러한 흐름에 대한 기준이 됨) -> 분기, 반복
-- ----------------------------

delimiter $$
create procedure proc_while_01()
begin
	-- Hello World를 10회 반복 출력
    declare i int;
    set i = 1;
    while i<=10 do
		select "Hello World";
        set i=i+1;
	end while;
end $$;
delimiter ;

call proc_while_01();		-- grid가 10번 반복


delimiter $$
create procedure proc_while_02(in n int)
begin
	-- Hello World를 10회 반복 출력
    declare i int;
    set i = 1;
    while i<=n do
		select "Hello World";
        set i=i+1;
	end while;
end $$;
delimiter ;

call proc_while_02(3);		-- grid가 n번 반복

-- 1-10합
delimiter $$
create procedure proc_while_03()
begin
	declare i int;
    declare sum int;
    set i = 1;
    set sum = 0;
    
    while i<=10 do
		set sum=sum+i;
        set i=i+1;
	end while;
    select sum as '1부터 10까지의 합';
    
end $$;
delimiter ;

call proc_while_03();

-- 1-N 합
delimiter $$
create procedure proc_while_04(in n int)
begin
	declare i int;
    declare sum int;
    set i = 1;
    set sum = 0;
    
    while i<=n do
		set sum=sum+i;
        set i= i+1;
	end while;
    select sum as '1부터 n까지의 합';
end $$;
delimiter ;

call proc_while_04(10);

-- N-M합(N<M)
delimiter $$
create procedure proc_while_05(in n int, in m int)
begin
	declare i int;
    declare sum int;
    declare tmp int;
    
    -- n>m일때, 스왑해줌
    if n>m
		then
			set tmp = n;
            set n = m;
            set m = tmp;
	end if;
    
    set i = n;
    set sum = 0;
    
    while i<=m do
		set sum=sum+i;
        set i=i+1;
    end while;
    select sum as 'n부터 m까지의 합';
end $$;
delimiter ;

call proc_while_05(8,5);
drop procedure proc_while_06;

-- 풀이1) 구구단 2단 출력 (반복문은 항상 규칙이 있다. 코딩을 하기 전 규칙을 찾는 게 우선이다. 머리 아프기 싫다면..)	
delimiter $$
create procedure proc_while_06()
begin
	declare i int;
    set i = 1;
    
    while i<10 do
	 	select concat(2,'*',i,'=',2*i) as '구구단 2단';
        set i=i+1;
	end while;
    
end $$;
delimiter ;

call proc_while_06;

-- 풀이2) 구구단 2단 출력(한 개의 table에 표시)
drop table googoodan;
create table googoodan(
	dan int ,
    i int ,
    result int
);
select * from googoodan;

delimiter $$
create procedure proc_while_06()
begin
	declare i int;
    set i = 1;
    
    while i<10 do
	 	insert into googoodan values(2,i,2*i);
        set i=i+1;
	end while;
    
end $$;
delimiter ;

call proc_while_06;
select * from googoodan;

-- 구구단 N단 출력(N<=9) 풀이 보기
drop procedure proc_while_07;
delimiter $$
create procedure proc_while_07(in n int)
begin
	declare i int;
    set i = 1;
    
    while i<10 do
	 	insert into googoodan values(n,i,n*i);
        set i=i+1;
	end while;
    select * from googoodan;
end $$;
delimiter ;

call proc_while_07(7);





