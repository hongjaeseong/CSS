-- JOIN란
-- ----------------------
-- 두개이상의 테이블을 서로 묶어서 하나의 조회결과를 만드는데 사용

-- ----------------------
-- JOIN 종류
-- ----------------------
-- INNER JOIN	: ON이하의 조건절을 만족하는 행만 JOIN
-- OUTER JOIN	: ON이하의 조건절을 만족하지 않는 행도 JOIN
	-- LEFT OUTER JOIN	: 조건을 만족하지 않는 왼쪽 테이블의 행도 JOIN
    -- RIGHT OUTER JOIN	: 조건을 만족하지 않는 오른쪽 테이블의 행도 JOIN
    -- FULL OUTER JOIN	: 조건을 만족하지 않은 왼/오른쪽 테이블의 행도 JOIN
-- CROSS JOIN	: 한쪽 테이블의 모든행과 반대쪽 테이블의 모든행을 JOIN, 조건절x
-- SELF JOIN	: 한 테이블내에서 JOIN
-- 주로 INNER JOIN과 OUTER JOIN를 사용

-- INNER JOIN
use shopdb;
select * from usertbl;
select * from buytbl;

select * 
from usertbl 
inner join buytbl
on usertbl.userid = buytbl.userid;		-- 구매이력이 있는 고객 정보 전체 조회

-- INNER JOIN 원하는 열만 출력(열이름 중복시 특정테이블의 열이름으로 선택해서 지정한다)
select usertbl.userid,name,addr,mobile1,mobile2,prodname,price,amount
from usertbl 
inner join buytbl
on usertbl.userid = buytbl.userid;		-- 구매이력이 있는 고객 정보 부분 조회

-- INNER JOIN (별칭지정)
select U.userid,name,addr,mobile1,mobile2,prodname,price,amount
from usertbl U
inner join buytbl B
on U.userid = B.userid;

select U.userid,name,addr,mobile1,mobile2,prodname,price,amount
from usertbl U
inner join buytbl B
on U.userid = B.userid
where amount<=2;

-- 문제
select * from usertbl;
select * from buytbl;
-- 1 바비킴의 userID,birthYear,prodName,GroupName 을 출력하세요
select U.userid,birthyear,prodname,groupname 
from usertbl U
inner join buytbl B
on U.userid = B.userid 
where name='바비킴';

-- 2 amount*price 의 값이 100 이상인 행의 name,addr,prodname,mobile1,mobile2를(Concat()함수사용) 출력하세요
select name,addr,prodname,concat(mobile1,'-',mobile2) as '전화번호'
from usertbl U
inner join buytbl B
on U.userid = B.userid 
where amount*price >= 100;

-- 3 groupname이 전자인 행의 userid,name,birthyear,prodname 을 출력하세요
select U.userid,name,birthyear,prodname
from usertbl U
inner join buytbl B
on U.userid=B.userid 
where groupname = '전자';


-- OuterJoin

-- left Outer Join(on 조건을 만족하지 않는 left테이블의 행도 출력)
use shopdb;
select *
from usertbl U
left outer join buytbl B		-- 구매하지 않는 고객도 표시(->구매한 고객과 비교가능)
on U.userid = B.userid;

-- Right Outer Join(on 조건을 만족하지 않는 right테이블의 행도 출력)
use shopdb;
select *
from buytbl B
right outer join usertbl U
on U.userid = B.userid;

-- Full Outer Join(on 조건을 만족하지 않는 left,right테이블의 행도 출력)
-- mysql에서는 full outer join 을 지원하지 않는다
-- 대신 union 을 사용해서 left,right outer join 을 연결한다
select * from usertbl left outer join buytbl on usertbl.userid=buytbl.userid
union
select * from usertbl right outer join buytbl on usertbl.userid=buytbl.userid;

-- 여러 테이블들 JOIN
use classicmodels;
select * from products;
select * from orderdetails;

select P.productCode,productname,quantityOrdered,priceEach,orderDate,O.status
from orderdetails OD
inner join products P
on P.productCode = OD.productCode		-- 주문한 정보의 상세정보
inner join orders O
on O.orderNumber = OD.orderNumber;

-- LEFT OUTER JOIN
-- RIGHT OUTER JOIN
