# product 테이블 만들기
# 정수형 타입의 id (기본키)
# 문자 타입의 name
# 문자 타입의 카테고리
# 정수 타입의 가격
# 정수 타입의 재고

create table product(
	id int primary key,
	name varchar(100),
	category varchar(100),
	price int,
	stock int
)

# product 테이블에 데이터 10개 추가하기
# id : 1, 제품명 : 노트북,	카테고리 : 전자제품,	가격 : 1200000, 	재고: 5
# id : 2, 제품명 : 키보드,	카테고리 : 전자제품,	가격 : 45000, 	재고: 20
# id : 3, 제품명 : 마우스,	카테고리 : 전자제품, 	가격 : 170000, 	재고: 50
# id : 4, 제품명 : 의자,	카테고리 : 가구, 	가격 : 350000, 	재고: 15
# id : 5, 제품명 : 책상,	카테고리 : 가구, 	가격 : 1700000, 	재고: 7
# id : 6, 제품명 : 텀블러,	카테고리 : 생활용품, 	가격 : 50000, 	재고: 80
# id : 7, 제품명 : 물병,	카테고리 : 생활용품, 	가격 : 3000, 		재고: 120
# id : 8, 제품명 : 청소기,	카테고리 : 전자제품, 	가격 : 1900000, 	재고: 10
# id : 9, 제품명 : 커피머신,	카테고리 : 전자제품, 	가격 : 3000000, 	재고: 3
# id : 10,제품명 : 캠핑의자,	카테고리 : 레저, 	가격 : 270000, 	재고: 40

insert into product (id, name, category, price, stock)
values
	(1,'노트북','전자제품','1200000',5),
	(2, '키보드', '전자제품', 45000, 20),
	(3, '마우스', '전자제품', 28000, 50),
	(4, '의자', '가구', 98000, 15),
	(5, '책상', '가구', 159000, 7),
	(6, '텀블러', '생활용품', 12000, 80),
	(7, '물병', '생활용품', 8000, 120),
	(8, '청소기', '전자제품', 230000, 10),
	(9, '커피머신', '전자제품', 350000, 3),
	(10, '캠핑의자', '레저', 27000, 40);

# 전자제품 데이터만 조회하기
select * from product p
where p.category = '전자제품';

# 가격이 10만원 이상인 제품을 조회하세요
select * from product where price >= 100000;
# 재고가 10개 미만인 상품의 이름과 재고를 조회하세요
select name,stock -- 내가 조회하고싶은 속성
from product
where stock < 10;
# 카테고리가 가구인 상품을 조회하세요
select * from product p
where p.category = '가구';

# and : 두 조건을 만족해야 한다.
# or : 둘 중 하나의 조건만 만족하면 된다.

# 카테고리가 전자제품이고 가격이 30만원 이상인 제품을 조회하세요
select *
from product
where category='전자제품' and price >= 300000;

# 카테고리가 생활용품이면서 재고가 50개 이상인 상품을 조회하세요
select *
from product
where category='생활용품'and stock >= 50;

# employees테이블에서 1985년 한 해 동안 입사한 사원의 사번, 이름 입사일을 조회하세요
select emp_no, first_name, hire_date
from employees e
where hire_date >= '1985-01-01' and hire_date <= '1985-12-31';

# 컬럼 between A and B
# A와 B사이의 값을 조회할 때 사용(and랑 같음)
select emp_no, first_name, hire_date
from employees e
where hire_date between '1985-01-01' and '1985-12-31';

-- 현재 급여가 60,000 이상 80,000 이하인 사원의 사번, 급여
select emp_no, salary
from salaries s
where salary between 60000 and 80000;

select * from employees;

# 카테고리가 '전자제품' 또는 '가구'에 해당하는 제품 조회하기
select * from product
where category ='전자제품' or category='가구';

select * from product
where category in ('전자제품','가구');

# 상품명이 노트북, 청소기, 커피머신인 상품을 조회하세요
select *
from product
where name in ('노트북','청소기','커피머신');

