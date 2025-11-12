create database if not exists academy_db
character set = utf8mb4
collate = utf8mb4_unicode_ci;

# <- MySQL 주석
# 코드에 대한 개발자의 설명을 추가할 때 쓰는 것

# 사용자 만드는 방법
# CREATE USER : 유저를 만들겠다.
# 'app_user' : 생성할 계정의 이름
# '%' : 어느 IP에서든 접속 가능(실무에서는 특정 IP로 제한하는 것이 안전하다)
# ex) 'app_user'@'192.1.1.2'
# identified by '비밀번호'
create user 'app_user '@'%' identified by '1111';

#create, alter, drop : 오브젝트(테이블) 관련 권한
#select, insert, update, delete : 데이터 조회/추가/수정/삭제 권한
grant 
   create, 
   alter, 
   drop, 
   select, 
   insert, 
   update, 
   delete
on academy_db.* # academy_db내부의 모든 테이블에 권한을 부여한다.
to 'app_user'@'%'; #누구에게

#권한 부여됐는지 확인하기
show grants for 'app_user'@'%';

create table TBL_MEMBER(
	name varchar(30), -- 문자열 데이터만 들어갈 수 있음
	age int -- 마지막에는 콤마를 찍지 않습니다.
);

select * from tbl_member;

#제약조건과 함께 테이블 생성해보기
#constraint 제약조건명(변수명) 제약조건 종류 (적용하고 싶은 속성);
create table tbl_car(
	id int,
	brand varchar(100),
	color varchar(100),
	price int,
	constraint CAR_PK primary key (id)
);

# 테이블 삭제
#DDL의 DROP 키워드를 사용한다.
#DROP TABLE 테이블명;
#DROP TABLE을 하면 되돌릴 수 없다.
#테이블 안에 데이터가 있었다면 전부 삭제된다.

drop table TBL_CAR;
drop table TBL_MEMBER;

#ex01 테이블 만들기

create table ex01 (
	col1 varchar(10) not NULL,
	col2 varchar(10),
	create_date DATETIME default current_timestamp()
);

#테이블 변경
#create문으로 테이블을 생성한 후 불가피하게 수정해야 할 상황이 발생할 때가 많다.
#최초 설계를 잘못한 원인도 있고, 요구사항이 변경되기 때문이기도 하다.
#여러 원인으로 기존에 생성했던 속성의 데이터 타입을 수정하거나 삭제 또는 새로운 속성을 넣어야 하는 경우가 발생할 수 있다.

#ALTER TABLE 테이블명 변경할 내용;

#새로운 컬럼(속성) 추가하기
alter table ex01 add column col3 varchar(50);

#컬럼을 삭제하는 방법
alter table ex01 drop column col2;

#컬럼명 바꾸기
alter table ex01 rename column col1 to first_col;

#컬럼 타입 변경
alter table ex01 modify column col3 int;

#제약조건 추가하기
alter table ex01 add primary key (first_col);

#제약조건 삭제하기
alter table ex01 drop primary key;

#tbl_animal 테이블
create table tbl_animal(
	id int primary key,
	type varchar(100),
	age int,
	feed varchar(100)
)

# 애니멀 테이블에서 primary key 제약조건 삭제하기

alter table tbl_animal drop primary key;

# id에 primary key 제약조건 추가하기

alter table tbl_animal add constraint animal_pk primary key (id);

# 테이블 삭제해보기

drop table tbl_animal;

