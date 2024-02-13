-- 01 변수
-- 변하는 수
-- 수(Data, 자료)는 기본 선저장, 후처리를 원칙으로 한다
-- 저장된 수가 특정상황에 있어 바뀔 가능성이 있는 경우 이 수를 변수라고 한다
use shopdb;
set @var1 = 5;
set @var2 = 4.56;
set @var3 = "가수이름=>";

select @var1;
select @var2;
select @var3;
select @var1+@var2;		-- 형변환

select @var3 as 'TITLE',name,addr from usertbl;

-- LIMIT  에서 변수 사용
set @rowcnt = 4;
prepare sqlQuery01		-- 명령어를 라벨링하는 코드
from 'select * from usertbl order by height limit ?';		-- ? : 변수가 들어갈 공간
--
execute sqlQuery01 using @rowcnt;

-- 형변환
-- -----------------------
-- 연산작업시(Ex 대입연산,비교연산...) 자료형(Data Type)이 불일치시 자료형을 일치시키는 작업
-- 자동형변환(암시적형변환)	: 시스템에 의한 형변환(데이터 손실을 최소화 방향)
-- 강제형변환(명시적형변환)	: 프로그래머에 의한 형병환(프로그램 제작 목적에 따른 ->데이터 손실 우려가 비교적 큼)
select mdate from usertbl;
select cast('2024$01$01' as date);			-- 문자형 자료형 데이터를 날짜형 자료형 데이터로 형변환
select cast('2024@01@01' as date);

select num, 
concat(cast(price as char(10)),'x', cast(amount as char(10)),'=') as '가격x수량' ,
price*amount as '결과값'
from buytbl;

select 100 + 200;
select '100' + 200;
select '100' + '200';
select '100a' + '200';
select 'a100' + '200';		-- 문자가 앞에 있어 숫자로 인식 못함(형변환 실패)
select 'a100' + '200' + '300';
select '10a0' + '200' + '300';
select '100a' + '200' + '300';
select 'a100' + 1;			-- a100 : 0이 됨
-- 숫자 비교연산자의 결과(참,TRUE : 1, 거짓,FALSE : 0)
select 2 > 1;
select 2 > '1';		-- 연산처리 과정에서도 형변환이 일어남	-- 자동형변환(암시적형변환), 강제형변환(명시적형변환)
select 2 > 'abcd';
select 2 > '1abcd';
select 2 > 'ab1cd';
select -1 > 'ab1cd';
select 1 > 2;

select 0 = 'mega';		-- 여기서 = 는 비교연산자 vs set @var1 = 5; 여기서 = 는 대입연산자

-- 문제
-- 1 usertbl의 평균키를 구하라(CAST를 이용, 평균키 정수형으로 형변환할 것)
select cast(avg(height) as signed integer) as '평균키' from usertbl;
-- 2 '2020년 5월 7일' 문자열을 DATE 자료형으로 바꿔서 출력하세요(예:2020-05-07)
select cast('2020@5@7' as date) as 'DATE';
