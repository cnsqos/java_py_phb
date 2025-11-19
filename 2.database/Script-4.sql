-- 학생 테이블
CREATE TABLE student (
  id INT PRIMARY KEY,
  name VARCHAR(50)
);

INSERT INTO student (id, name) VALUES
(1, '철수'),
(2, '영희'),
(3, '민수');

-- 수강 테이블
CREATE TABLE enroll (
  id INT PRIMARY KEY,
  student_id INT,
  class_name VARCHAR(50),
  constraint std_fk foreign key (student_id) references student(id)
);


INSERT INTO enroll (id, student_id, class_name) VALUES
(1, 1, '데이터베이스'),
(2, 1, '자바'),
(3, 2, '데이터베이스');


# 1. inner join
# 각 테이블에서 join 조건에 일치되는 데이터만 가져온다.

select * from student;
select * from enroll;


# 수업을 듣고 있는 학생이름과 수업명을 조회하기
select s.name,e.class_name from student s inner join enroll e on s.id = e.student_id;



-- 상품 테이블
CREATE TABLE product (
  id INT PRIMARY KEY,
  name VARCHAR(50),
  price INT
);

INSERT INTO product VALUES
(1, '노트북', 1200000),
(2, '스마트폰', 800000),
(3, '키보드', 50000),
(4, '마우스', 30000),
(5, '모니터', 200000);

-- 주문 테이블
CREATE TABLE order_list (
  order_id INT PRIMARY KEY,
  product_id INT,
  quantity INT,
  order_date DATE,
  FOREIGN KEY (product_id) REFERENCES product(id)
);

INSERT INTO order_list VALUES
(101, 1, 1, '2025-01-01'),
(102, 3, 2, '2025-01-02'),
(103, 2, 1, '2025-01-02'),
(104, 5, 3, '2025-01-03'),
(105, 1, 1, '2025-01-04');


select * from product;
select * from order_list;


# 1. 상품이름과 주문 수량을 조회하세요
select p.name, ol.quantity from product p inner join order_list ol on p.id = ol.product_id;


# 2. 주문된 모든 상품의 상품명, 가격, 주문날짜를 조회하세요
select p.name, p.price, ol.order_date from product p inner join order_list ol on p.id = ol.product_id;


# 3. 상품 이름이 '노트북'인 주문의 주문 id, 주문 수량, 주문 날자를 조회하세요
select ol.order_id ,ol.quantity, ol.order_date from product p inner join order_list ol on p.id = ol. product_id where p.name = '노트북';


# 4. 2025년 1월 2일에 주문된 상품들의 상품 이름과 수량을 조회하세요
select p.name, ol.quantity from product p inner join order_list ol on p.id = ol. product_id where ol.order_date = '2025-01-02';


# 5. 상품명, 수량, 가격, 주문금액(가격x수량)을 함께 출력해주세요
# select 절에서 간단한 연산이 가능하다
select p.name, ol.quantity , p.price, (p.price * ol.quantity) as 가격x수량 from product p inner join order_list ol on p.id = ol. product_id;


# 6. 같은 상품을 2번 이상 주문한 적 있는 상품의 상품명과 총 주문 횟수를 출력하세요
select p.name, count(*) from product p inner join order_list ol on p.id = ol. product_id group by p.name having count(*) >= 2;


# left outer join
# 왼쪽 테이블(기준)은 조건과 상관없이 조회가 되고, 오른쪽 테이블은 매칭되는 것만 조회가 되는 join이다
# from 쪽에 쓰는 테이블이 왼쪽 테이블이 된다.

# 학생테이블과 수강테이블에서 어떤 학생이 어떤 과목을 수강하는지 조회

select * from student;
select * from enroll;

select s.name, e.class_name from student s left outer join enroll e on s.id =e.student_id ;

# 매칭되는 데이터가 없으면 null로 채운다.

# 모든 학생 목록 + 수강내역 -> 수강 안하는 사람은 null로 표시

# 주문을 한 번도 안한 고객 찾기

# 게시판의 게시글에서 댓글이 없는 게시글 찾기

# 상품명과 주문 id를 출력하되, 주문이 없는 상품도 조회해주세요
select p.name, ol.order_id from product p left outer join order_list ol on p.id = ol.product_id;

# 주문이 한 번도 없는 상품의 모든 내용을 조회해주세요
select p.*, ol.order_date from product p left outer join order_list ol on p.id = ol.product_id where ol.order_id is null;


