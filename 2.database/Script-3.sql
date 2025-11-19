greatest / least()

select
	greatest(10,20,5),
	least(10,20,5);


CREATE TABLE sales (
  id INT PRIMARY KEY,
  product VARCHAR(50),
  price DECIMAL(10,2),
  quantity INT,
  discount_rate DECIMAL(5,2)  -- 할인율(예: 0.15 → 15%)
);

INSERT INTO sales VALUES
(1, 'Keyboard', 29900, 2, 0.10),
(2, 'Mouse',    15900, 3, 0.05),
(3, 'Monitor',  199000, 1, 0.20),
(4, 'USB',       8900, 10, 0.00),
(5, 'Speaker',  45500, 4, 0.15);


# 각 상품의 price 를 3으로 나눈 나머지를 구하시오.

select mod(price,3) from sales;

# 모든 상품의 discount_rate  를 % 로 표기하기 위해 discount_rate * 100 의 값을 소수점 없이 올림 처리하시오

select *, concat(ceil(discount_rate*100),'%') as discount_percent from sales; # as=별칭

# 각 상품의 총 판매 금액(= price × quantity)을 계산하고, 소수점 아래는 전부 버림하여 출력하시오.

select price * quantity from sales;

# 각 상품의 quantity 를 3으로 나누었을 때 몫을 구하시오.

select floor(quantity/3) from sales;

# 가격을 천 단위로 반올림하여 출력하시오

select *, round(price,-3) from sales;

# 각 상품의 가격의 제곱값을 출력하시오.

select power(price,2) from sales;

# 1에서 100 사이의 난수를 생성하시오.

select floor(rand() *100) + 1 as random_number;


#now()
#현재 시간을 datetime 형태로 날짜 + 시간으로 돌려준다.
#current_timestamp() : now()와 같다.
select now();
select current_timestamp;


#curdate() / current_date
#오늘 날짜를 반환한다.
select curdate();
select current_date;

#curtime() / current_time
select curtime();
select current_time;


#date_add(날짜,interval expr unit);
#interval
#지금부터 뒤에 오는 시간 단위를 기준으로 날짜를 계산 한다.
#interval 5 day -> 5일 이라는 기간
#expr
#더하거나 빼고싶은 숫자값
#unit
#기간의 단위를 넣으면 된다.
# day 일
# week 주
# month 달
# quarter 분기
# year 연도

# date_add
# ~뒤
select
	now(),
	date_add(now(),interval 7 day), # 7일뒤
	date_add(now(),interval 2 month), # 2월 뒤
	date_add(now(),interval 1 year); # 1년 뒤
	
	
# date_sub()
# ~앞
	select
	now(),
	date_sub(now(), interval 7 day),
	date_sub(now(), interval 2 month),
	date_sub(now(), interval 1 quarter),
	date_sub(now(), interval 1 year);
	

# datediff(날짜, 날짜);
# 두 날짜의 차이를 일수로 계산을 한다.
# 날짜1,날짜2로 계산이 된다
select
	datediff('2025-12-31','2025-11-14'),
	datediff('2025-11-14','2025-12-31');


# DATE_fromat(날짜,형식)
# 날짜를 문자열로 바꿔서 출력된다.

select
	date_format(now(),'%Y-%m-%d'),
	date_format(now(),'%Y-%m-%d %h:%i:%s'),
	date_format(now(),'%Y년 %m월 %d일');


# 자주 쓰는 포맷 기호
# %Y : 4자리 년도(2025)
# %y : 2자리 년도(25)
# %m : 2자리 월(01~12)
# %M : 글자로된 월(January ~ December)
# %d : 2자리 일(01~31)
# %H : 24시간 형식의 시간(00~23)
# %i : 분(00~59)
# %s : 초(00~59)
# %w : 요일 이름(Sunday ~ Satuday)


# str_to_date(str, format);
select
	str_to_date('2025-11-17','%Y-%m-%d');

# makedate(년도, 몇번째 날);
select
	makedate(2025,365);

# year(), month(), day()
select	now(),year(now()),month(now()),day(now()); #각각 출력
	
#hour(),minute(),second()
select	now(), hour(now()), minute(now()), second(now());

# dayofweek(날짜)
# 요일 : 1(일)~7(토)
select dayofweek(now());

#dayname(날짜)
# 요일이름을 반환
select dayname(now());

