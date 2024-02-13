-- select group by
use shopdb;

-- userid별 amount(구매량) 총합
select userid, amount from buytbl;
select userid, sum(amount) as '구매총량' from buytbl group by userid;

-- userid별 amount*price의 총합(sum)
select userid, amount, price from buytbl;
select userid, sum(amount*price) from buytbl group by userid;
select userid, sum(amount*price) as '구매총액' from buytbl group by userid;

-- avg 를 이용
select userid, avg(amount) as '평균구매량' from buytbl group by userid;
select userid, truncate(avg(amount*price),2) as '구매평균액' from buytbl group by userid;		-- truncate : 소수점자리 수 지정

--
select max(height) from usertbl;
select min(height) from usertbl;
-- 가장 큰 키를 가지는 user의 모든 열의 값 확인
select * from usertbl where height=(select max(height) from usertbl);
select * from usertbl where height=(select min(height) from usertbl);
-- 가장 큰 키와 가장 작은 키의 값만 확인
select * from usertbl where 
height=(select max(height) from usertbl) 
or
height=(select min(height) from usertbl);

-- 문제
use shopdb;

-- 1 buytbl에서 userid 별로 구매량(amount)의 합을 출력하세요
select userid, amount from buytbl;
select userid, sum(amount) as '구매량' from buytbl group by userid;

-- 2 usertbl에서 키의 평균값을 구하세요.
select height from usertbl;
select avg(height) as '키의 평균값' from usertbl;
select truncate(avg(height),2) as '키의 평균값' from usertbl;

-- 3 buytbl에서 최대구매량과 최소구매량을 userid와 함께 출력하세요
select userid, amount from buytbl;
select userid, max(amount) as '최대구매량', min(amount) as '최소구매량' from buytbl group by userid;

-- 4 buytbl의 groupname 의 개수를 출력하세요
select groupname from buytbl;
select groupname, count(groupname) from buytbl group by groupname;


-- 문제(classicmodels db로 이동 후 작업하세요)
use classicmodels;

-- 1 customers테이블의 city 를 그룹으로 creditLimit의 평균을 구하세요
select * from customers;
select city, creditlimit from customers;
select city, avg(creditlimit) from customers group by city;

-- 2 orderdetails 테이블의 orderNumber를 그룹으로 quantityOrdered의 총합을 출력하세요
select * from orderdetails;
select ordernumber, quantityordered from orderdetails;
select ordernumber, sum(quantityordered) from orderdetails group by ordernumber;

-- 3 products 테이블의 productVendor를 그룹으로 quantityInStock의 총합을 출력하세요
select * from products;
select productvendor, sum(quantityinstock) from products group by productvendor;


-- 02 select group by + having  (집계된 결과에서 where 절은 사용 불가)
use shopdb;
select userid, sum(amount) as '구매총량' from buytbl group by userid;
select userid, sum(amount) as '구매총량' from buytbl group by userid having sum(amount)>5; -- o
select userid, sum(amount) as '구매총량' from buytbl group by userid having '구매총량'>5; -- x

select userid, truncate(avg(amount*price),2) as '구매평균액' from buytbl group by userid;
select userid, truncate(avg(amount*price),2) as '구매평균액' 
from buytbl
group by userid
having truncate(avg(amount*price),2)>50;

-- 03 select + group by + rollup
select num, groupname, sum(price*amount) from buytbl group by groupname, num with rollup;		 -- 구분합, 총합
select groupname, sum(price*amount) from buytbl group by groupname with rollup;		-- 총합

select userid, addr, avg(height) from usertbl group by addr, userid with rollup;		-- 구분 평균값
select addr, avg(height) from usertbl group by addr with rollup;		-- 전체 평균값
 
-- 문제
-- 1. prodName 별로 그룹화 한 뒤 userid / prodName / price*amount 순으로 출력될 수 있도록 설정
select * from buytbl;
select prodname, sum(price*amount) from buytbl group by prodname;		-- 정답 확인해보기

-- 2. 1번 명령어에서 price*amount 값이 1000 이상인 행만 출력
select prodname, sum(price*amount) from buytbl group by prodname having sum(price*amount) >= 1000; 

-- 3. price 가격이 가장 큰 행과 작은 행의 userid, prodName, price를 출력
select max(price) from buytbl;
select min(price) from buytbl;
select userid, prodname,price from buytbl where
price= (select max(price) from buytbl)
or
price= (select min(price) from buytbl);

-- 4. 다음 행 중에 그룹네임이 있는 행만 출력
SELECT COUNT(groupName) FROM buyTbl;
-- 5. prodName 별로 총합을 구해보세요(Rollup 사용)
select * from buytbl;
select num, prodname, sum(price*amount) from buytbl group by prodname, num with rollup;
SELECT prodName,SUM(price*amount) AS'합계' FROM buyTbl GROUP BY prodName with ROLLUP;

SELECT userid,prodName,SUM(price*amount) AS'총합' FROM buyTbl GROUP BY userid, prodName;
SELECT userid,prodName,SUM(price*amount) AS '총합' FROM buyTbl GROUP BY userid,prodName HAVING SUM(price*amount)>=1000;
SELECT userId,prodName,price FROM buyTbl WHERE price=(SELECT MAX(price) FROM buyTbl) OR price=(SELECT MIN(price) FROM buytbl);
SELECT COUNT(groupName) FROM buyTbl;
SELECT prodName,SUM(price*amount) AS'합계' FROM buyTbl GROUP BY prodName with ROLLUP;