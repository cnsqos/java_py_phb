# DEFAULT와 CHECK 제약조건에 대해서 알아보자
create table TBL_STUDENT(
	id INT primary key,
	name varchar(100),
	major varchar(100),
	gender char(1) not null default 'W',
	birth DATE,
	constraint ban_char check ( gender in ('M','W')),
	constraint ban_date check ( birth >= '1980-01-01')
)

# default : 컬럼에 값이 아예 주어지지 않았을 때 자동으로 들어가는 기본값
# not null : 해당 컬럼에 null값을 허용하지 않겠다

-- FLOWER
-- ----------
-- F_NAME  VARCHAR()(PK)
-- F_COLOR VARCHAR()
-- F_PRICE INT
-- 
-- POT
-- ---------
-- P_ID  INT(PK)
-- P_COLOR VARCHAR()
-- P_SHAPE VARCHAR()
-- F_NAME VARCHAR()(FK)


create table FLOWER(
	F_NAME VARCHAR(100) primary key,
	F_COLOR VARCHAR(100),
	F_PRICE INT
);

create table POT(
	P_ID INT primary key,
	P_COLOR VARCHAR(100),
	P_SHAPE VARCHAR(100),
	F_NAME VARCHAR(100), -- 참조하는 테이블의 컬럼의 크기와 일치해야 한다.
	constraint FOWER_FK foreign key (F_NAME) references FLOWER(F_NAME)
)

grant references on academy_db.* to 'app_user'@'%';

show grants for 'app_user'@'%';

#모든 권한 주기
# grant all privileges on academy_db.* to 'app_user'@'%';
# 공부할때는 편하지만 실제 일할 때는 절대 권장하지 않는다.


-- User
-- ---------
-- id (pk)
-- pw
-- name
-- address
-- email
-- birth
-- 
-- product
-- -------
-- p_id (pk)
-- p_name
-- price
-- count
-- 
-- order
-- --------
-- o_id (pk)
-- o_date
-- id (fk)
-- p_id (fk)

create table user(
	id varchar(100) primary key,
	pw varchar(100),
	name varchar(300),
	address varchar(300),
	email varchar(300),
	birth date
)

create table product(
	p_id varchar(100) primary key,
	p_name varchar(100),
	price int,
	count int
)

create table `order`(
	o_id varchar(100) primary key,
	o_date datetime,
	id varchar(100),
	p_id varchar(100),
	constraint user_fk foreign key(id) references user(id),
	constraint product_fk foreign key(id) references product(p_id)
);


# DML : 데이터를 조작할수 있는 SQL키워드
# SELECT : 데이터를 조회할 수 있는 키워드
# INSERT : 데이터를 추가할 수 있는 키워드
# UPDATE : 데이터를 수정할 수 있는 키워드
# DELETE : 데이터를 삭제할 수 있는 키워드

# 조회
# SELECT 데이터를 보고싶은 속성 FROM 테이블
# 모든 속성을 보고싶다면 * 쓰면 됩니다.

select * from EMPLOYEES;

-- 부서테이블의 모든 정보를 조회하세요.
select 
	d.dept_no ,
	d.dept_name  
from departments d ;

-- 사원테이블에서 사원의 번호와 이름을 조회하세요
select emp_no, first_name from employees;

-- 급여테이블에서 사원번호와, 급여를 조회하세요
select emp_no,salary from salaries s;

-- 조건식(where 절)
-- 내가 원하는 자료를 조회하기 위한 식
-- from 뒤에 작성을 한다.
-- 컬럼명 비교연산자 값

-- employees테이블에서 성별이 남성인 사원들의 사번과 이름과 성을 조회하세요
select emp_no, first_name, last_name
from employees
where gender = 'M'; # gender컬럼의 데이터가 'M'과 일치하는 데이터만

-- employees테이블에서 1990년 1월 1일 이후에 입사한 사원들의 사원번호, 이름,
-- 입사일을 조회하세요 ex) '1990-01-01'
select emp_no, first_name, hire_date
from employees
where hire_date > '1990-01-01';

-- salaries테이블에서 연봉이 100,000 이상인 사원의 사원번호와 연봉을 조회
select emp_no, salary from salaries s 
where salary > 100000;