#lastday(날짜)
#마지막 날짜 구하기
select last_day(now());


CREATE TABLE orders (
    id INT PRIMARY KEY AUTO_INCREMENT,
    customer VARCHAR(50),
    order_date DATE,
    ship_date DATE,
    price INT
   );

INSERT INTO orders (customer, order_date, ship_date, price) VALUES
('홍길동', '2025-01-02', '2025-01-05', 30000),
('이몽룡', '2025-01-10', '2025-01-12', 45000),
('성춘향', '2024-12-28', '2025-01-03', 52000),
('김철수', '2025-02-01', '2025-02-03', 15000),
('박영희', '2025-02-10', NULL, 22000);  -- 아직 배송되지 않음


#order_date 컬럼에서 연(year),월(month),일(day)을 추출해서 조회하시오

select customer, year(order_date),month(order_date),day(order_date) from orders;

#배송까지 걸린 일수를 delivery_day 라는 별칭으로 조회하세요 단, 조회되지 않은 주문은 제외한다.

select *, datediff(ship_date,order_date) as deliver_day from orders where ship_date is not null;

# 2025년의 1월의 주문건만 조회하세요

select * from orders where year(order_date) = 2025 AND month(order_date) = 1;

# 모든 주문의 order_date를 기준으로 7일 후를 배송예정일로 계산하여 조회하세요
# 모든 정보 뒤에 배송예정일 컬럼처럼 보이도록 작성하세요

select *, date_add(order_date,interval 7 day) as expect_ship from orders;


# 작년에 주문된 기록만 조회하세요

select * from orders where year(order_date) = 2024;

# 주문된 날의 요일을 출력하세요

select *, dayname(order_date) from orders;



# 집계 함수는 select 절에 일반적인 방법으로는 일반 컬럼들과 함께 사용할 수 없다.
# 학생 점수를 저장한 score 테이블을 먼저 만들고 데이터를 넣는다.
CREATE TABLE score (
  id INT,
  name VARCHAR(30),
  subject VARCHAR(20),
  point INT
);

INSERT INTO score VALUES
(1, '홍길동', '국어', 85),
(2, '김철수', '영어', 90),
(3, '이영희', '수학', 78),
(4, '박민수', '영어', 92),
(5, '최다혜', '국어', NULL);


# COUNT()
# 값의 개수를 반환하는 함수
# count(*) : null을 포함한 모든 행의 개수
# count(컬럼명) : 해당 컬럼에 null 값을 제외한 값이 들어있는 행의 개수

select count(*), count(point), count(name) from score;

#sum()
#null을 제외한 데이터의 총 합을 구한다.
select sum(point) from score;


# avg()
# null을 제외한 데이터의 평균을 구해서 반환

select avg(point) from score;

# max()
# 최대값을 구한다.

select max(point) from score;


# min()
# 최소값을 구한다.

select min(point) from score;

# 집계 함수는 select 절에 일반적인 방법으로는 일반 컬럼들과 함께 사용할 수 없다.



CREATE TABLE employee_salary (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50),
  department VARCHAR(50),
  salary INT,
  bonus_rate DECIMAL(4,2),   -- 보너스율(0.1 = 10%)
  hire_date DATE
);

INSERT INTO employee_salary (name, department, salary, bonus_rate, hire_date) VALUES
('홍길동', '개발팀', 4200000, 0.10, '2020-02-01'),
('김유신', '개발팀', 3800000, 0.15, '2021-03-15'),
('강감찬', '영업팀', 3500000, 0.08, '2019-07-10'),
('이순신', '영업팀', 5000000, 0.20, '2018-11-20'),
('유관순', '인사팀', 3000000, 0.05, '2022-01-05'),
('장보고', '인사팀', 3100000, 0.07, '2023-03-10'),
('신사임당', '개발팀', 4500000, 0.12, '2017-06-25'),
('정약용', '영업팀', 3900000, 0.15, '2020-09-01');



# 전체 직원수 구하기

select count(*) as 전체직원수 from employee_salary;


# 전체 직원의 평균 급여 구하기

select avg(salary) as 평균급여 from employee_salary;

# 개발팀의 총 급여 구하기

select sum(salary) from employee_salary where department = '개발팀';

# 5년 이상 근무한 직원들의 수를 조회하세요

select count(*) from employee_salary where datediff (now(), hire_date) >= 365*5;


