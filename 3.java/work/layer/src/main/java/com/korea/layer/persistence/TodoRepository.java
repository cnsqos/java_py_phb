package com.korea.layer.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.korea.layer.model.TodoEntity;

@Repository
//데이터베이스와 상호작용하는 클래스에서 사용되며,CRUD와 같은 데이터베이스 작업을
//처리하는데 사용된다. Spring의 Bean으로 등록된다.
//다른 계층에서 주입받아 사용할 수 있다.
//인터페이스는 다른 인터페이스를 상속할 수 있다!
public interface TodoRepository extends JpaRepository<TodoEntity, String> {
	//JpaRepository<T, ID>
	//Spring Data Jpa에서 제공하는 기본 인터페이스로 JPA를 사용하여 데이터베이스 작업을
	//쉽게 처리할 수 있도록 도와주는 역할을 한다.
	//T : 엔티티 클래스를 의미한다.
	//ID : 엔티티 클래스의 기본키의 타입을 의미한다.

	//주요 메서드
	//save(S entity) : 엔티티를 데이터베이스에 저장하거나 업데이트 한다.
	//findById(ID id) : 기본키를 이용하여 엔티티를 조회한다.
	//findAll() : 데이터베이스의 모든 엔티티를 조회한다.
	//deleteById(ID id) : 기본키를 이용하여 엔티티를 삭제한다.
	
	//많이 쓰는 접두사
	//findBy
	//By뒤에 오는 부분 -> 엔티티의 필드명 기준 조건
	
	//개수 세기
	//countBy
	
	//존재여부
	//existsBy
	
	//조건키워드
	//AND/OR
	//findByUserIdAndDone
	//findByUserIdOrTitle
	
	//Null
	//IsNull
	//IsNotNull
	//ex) findByTitleIsNull
	
	//기본모양
	//반환타입 findBy 필드명 And 필드명 Order by 필드명 Asc[Desc](...)
	
	
	
	
}