# 재고가 5, 10, 15 중 하나와 일치하는 상품을 조회하세요
select *
from product
where stock in(5,10,15);

# 카테고리가 가구 또는 레저가 아닌 상품을 조회하세요
select *
from product
where category not in ('가구','레저');

# 이름이 'M'으로 시작하는 사원들의 사원번호와 이름을 조회하세요
select emp_no, first_name
from employees
where first_name like 'M%';

# 이름이 'd'로 끝나는 사원의 사번, 이름을 조회
select emp_no, first_name
from employees
where first_name like '%d';

# 이름의 첫글자가 M이면서 총 6글자인 사람의 사원번호와 이름을 조회하세요
select emp_no,first_name
from employees
where first_name like 'M_____';

# 이름의 세번째 글자가 'a'인 사원의 사번과 이름을 조회
select emp_no, first_name
from employees
where first_name like '__a%';

# 이름이 H로 시작하면서 6글자 이상인 사원의 사번과 이름을 조회하세요
select emp_no, first_name
from employees
where first_name like 'H_____%';

# 이름에 s가 포함되지 않은 사원들의 사번, 이름을 조회하세요
select  emp_no, first_name
from employees
where first_name not like '%s%';

#과일 테이블 만들기
create table fruit(
	id int primary key,
	name varchar(30),
	price int
)

#여러 데이터 한번에 추가하기
insert into fruit
values
	(1,'사과',3200),
	(2,'바나나',2000),
	(3,'포도',5000);

create table fruit_backup(
	id int,
	name varchar(30)
)

# SELECT해서 얻은 결과를 INSERT
insert into fruit_backup(id, name)
select id,name
from fruit
where price >= 3000;

select * from fruit_backup;


insert into tbl_student (id, name, major, gender, birth)
values (0, '홍길동','컴퓨터공학과','A','1980-01-02');
-- CHECK (gender IN ('M','W'))위반 -> 오류 발생

insert into tbl_student (id, name, major, gender, birth)
values (0, '홍길동','컴퓨터공학과','M','1979-01-02');
-- CHECK (birth >= '1980-01-01') 위반 -> 오류 발생

insert into tbl_student (id, name, major, gender, birth)
values (0, '홍길동','컴퓨터공학과','M','1980-01-02');

select * from tbl_student;

insert into tbl_student (id, name, major, gender, birth)
values (0, '박길동','화학공학과','W','1980-01-02');
-- primary key(id) 위반 -> 이미 id = 0이 있기 대문에 오류 발생

# update : 테이블안에 들어있는 값을 수정하는 키워드
/*
 *update 테이블명 set
 *컬럼명 1 = 값 1,
 *컬럼명 2 = 값 2,
 *where 조건식
 * */

# where을 쓰지 않으면 해당 속성의 값이 모두 새 값으로 바뀌게 된다.

# 데이터베이스도 쿼리를 실행한 결과를 임시저장소에 저장
# 그 다음 commit;을 해야 데이터베이스에 적용
# commit; 된 내용은 되돌릴 수 없다.

# 상품테이블에서 id가 2번인 상품의 가격을 50000으로 수정하세요
update PRODUCT
set PRICE = 50000
where ID = 2;

select * from PRODUCT;

# 카테고리가 '전자제품'인 상품들의 재고를 5씩 증가시키세요
update PRODUCT
set
STOCK = STOCK+5
where CATEGORY = '전자제품';

# 이름이 '의자'로 끝나는 상품의 가격을 30000원으로 설정하세요
update product set
price = 30000
where name like '%의자';
# 카테고리가 '가구'인 상품들의 카테고리를 '인테리어'로 변경하세요
update product set
category = '인테리어'
where category = '가구';
# 가격이 10만원 이하인 상품들의 가격을 10% 인상하세요
update product set
price = price * 1.1;
where price <= 100000;
# id가 1번 또는 8번인 상품의 재고를 20으로 수정하세요
update product set
stock = 20;
where id In(1,8);

update product set
stock = 1;

select * from product;

# id가 1인 제품을 삭제하세요
delete from product
where id=1;

# 가격이 50000미만인 제품을 삭제한다.
delete from product
where price < 50000;

