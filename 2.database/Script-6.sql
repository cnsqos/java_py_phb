--  절차문을 쓸 때는 '스크립트 전체 실행'으로 돌려야 한다.
-- alt +x
-- 
-- delimiter $$ #기본 구분자를 ; 에서 $$로 바꿔주는 명령
-- 
-- 
-- create procedure hello_world()
-- begin
-- 	select 'hello,world';
-- end $$
-- 
-- delimiter;
-- 
-- call hello_world();
-- 
-- select * from student;
-- 
--  프로시저의 매개변수 종류
--  in : 입력 전용 파라미터
--  입력 전용 파라미터
--  호출할 때 값을 넘겨주고, 프로시저 안에서는 읽기만 한다.
-- 
-- delimiter $$
-- 
-- create procedure get_student_by_score(in p_min score int)
-- begin
-- 	select name, score from student where >= p_min_score;
-- end $$
-- 
-- delimiter ;
-- 
-- call get_student_by_score(80);
-- 
-- 
-- 
-- 
-- 
-- out
-- 프로시저의 실행 결과를 매개변수를 통해 밖으로 돌려주려고 할 때 사용한다.
-- 
-- delimiter $$
-- 
-- create procedure get_student_count(out p_cnt int)
-- begin
-- 	select count(*) into p_cnt # 조회된 결과를 p_cnt에 넣겠다
-- 	from student;
-- end $$
-- 
-- delimiter ;
-- 
-- set @cnt = 0;
-- call get_student_count(@cnt);
-- select @cnt as student_;


#in out
#입력도 하고, 수정해서 출력도 하는 매개변수

-- delimiter $$
-- #들어온 숫자에 10을 더해서 반환하는 예제
-- create procedure add_ten (inout p_value int)
-- begin
-- 	set p_value = p_value +10;
-- end $$
-- 
-- delimiter ;

# 프로시저를 호출하고 값을 전달

-- set @num = 5;
-- call add_ten(@num);
-- select @num as result;


# add_student 이름의 프로시저를 만들고, student 테이블에 데이터 insert하기

-- select * from student;

# 데이터를 추가하는 방법
# insert into 테이블 (칼럼 나열) values (값1, 값2, ...);
# 매개변수
# 함수를 호출할 때 전달한 값을 함수 내부로 전달하는 변수

-- delimiter $$
-- create procedure add_student (in p_name varchar(20), in p_class int, in p_age int, in p_score int, in p_reg_dt date)
-- begin
-- 	insert into student values (p_name, p_class, p_age, p_score, p_reg_dt);
-- end $$
-- 
-- delimiter ;
-- 
-- call add_student('홍길동',1,18,85,'2025-01-02');

# 1. 함수를 만든다
# 함수 안에 반복하고자 하는 명령을 추가한다

# 2. 함수를 호출하여 실행한다.
# 계산기 -> 계산기 안에 더하기, 빼기, 곱하기, 나누기 기능이 정의되어 있음

# 각 기능들이 작동하는 시점 -> 내가 숫자 두개랑 연산을 하라고 해야 실행

# 내가 원하는 기능을 작동 시키기 위해서 함수를 만든다.

-- delimiter $$
-- create procedure plus(in a int, in b int) # 함수의 정의
-- begin
-- 	select a + b;
-- end $$
-- delimiter;
-- 
-- call plus (10,7); # 함수의 호출


# student 테이블에서 id를 가지고 데이터를 삭제하는 del_student 프로시저 만들기
# del_student를 호출해서 학생 한명을 삭제하기


-- delimiter &&
-- create procedure del_student (in p_id int)
-- begin
-- 	delete from student where id = p_id;
-- end $$
-- 
-- delimiter ;
-- 
-- call del_student (3);

# if elseif els를 프로시저 안에서 쓸 수 있다.

-- create procedure check_grade(in score int)
-- begin
-- 	if score >= 90 then
-- 		select 'A' as grade;
-- 	elseif score >= 80 then
-- 		select 'B' as grade;
-- 	elseif score >= 70 then
-- 		select 'C' as grade;
-- 	elseif score >= 60 then
-- 		select 'D' as grade;
-- 	else
-- 		select 'F' as grade;
-- 	end if;
-- end

-- stuent에 학생을 추가하는 add_student 프로시저를 만들되, 점수가 0보다 작거나 100보다 크면 '점수는 0 ~ 100 사이여야 한다' ;
# signal sqlstate '45000' -> 사용자 에러를 일으키겠다.
# set message_text = '점수는 0~100 사이여야 한다'; -> 에러에 대한 메시지
# select '점수는 0~100 사이여야 한다' as warn_msg;


delimiter $$
create procedure add_student (in p_name varchar(20), in p_class int, in p_age int, in p_score int, in p_reg_dt date)
proc:begin
	if p_score < 0 or p_score > 100 then
		select '점수는 0 ~ 100 사이여야 한다.' as warn_msg;
		leave proc; # break;
	insert into student (name, class, age, score, reg_dt)
	values (p_name, p_class, p_age, p_score, p_reg_dt);
end $$
delimiter ;

