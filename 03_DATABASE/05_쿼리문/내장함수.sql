-- --------------------------
-- 내장함수
-- --------------------------
-- Concat()		: 두 개 이상의 문자열을 결합합니다.
-- Concat_ws()	: 특정 구분자를 이용해 문자를 결합할 수 있음

select concat('hello','-','world');
select concat('hello','-','world',5,6);
select concat_ws("-",'hello','world',5,6);

-- SubString()	: 문자열의 일부분을 추출합니다.

select substring("HELLO WORLD",6);		-- 6 index 부터 마지막 문자까지	-- 띄우기 된 다음 WORLD
select substring("HELLO WORLD",1,6);	-- 1 index 부터 6개 문자

-- SUBSTRING_INDEX(): 찾는 문자열이 n회 등장하면 그 이후 문자열을 버립니다. n이 마이너스면 오른쪽에서 시작합니다.
select substring_index("HELLO MY NAME IS HONG"," ",3);
select userid,substring_index(mDate,'-',2) as '가입연월' from usertbl;

-- LENGTH() : 문자열의 길이를 반환합니다.
select length("Hello World");
select length(lastname) from classicmodels.employees;

-- TRIM([LEADING, BOTH, TRAILING][rem_str] FROM str) : 문자열의 앞/뒤/양쪽에서 지정된 문자열을 제거합니다.	앞뒤 공백 제거
select trim("   HELLO WORLD    ");

-- Replace
-- instr
-- lpad,rpad
-- left,right
-- mid

-- bin,oct,hex
select bin(1);
select bin(2);
select bin(3);
select bin(4);
select bin(5);
select bin(6);
select bin(7);
select bin(8);
select bin(9);
select bin(10);
select bin(11);
select bin(12);
select bin(13);
select bin(14);
select bin(15);
select bin(16);

-- REVERSE()
-- SPACE()
-- REPEAT()
-- FORMAT()

-- 날짜 및 시간 관련 함수
-- CURDATE(), CURTIME(), NOW(), SYSDATE() : 현재 날짜 또는 시간을 반환합니다.
-- YEAR(), MONTH(), DAYOFMONTH(), HOUR(), MINUTE(), SECOND(): 특정 날짜나 시간 단위를 반환합니다.
select Year(mDate) from usertbl;
select now();
select date(now());
select curdate();
select time(now());
select curtime();

-- 문제
-- 현재 날짜시간에서 연,월,일,시,분,초를 각각 추출해내고
-- 다음과 같은 포맷팅으로 출력하세요
-- YYYY#MM#DD-HH|MM|SS
-- 풀이1
select date_format(now(), '%Y#%m#%d-%h|%m|%s');
-- 풀이2
select replace(curdate(),'-','#');
select replace(curtime(),':','|');
select concat(replace(curdate(),'-','#')," ", replace(curtime(),':','|'));

select year(now());
select month(now());
select day(now());
select hour(now());
select minute(now());
select second(now());