delete from product;

select * from product;

create table product2(
	no int primary key,
	name varchar(100),
	price int,
	p_date date
)

insert into product2 values
(1000, '컴퓨터',100,'2021-04-15'),
(1001, '냉장고',200,'2021-03-29'),
(1002, '에어컨',300,'2020-12-15'),
(1003, '오디오',20,'2020-12-15'),
(1004, '세탁기',60,'2021-04-15');

update product2 set
price = price + 20
where no = 1000;

select * from product2;

delete from product2
where name='세탁기';

select name,price from product2;

#LENGTH(문자열)
#문자열이 몇바이트인지 반환
select 
	LENGTH('ABC'),
	LENGTH('가나다'); #utf8mb4인코딩 방식에서 한글은 글자당 3바이트

#char_length(문자열)
#문자 개수를 반환
#한글, 이모지를 포함해서 실제 글자수를 보고 싶을 때 사용
select
	char_length('abc'),
	CHARACTER_LENGTH('가나다');
	
#upper(문자열)
#문자열을 대문자로 변경
select
	upper('Heello Mysql');

# employees 테이블에서 이름이 5글자 이상인 사람만 조회하세요.
select * from employees
where char_length(first_name) >=5;

# trim()
# 공백을 지워준다.
select trim('   hi   '), LTRIM('   hi'), RTRIM('hi    ');
# 특정 문자 지우기
select trim('x' from 'xxxHElloxxx');

#LPAD(문자열,길이,대체문자열)
#문자열 전체를 길이가 되도록 만들고 빈 공간은 대체문자열로 채운다.
select LPAD('HELLO',10,'*');

#EX) 회원 번호를 5자리로 통일하고 싶을 때
select LPAD(12345,5,0);

#RPAD(데이터, 자릿수, 대체문자열)
#데이터를 왼쪽으로 몰아서 자릿수를 맞추고 빈공간은 대체문자열로 채운다.
select RPAD('SALE',10,'*');

#SUBSTRING(문자열,시작위치,길이)
#문자열을 시작위치부터 길이만큼 잘라서 반환한다.
#시작위치는 1부터 시작
#길이를 생략하면 끝까지 반환한다.
select 
	SUBSTRING('Hello MySQL',1,5),
	substring('Hello MySQL',7),
	substring('Hello MySQL',-5);

# 휴대폰 중간 4자리만 가져오기
# 010-1234-5678
select substring('010-1234-5678',5,4);

#LEFT(문자열,길이), RIGHT(문자열,길이);
#문자열에서 왼쪽/오른쪽에서 원하는 길이만큼 잘라서 반환하는 함수
select
	LEFT('HELLO',2),
	RIGHT('HELLO',2);

#INSTR(전체문자열, 찾을 문자열)
# 찾을 문자열시 시작되는 위치번호
# 위치번호는 1부터 시작
# 못찾으면 0을 반환한다.
select INSTR('HELLO','H');
select INSTR('HELLO','L');
select INSTR('HELLO','LO');
select INSTR('HELLO','X'); -- 없으니까 0을 반환

select INSTR('사과바나나포도','바나나');

# 이메일에서 아이디 부분만 조회하세요
# abc@naver.com
# gildong@gmail.com
# devdoctor@daum.net

create table email(
	email varchar(100)
);

insert into email values 
	('abc@naver.com'),
	('gildong@gmail.com'),
	('devdoctor@daum.net');

select substring(email,1,instr(email,'@')-1)
from email;

#'@naver.com'가 포함된 데이터만 조회하기
select * from email
where instr(email,'@naver.com') > 0;

#CONCAT(문자열,문자열,...)
#여러 문자열을 이어붙이는 함수
#괄호 안에 들어간 문자열들을 순서대로 이어붙인다.
#개수 제한 없이 원하는 만큼 넣을 수 있다.
#문자열이 아닌 숫자도 자동으로 문자열로 변환해서 이어붙인다.
select CONCAT('HELLO','WORLD');
select CONCAT('HELLO',' ','WORLD');