# group by
# 데이터를 특정 기준으로 묶어서 요약하는 방법
# 보통 집계함수와 함께 사용이 되는 경우가 많다.


CREATE TABLE sales_prod (
    id INT AUTO_INCREMENT PRIMARY KEY,
    category VARCHAR(20),
    amount INT,
    sale_date DATE
);

INSERT INTO sales_prod (category, amount, sale_date) VALUES
('전자제품', 300000, '2025-01-01'),
('전자제품', 250000, '2025-01-03'),
('생활용품', 15000, '2025-01-02'),
('생활용품', 20000, '2025-01-05'),
('식품', 5000, '2025-01-03');

# 카테고리별 매출의 합계 구하기
select category, sum(amount) from sales_prod group by category;


# 카테고리별 판매 건수
select category, count(*) from sales_prod group by category;


# 월별 매출 합계
select month(sale_date), sum(amount) from sales_prod group by month(sale_date);


# employee_salary 테이블에서 부서별 평균 급여와 최고 급여를 조회

select department, floor(avg(salary)), max(salary) from employee_salary group by department;


# 입사 연도별 직원수
select year(hire_date), count(*) from employee_salary group by year(hire_date);


# 이름에 첫 글자별 직원수
select left(name,1), count(*) from employee_salary group by left(name,1);


# 가장 최근 입사자
select name, hire_date from employee_salary where hire_date = (select max(hire_date) from employee_salary);


# 총 판매금액이 50,000원 이상인 카테고리를 조회하기
select category, sum(amount) from sales_prod group by category having sum(amount) >=50000;


# 판매가 2번 이상 발생한 카테고리만 조회하기
select category, count(*) from sales_prod group by category having count(*) >= 2;


# 카테고리별 평균 결제 금액이 100,000원 이상인 것만 조회하기
select category, avg(amount) from sales_prod group by category having avg(amount) >= 100000;


# employee_salary 테이블에서 인원이 2명 이상인 부서만 조회하세요. 부서명과 인원수를 조회해주세요
select department, count(*) from employee_salary group by department having count(department) >= 2;


# 2020년 이후에 입사한 직원들을 대상으로, 부서별 평균 급여가 4,000,000 이상인 / 부서명, 평균급여 조회
select department, avg(salary) from employee_salary where hire_date >= '2020-01-01' group by department having avg(salary) >=4000000;


# 전체 평균 금액보다 큰 금액 조회
# 전체 평균 금액은 얼마?
select * from sales_prod where amount > (select avg(amount)from sales_prod);


# 평균 금액이 20000 이상인 카테고리만 찾고 그 카테고리에 해당하는 행을 조회

select * from sales_prod where category in (select category from sales_prod group by category having avg(amount) >= 20000);


# any() : 여러 값들 중 하나라도 조건을 만족하면 참
# 전자제품 카테고리의 금액들 중 어느 하나 보다만 큰 금액을 찾고싶다.
# where amount > any (300000,250000);
# amount > 30만 or amount > 25만 둘 중 하나라도 만족하면 참
# all() : 여러 값들 전부에 대해 조건을 만족해야 참

select * from sales_prod where amount > any (select amount from sales_prod where category = '전자제품');


# amount > 30만 and amount > 25만
#카테고리별로 금액이 최대인 행만 올라오는 쿼리
select * from sales_prod where (category,amount) in (select category, max(amount)from sales_prod group by category);

#(category , amount) in (서브쿼리)
# category,amount 쌍이, 서브쿼리에서 나온 (category, max(amount)) 쌍 중 완전히 일치하면 참이다.


# from 절에서 사용되는 서브쿼리 (인라인 뷰)
# select 결과를 가상의 테이블 처럼 from 절에서 사용한다.
# 복잡한 계산 결과를 다시 조회할 때 유용하다.

select category, avg_amount from(select category, avg(amount) as avg_amount from sales_prod group by category) as t;


# 전체 평균 매출보다 높은 매출을 조회하세요
select * from sales_prod where amount > (select avg(amount) from sales_prod);


# employees 테이블에서 가장 늦게 입사한 직원 1명의 정보를 조회하세요
# 가장 늦게 입사한 사람이 누군데? -> 먼저 쿼리로 만들어야함

select * from employees where hire_date = (select max(hire_date) from employees);


# 평균 급여보다 급여를 많이 받는 사원들의 정보를 조회
select * from salaries where salary > (select avg(salary) from salaries);

