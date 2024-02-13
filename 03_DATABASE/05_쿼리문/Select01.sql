-- 05 Select Order by
use shopdb;
select * from usertbl order by mDate;		-- mDate 기준으로 오름차순(기본값) 정렬 (권장하지 않음)
select * from usertbl order by mDate desc;  -- mDate 기준으로 내림차순 정렬(권장하지 않음)
select * from usertbl where birthyear >= 1970 order by mDate;
select * from usertbl order by height;		-- 임재범, 이승기 같은 키 but, 내림차순 정렬
select * from usertbl order by height,name;	-- 이승기, 임재범 순으로 변경 (오름차순 정렬)

-- 06 distinct
select addr from usertbl;
select distinct addr from usertbl;			-- 중복된 값을 없애줌(단일행)
select distinct addr,userid from usertbl;	-- 단일행으로 사용하는 것을 권장

-- 07 limit (게시판 만들 때, 어디서부터 어디까지 표시할 지를 지정할 때 사용함)
select * from usertbl;
select * from usertbl limit 3;				-- 인덱스 0,1,2번(3개) 까지 보겠다
select * from usertbl limit 2,3;			-- 2번 인덱스로 부터 3개를 표시

-- 08 복사(테이블 복사)
-- 08-01 구조 + 값 복사()
create table tbl_buy_copy(select * from buytbl);
select * from tbl_buy_copy;
desc tbl_buy_copy;							-- PK, FK는 복사가 안됨

create table tbl_buy_copy2(select userid,prodName,amount from buytbl);		-- 원하는 열만 복사
select * from tbl_buy_copy2;

-- 08-02 구조만 복사(값x, PK o, FK o)
create table tbl_buy_copy3 like buytbl;
select * from tbl_buy_copy3;
desc tbl_buy_copy3;

-- 08-03 데이터만 복사
insert into tbl_buy_copy3 select * from buytbl where amount >= 3;
select * from tbl_buy_copy3;

-- 문제
select * from buytbl;
-- 1 userId 순으로 오름차순 정렬
select * from buytbl order by userid;

-- 2 price 순으로 내림차순 정렬
select * from buytbl order by price desc;

-- 3 amount 순으로 오름차순 prodName으로 내림차순 정렬
select * from buytbl order by amount, prodname desc;

-- 4 prodName을 오름차순으로 정렬 시 중복 제거
select distinct prodname from buytbl order by prodname;

-- 5 userId 열의 검색 시 중복된 아이디 제거하고 select
select distinct userid from buytbl;

-- 6 구매량(amount)가 3이상인 행을 prodName 내림차순으로 정렬
select * from buytbl where amount >= 3 order by prodname desc;

-- 7 usertbl의 addr가 서울, 경기인 값들을 CUsertbl에 복사
select * from usertbl where addr in ('서울', '경기');
create table CUsertbl(select * from usertbl where addr in ('서울', '경기'));
select * from cusertbl;
desc cusertbl;