#REPLACE(문자열, 바꾸고싶은 문자열, 치환할 문자열)
select REPLACE('ABCDAB','AB','XY');

select REPLACE('HELLO WORLD',' ','-');

#없는 문자열을 바꾸려고 하면 그대로를 반환한다.
select REPLACE('HELLO','X','Y');

#REPEAT(문자열, 반복횟수)
#같은 문자열을 여러번 반복해서 이어붙이고 싶을 때
select REPEAT('ABC',3);

CREATE TABLE member (
  id INT PRIMARY KEY,
  name VARCHAR(50),
  email VARCHAR(100),
  phone VARCHAR(50),
  nickname VARCHAR(50)
);

INSERT INTO member VALUES
(1, '홍길동', 'gildong@test.com', '010-1234-5678', '길동이'),
(2, '김영희', 'younghee@test.com', '010-999-8888', '영희짱'),
(3, '이철수', 'chulsoo@oldmail.com', '010-7777-3333', '철수'),
(4, 'Jane', 'jane@example.com', '010-1212-3434', NULL);

# 이름과 이메일을 하나의 문자열로 합쳐서 출력하세요
# 예시 : 홍길동-gildong@test.com
select concat(name,'-',email)from member;

# 전화번호에서 하이픈(-)을 모두 제거한 결과를 출력하세요
select replace(phone,'-','')from member;
# 이름을 3번 반복하여 출력하시오
select repeat(name,3)from member;
# 이메일 도메인에서 @test.com을 @school.com으로 변경하기
select email, replace(email, '@test.com','@school.com')
from member;
# 전화번호 앞 3자리는 두고 뒤 숫자는 *로 마스킹하기
# 예 : 010-****-****
select phone, concat(left(phone,3),'-****-****')
from member;

# 이름의 글자 수와 닉네임의 글자수를 구하시오
# 예시 : 홍길동 3글자 길동이 3글자
select name, char_length(name), nickname, char_length(nickname)
from member;

# ABS()
# 절대값을 구해주는 함수
select ABS(-10),ABS(10),ABS(0);

#ROUND(숫자, 자릿수)
#자릿수 양수 -> 소수점 아래 기준
#자릿수 0 또는 생략 -> 정수로 반올림
#자릿수 음수 -> 10, 100단위로 반올림
select
	ROUND(1234.567,2),
	ROUND(1234.567,0),
	ROUND(1234.567),
	ROUND(1234.567,-1),
	ROUND(1234.567,-2);

#FLOOR()
#주어진 숫자보다 작거나 같은 수중 최대값을 준다.
#소수점을 버리고 항상 아래로 내림

select 
	FLOOR(2),
	FLOOR(2.1),
	FLOOR(-2.1);

# TRUNCATE(숫자,자리수)
# 자리수 양 -> 소수점 아래를 버림
# 자리수 0 -> 정수만 남김
# 자리수 음수 -> 10, 100단위로 버림

select
	TRUNCATE(1234.567,2),
	TRUNCATE(1234.567,0),
	TRUNCATE(1234.567,-1);

# CEIL()
# 올림

select 
	CEIL(2),
	CEIL(2.1),
	CEIL(-2.1);

# SIGN()
# 주어진 숫자가 양수인지, 음수인지, 0인지 판단
# 양수면 1, 음수면 -1, 0이면 0으로 반환
select
	SIGN(-23485),
	SIGN(0),
	SIGN(48374);


# MOD()
# 나누기를 했을때 나머지를 구한다.
select 
	MOD(1,3),
	MOD(2,3),
	MOD(3,3),
	MOD(4,3),
	MOD(0,3);
# MySQL에서는 %연산자로도 쓸 수 있다.
select 
	4 % 3,
	10 % 4;

# POWER(밑,지수)
# 제곱을 해주는 함수
select
	POWER(2,1),
	POWER(2,2),
	POWER(2,3),
	POWER(2,0);
	
#RAND()
#0이상 1미만의 난수(실수)를 반환한다.
select RAND();
# 1 ~ 10사이의 난수
select FLOOR((RAND() *10)) + 1;









