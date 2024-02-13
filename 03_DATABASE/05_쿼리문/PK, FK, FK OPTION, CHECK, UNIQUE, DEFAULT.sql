-- 제약조건

-- PK
create table tbl_a(
	id int primary key,
    name varchar(45)
);
desc tbl_a;
insert into tbl_a values(2, '홍길동');
insert into tbl_a values(1, '홍길동');
select * from tbl_a;

create table tbl_b(
	id int,
    name varchar(45) not null,
    primary key(id)
);
desc tbl_b;

create table tbl_c(
	id int,
    name varchar(45) not null,
    primary key(id,name)
);
desc tbl_c;

-- table의 정보 확인
select * from information_schema.columns where table_schema='shopdb' and column_key='PRI';

-- 제약조건 추가&삭제
create table tbl_d(
	id int,
    name varchar(45) not null
);
desc tbl_d;
-- PK 추가  --> alter table 테이블명 add constraint PK명 primary key(PK 설정할 column);
alter table tbl_d add constraint PK_tbl_d primary key(id,name);
desc tbl_d;

-- PK 삭제
alter table tbl_d drop primary key;
desc tbl_d;

-- 문제
-- buytbl을 buytbl_copy로 구조+데이터 복사(create table+select 이용)하고 num를 primary key로 설정해보세요
create table buytbl_copy(select * from buytbl);
select * from buytbl_copy;
desc buytbl_copy;
alter table buytbl_copy add constraint PK_buytbl_copy primary key(num);
desc buytbl_copy;


-- FK
create table tbl_a(
	id int primary key,
    name varchar(45)
);
desc tbl_a;
-- table 생성할 때 외래키 설정 --> constraint 외래키명 foreign key(외래키열명) references tbl_a(기본키열명)
create table tbl_b(
	num int primary key,
    tbl_a_id int,
    name varchar(45),
    constraint fk_tbl_b_tbl_a foreign key(tbl_a_id) references tbl_a(id)
);
desc tbl_b;


-- FK Options(기본 키 열의 값이 변경 되었을 때 외래키 열의 값을 어떻게 설정할 것인가에 대하여)
-- RESTRICT		:	PK,FK 열의 값의 변경 차단
-- CASECADE		:	PK 열의 값 on Update , on Delete 이 변경 시 FK 열의 값도 함께 변경
-- SET NULL		:	PK 열의 값이 변경 시 FK 열의 값을 NULL로 설정
-- SET DEFAULT	:	PK 열의 값이 변경 시 FK 열의 값을 Default로 설정된 기본값을 적용
-- NO ACTION	:	PK 열의 값이 변경 시 FK 열의 값을 변경되지 않음으로 설정

-- workbench에서 설정한 후 (기본 키 열의 값이 변경 되었을 때 외래키 열의 값이 어떻게 변경되는지 확인하는 과정을 진행함  restrict, cascade, set null 이 세가지를 확인함)

create table tbl_c(
	num int primary key,
    tbl_a_id int,
    name varchar(45),
    constraint fk_tbl_c_tbl_a foreign key(tbl_a_id) references tbl_a(id)
    on update cascade
    on delete set null
);

-- 문제
-- buytbl을 copy_buytbl로 구조 + 데이터 복사 이후
create table copy_buytbl(select * from buytbl);
-- num를 PK 설정
alter table copy_buytbl add constraint PK_copy_buytbl primary key(num);
desc copy_buytbl;
-- userid를 FK 설정(on delete restrict on update cascade)
alter table copy_buytbl add constraint fk_copy_buytbl_usertbl foreign key(userid) references usertbl(userid)
on update cascade
on delete restrict;
desc copy_buytbl;


-- UNIQUE(중복허용x, NULL 0) - Email 등록
create table tbl_a
(
	id int primary key,
    name varchar(45),
    email varchar(100) unique
);
desc tbl_a;
create table tbl_b
(
	id int primary key,
    name varchar(45),
    email varchar(100),
    constraint uk_email unique(email)
);
desc tbl_b;
create table tbl_c
(
	id int primary key,
    name varchar(45),
    email varchar(100)
);
desc tbl_c;
alter table tbl_c add constraint uk_tbl_c_email unique(email);
desc tbl_c;
drop table tbl_c;
alter table tbl_c drop constraint uk_tbl_c_email;
desc tbl_c;


-- CHECK
create table tbl_d
(
	id int primary key,
    name varchar(50),
    age int check(age>=20 and age<=50),
    addr varchar(5),
    constraint CK_ADDR check(addr in('대구','부산','대전')) 
);
desc tbl_d;			-- 여기선 제약조건 확인안됨
select * from information_schema.check_constraints;			-- check 제약조건 확인

-- CHECK 제약조건 삭제
alter table tbl_d drop check CK_ADDR;
select * from information_schema.check_constraints;


-- DEFAULT
create table tbl_e
(
	id int primary key,
    name varchar(45) default '이름없음',		-- default 값 설정
    addr varchar(100)
);
desc tbl_e;

insert into tbl_e values(1, '홍길동',null);
insert into tbl_e(id) values(2);
select * from tbl_e;

drop table tbl_e;
create table tbl_e
(
	id int primary key,
    name varchar(45) default '이름없음',		-- default 값 설정
    addr varchar(100)						-- create table 외에서 default 값 설정을 위해 column 추가
);
desc tbl_e;

alter table tbl_e alter column addr set default '대구';
desc tbl_e;

insert into tbl_e values(1, '홍길동',null);
insert into tbl_e(id) values(2);
select * from tbl_e;

alter table tbl_e alter column addr drop default;
desc tbl_e;

insert into tbl_e(id) values(3);		-- default값 설정 시에만 해당 코드 블록 실행 가능
select * from tbl_e;
		


