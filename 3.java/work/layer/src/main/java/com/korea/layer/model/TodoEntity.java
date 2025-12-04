package com.korea.layer.model;

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
public class TodoEntity {
	private String id; //이 객체의 id
	private String userId; //이 객체를 생성한 유저의 id
	private String title; //Todo 타이틀 ex) 운동하기
	private boolean done; //완료 여부
	
}
