package com.korea.layer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity
//데이터를 담는 역할과 DB의 테이블과 스키마를 표현하는 역할을 한다.
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
//자바 클래스를 엔티티로 지정하기 위해 사용한다.
//이름을 부여하고 싶다면 @Entity("TodoEntity")처럼
//매개변수를 넣을 수 있다.
@Entity
@Table(name="Todo") //이 엔티티가 어떤 테이블과 매핑될지를 지정한다.
//우리가 Todo테이블을 만들지는 않았지만 JPA가 엔티티를 보고 테이블을 자동생성해준다.
public class TodoEntity {
	
	@Id //이 필드가 엔티티의 기본 키(PK)이다.
	//JPA에서는 모든 엔티티는 최소 1개의 @Id가 필요하다.
	@GeneratedValue(strategy = GenerationType.UUID) //기본키의 값을 자동으로 생성하는 전략
	//UUID : 범용 고유 식별자 거의 겹치지 않는 ID값을 만드는 규칙
	private String id;	//이 객체의 id
	private String userId; //이 객체를 생성한 유저의 id
	private String title; //Todo 타이틀 ex) 운동하기
	private boolean done; //완료 여부
}