# left outer join 상품별 총 주문 수량을 계산하세요
# 상품명, 총 주문 수량 조회하기

select p.name, sum(ol.quantity) from product p left outer join order_list ol on p.id = ol.product_id group by p.name;

select p.name, ifnull(sum(ol.quantity),0) from product p left outer join order_list ol on p.id = ol.product_id group by p.name;

# ifnull(컬럼명,대체값);

# right outer join
# 오른쪽 테이블을 기준으로 전부 출력하는  join
# join 쪽에 써지는 테이블

select s.name, e.class_name from student s right join enroll e on s.id = e.student_id;


CREATE TABLE color (
  name VARCHAR(20)
);

INSERT INTO color VALUES ('빨강'), ('파랑');

CREATE TABLE size (
  name VARCHAR(20)
);

INSERT INTO size VALUES ('S'), ('M'), ('L');

select * from color;
select * from size;

# 색상과 사이즈의 모든 조합을 만들어보자
# on을 따로 작성하지 않아도 된다.
# 모든 행을 무조건 서로 짝짓는다.
select c.name, s.name from color c cross join size s;


# 옵션 조합 만들기
# 색상, 사이즈의 모든 조합을 미리 만들어보고 싶을 때

# 예약시스템에서 예약 가능한 모든 슬롯 만들기
# 날짜 리스트와 시간 리스트 경우의 수를 다 만든다.

# 주의할 점
# a테이블이 1000개의 행
# b테이블이 5000개의 행
#  1000 x 5000 = 5000000개의 행


create table days (
	id int primary key,
	day_of_week varchar(10)
);

create table time_slots (
	id int primary key,
	time_slot varchar(20)
);


insert into days values
(1,'월'),
(2,'화'),
(3,'수'),
(4,'목'),
(5,'금');

insert into time_slots values
(1, '09:00'),
(2, '10:00'),
(3, '11:00'),
(4, '13:00'),
(5, '14:00');


# days 테이블과 time_slots 테이블을 cross 조인하기
# 월,수,금 요일만 조회하기

select d.day_of_week, ts.time_slot from days d cross join time_slots ts where d.day_of_week in('월', '수', '금');


# self join
# 하나의 테이블을 두 번 불러서 서로 join하는 것

# employee 라는 이름의 테이블 만들기
# id 정수타입 pk
# name 문자열타입 50바이트
# manager_id 정수타입

create table employee(
	id int primary key,
	name varchar(50),
	manager_id int
	);

insert into employee values
(1,'대표',null),
(2,'팀장',1),
(3,'사원a',2),
(4,'사원b',2);

select * from employee;

# 사원의 이름과 해당 사원의 상사의 이름을 조회

select e1.name as 사원이름, e2.name as 상사 from employee e1 left join employee e2 on e1.manager_id = e2.id;

# on vs where
# join은 반드시 on으로 관계를 연결해야 한다.

# 수업이 데이터 베이스인 수강 이력이 있는 학생만 조회
select s.name, e.class_name from student s left join enroll e on s.id = e.student_id where e.class_name = '데이터베이스';

# 모든 학생을 다 보여주되, 수업명은'데이터베이스'가 아니면 null
select s.name, e.class_name from student s left join enroll e on s.id = e.student_id and e.class_name = '데이터베이스';

# 특히 outer join을 할 때 on과 where의 위치에 따라 결과가 달라질 수 있다.

# on : 조인 조건 -> 어떤 기준으로 두 테이블을 연결할지 정하는 절

# where : 조인이 끝난 뒤 결과에서 필요한 행만 골라내는 


#----------------------------
select * from employees
limit 10;


# 직원 이름과 급여 조회 / employees와 salaries 테이블을 JOIN하여 직원의 이름(first_name)과 급여(salary)를 조회하시오.
select e.first_name, s.salary from employees e join salaries s on e.emp_no = s.emp_no;

# 직원 이름과 직책(title) 조회 / - employees와 titles 테이블을 JOIN하여 직원의 이름(first_name), 직책(title)을 조회하시오.
select e.first_name, t.title from employees e join titles t on e.emp_no = t.emp_no;

# 현재 부서와 함께 직원 목록 조회하기
-- 회사 인사팀에서 **현재 어떤 부서에 속해 있는 직원 목록**이 필요하다.
-- 현재 부서 기준: `dept_emp.to_date = '9999-01-01'`
-- 직원 이름(first_name, last_name) + 부서 이름(dept_name)을 JOIN해서 한 줄로 조회하라
select e.first_name, dept_name from employees e join dept_emp de on e.emp_no = de.emp_no join departments d on de.dept_no = d.dept_no where de.to_date = '9999-01-01'; --현재를 의미

