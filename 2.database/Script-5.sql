# 정렬
# 조회된 결과를 특정 컬럼을 기준으로 오름차순 또는 내림차순으로 정리하는 기능입니다.
# 오름차순 : ASC, 내림차순 : DESC
# select 컬럼명 from 테이블명 order by 컬럼명
# 오름차순이 기본값이기 때문에 생략이 가능하다.

# product 테이블에서 단가를 기준으로 오름차순 하겠다

select name, price from product order by price desc;


# 한글은 어떻게 정렬이 되는지 살펴보자
# 한글은 가나다순으로 정렬이 된다
 select name from product order by name asc;

# 여러개의 칼럼을 기준으로 정렬할 수도 있다.

select name, category, price from product order by category asc, price desc;

# product 테이블과 order_list를 이용하여
# 제품명, 가격, 주문수량, 총금액 순으로 조회하되 총 금액을 기준으로 내림차순 정렬
# 별칭으로도 정렬이 가능하다.

select p.name, p.price, ol.quantity, p.price*ol.quantity as totalprice from product p join order_list ol on p.id=ol.product_id order by price desc;

select p.name, p.price, ol.quantity, p.price*ol.quantity as totalprice from product p join order_list ol on p.id=ol.product_id order by 1 asc;


# null 데이터가 있을 때 오름차순 시 가장 먼저 나온다.
select * from employee order by manager_id asc;

# null 데이터가 있을 때 내림차순 시 가장 나중에 나온다.
select * from employee order by manager_id desc;

# null 있는 컬럼에서 오름차순으로 정렬하되, null 데이터를 맨 뒤로 보내고 싶다면
select * from employee order by manager_id is null asc, manager_id asc;

# 컬럼명 is null asc -> null값을 뒤로 보내기 위함
# is null 은 조건식이기 때문에, 각 행에 대해서 true/false를 계산한다.
# manager_id 값
# 1 -> false -> 0
# 2 -> false -> 0
# 2 -> false -> 0
# null -> true -> 1


# limit 조회 결과에서 개수를 제한 -> 얘가 맨뒤에옴

# select
# from
# where
# join
# on
# group by
# having
# order by
# limit
# ->해당 순서로 작성
 

CREATE TABLE student (
  id      INT PRIMARY KEY,
  name    VARCHAR(20),
  class   INT,
  age     INT,
  score   INT,
  reg_dt  DATE
);

INSERT INTO student (id, name, class, age, score, reg_dt) VALUES
(1, '김철수', 1, 18, 85, '2025-01-01'),
(2, '이영희', 2, 19, 90, '2025-01-03'),
(3, '박민수', 1, 18, 75, '2025-01-02'),
(4, '최지우', 2, 20, NULL, '2025-01-04'),
(5, '정현우', 1, 21, 95, '2025-01-05');


# 1. 나이를 오름차순으로 정렬하여 전체 정보 조회하기
select * from student order by age asc;

# 2. 점수를 내림차순(null 포함)으로 정렬하여 이름, 점수만 정보 조회하기
select name,score from student order by score desc;

# 3. 점수가 있는 학생만 점수순으로 상위 3명만 이름과 점수를 조회
select name,score from student where score is not null order by score desc limit 3;

# 4. 날짜를 최근 -> 오래된 순으로 모든 정보 조회하기
select * from student order by reg_dt desc;

# 5. null 값을 0으로 바꿔서 오름차순하고 점수가 같으면 나이를 오름차순으로 조회하기
select name, ifnull(score,0), age from student order by score, age asc;

# 윈도우 함수
# 집계함수처럼 그룹별 계산을 하지만, 행을 하나로 묶지 않고 기존 행을 그대로 유지하면서
# 계산 결과를 각 행에 붙이는 함수
# group by -> 행이 줄어든다.
# 윈도우 함수 -> 행이 줄어들지 않는다.
# rank()over()함수

#함수명()over
	#(partition by -> 데이터를 그룹별로 나누는 기준
	 #order by -> 그룹 내에서 정렬기준)


CREATE TABLE sales (
  id INT PRIMARY KEY,
  employee VARCHAR(20),
  amount INT,
  sale_date DATE
);