# 직원과 상사 이름 조회
#- employees 테이블을 SELF JOIN하여 직원 이름과 그 직원의 상사 이름을 조회하시오.
#- (manager_id가 NULL이면 상사 이름도 NULL)
select from employees e


# 직원 이름과 부서 배정 날짜(from_date) 조회
# employees와 dept_emp를 JOIN하여 직원의 이름(first_name)과 부서 배정 날짜(from_date)를 조회하시오.
select e.first_name, from_date from employees e join dept_emp de on e.emp_no = de.emp_no;


# 사원의 현재 부서 정보를 조회
select e.emp_no, e.first_name, e.last_name, d.dept_name from employees e join dept_emp de on E.emp_no = de.emp_no join departments d on de.dept_no = d.dept_no where de.to_date = '9999-01-01';

# view는 가상의 테이블이다.
# create view 뷰 이름 as select문

create view v_employee_dept as
select e.emp_no, e.first_name, e.last_name, d.dept_name from employees e join dept_emp de on E.emp_no = de.emp_no join departments d on de.dept_no = d.dept_no where de.to_date = '9999-01-01';

select * from v_employee_dept;

# view로 만든 테이블은 insert,update,delete는 안된다.
# 원본테이블이 바뀌면 알아서 같이 수정된다.

# 언제 view를 만드는 것이 좋은가
# 1. 복잡한 join과 조건이 반복될 때
# 2. 비지니스 규칙을 숨겨놓을 때

# employees랑 salaries 테이블을 사용하여 사원번호, 이름, 성, 급여순으로 조회
# 급여는 현재 급여만 조회
# view 이름은 v_employee_sal

create view v_employee_sal as
select e.emp_no, e.first_name, e.last_name, s.salary from employees e join salaries s on e.emp_no = s.emp_no where s.to_date = '9999-01-01';

# 현재 얼마를 받는지 알 수 있지만 그동안 얼마나 받아왔는지는 알 수 없다.
select * from v_employee_sal;


#요구사항
# 1. 현재 소속 부서를 기준으로 사원과 부서 이름을 볼 수 있는 뷰를 만든다
# 2. 사용 테이블은 `employees`, `dept_emp`, `departments`이다
# 3. 조건은 `dept_emp.to_date = '9999-01-01'`인 경우만 포함한다
# 4. 뷰 이름은 `v_emp_dept_current`로 한다
# 5. 이 뷰를 이용해 **부서명이 'Sales'인 사원**만 조회하는 SELECT를 작성한다

create view v_emp_dept_current as
select e.emp_no, e.first_name, e.last_name, d.dept_name from employees e join dept_emp de on e.emp_no = de.emp_no join departments d on de.dept_no = d.dept_no where de.to_date = '9999-01-01';

select * from v_emp_dept_current;

# 부서이름이 marketing인 사람의 모든 정보를 조회하세요

select * from v_emp_dept_current where dept_name = 'marketing';

# `v_employee_dept`와 `v_employee_sal`를 JOIN하여 사번, 이름, 부서명, 급여를 모두 조회하는 새로운 뷰를 만든다
# 뷰 이름은 v_emp_dept_salary
# 뷰를 이용해 부서명이 'Development'인 사원의 사번, 이름, 급여를 조회하는 SELECT를 작성하기

create view v_emp_dept_salary as
select vd.emp_no, vd.first_name, vd.last_name, vs.salary, vd.dept_name from v_employee_dept vd join v_employee_sal vs on vd.emp_no = vs.emp_no;

select * from v_emp_dept_salary;

select * from v_emp_dept_salary where dept_name = 'development';


# 현재를 기준으로 부서별 사원 수를 집계하는 뷰 만들기
# 사용 테이블은 dept_emp, departments
# 뷰 이름은 v_dept_emp_count
# 이 뷰를 이용해 사원 수가 15000명 이상인 부서만 부서명, 인원수를 조회하시오.

create view v_dept_emp_count as
select d.dept_name, count(*) as emp_count from departments d join dept_emp de on de.dept_no = d.dept_no where de.to_date = '9999-01-01' group by d.dept_name;

select * from v_dept_emp_count;

select * from v_dept_emp_count where emp_count >= 15000;