INSERT INTO sales VALUES
(1, '김철수', 300, '2025-01-01'),
(2, '김철수', 200, '2025-01-02'),
(3, '김철수', 500, '2025-01-03'),
(4, '이영희', 100, '2025-01-01'),
(5, '이영희', 400, '2025-01-02'),
(6, '이영희', 300, '2025-01-03');

-- 정우성
INSERT INTO sales VALUES
(7,  '정우성', 220, '2025-01-01'),
(8,  '정우성', 330, '2025-01-02'),
(9,  '정우성', 410, '2025-01-03'),
(10, '정우성', 280, '2025-01-04');

-- 한지민
INSERT INTO sales VALUES
(11, '한지민', 500, '2025-01-01'),
(12, '한지민', 450, '2025-01-02'),
(13, '한지민', 520, '2025-01-03'),
(14, '한지민', 610, '2025-01-04');

-- 이준호
INSERT INTO sales VALUES
(15, '이준호', 150, '2025-01-01'),
(16, '이준호', 200, '2025-01-02'),
(17, '이준호', 350, '2025-01-03'),
(18, '이준호', 400, '2025-01-04');

select count(*) from sales;

# mysql에서 대표적으로 자주 쓰이는 윈도우 함수

# row_number()
# 각 행에서 1부터 시작하는 버호를 매긴다.

# 직원별 매출 데이터를 날짜 순으로 번호매기기

select employee, amount, sale_date, row_number() over(partition by employee order by sale_date desc) as rn from sales;

#rank() over()
#등수를 매겨준다. (동점이 있으면 등수를 건너뛴다.)

select employee, amount, sale_date, rank()over(partition by sale_date order by amount desc) as rank_no from sales;

select * from sales;

# 날짜 상관 없이 사람별로 총매출순으로 순위 매기기
# 사원명, 총 판매금액, 랭킹 순으로 조회하기
select employee, sum(amount) as total_amount from sales group by employee;

select employee, total_amount, rank()over(order by total_amount desc) as rank_no from (select employee, sum(amount) as total_amount from sales group by employee) as t order by rank_no;

create view emp_rank as
select employee, total_amount, rank()over(order by total_amount desc) as rank_no from (select employee, sum(amount) as total_amount from sales group by employee) as t order by rank_no;

select * from emp_rank;

# sum() over()
# 누적합계

select employee, amount, sum(amount) over(partition by employee order by sale_date) as running_total from sales;


# partition by vs group by
# group by -> 행이 합쳐진다. 윈도우 함수 밖에서 쓰임
# partition by -> 행이 합쳐지지 않음. 윈도우 함수 안에서 쓰임

# 조건문, 반복문

# case
# sql안에서 조건에 따라 값을 다르게 처리하고 싶을 때

# case when 조건1 then 결과1
#	   when 조건2 then 결과2
#	   else 기본 결과
# end

select name, score, case 
when score>=90 then 'A'
when score>=80 then 'B'
when score>=70 then 'C'
when score>=60 then 'D'
else 'F' end as grade from student;

# if
# 프로그래밍 언어의 if 문과 매우 비슷하지만, sql에서는 함수형태로 사용 된다.
# if(조건, 참일 때 값, 거짓일 때 값)

select name,score,if(score >= 60, 'pass','fail')as result from student;


# for, while
# 프로시저
# 자주 쓰는 sql 작업을 함수처럼 만들어서 db에 저장해두는 것
# stored procedure 라고 부릅니다.
# create로 만들고, call 프로시저명()을 통해 호출한다.

# 재사용성이 좋아진다.
# 한 번 만들어두면 여러 프로그램, 여러 화면에서 계속해서 쓸 수 있다.
# 같은 로직을 여러 군데에서 복붙하지 않아도 된다.

# 유지 보수 편의성이다.
# 로직이 바뀌면 프로시저 코드만 수정하면 된다.
# 앱 코드 여러 곳을 찾아다니며 sql문을 수정하지 않아도 된다.

# 기본 사용 흐름
# 1. 프로시저의 정의
# create procedure ... 로 생성한다.
# 2. 프로시저의 호출
# call 프로시저 이름(인수...)로 실행한다.
# 3. 필요없으면 삭제
# drop procedure 프로시저 이름;

delimiter $$ #기본 구분자를 ; 에서 $$로 바꿔주는 명령


create procedure hello_world()
begin
	select 'hello,world';
end $$

delimiter;