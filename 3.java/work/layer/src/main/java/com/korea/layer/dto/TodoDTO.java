package com.korea.layer.dto;

import com.korea.layer.model.TodoEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//DTO(Data Transition Object)
//서비스가 요청을 처리하고 클라이언트에게 반환할 때, 엔티티를 그대로 반환하는 경우는 별로 없다.
//데이터를 전달하기 위해 사용하는 객체인 DTO로 변환하여 사용한다.

//DTO로 변환하여 반환하는 이유
//1. 비즈니스 로직을 캡슐화 하기 위함이다.
//- 대부분의 회사들은 db의 스키마를 아는것을 원치 않는다.
//- dto처럼 다른 객체로 바꿔서 전달하면 외부 사용자에게 서비스 내부의 로직, db구조를 숨길 수 있다.
//2. 필요한 정보를 엔티티가 전부 포함하지 않는 경우가 있다.
//서비스 도중 에러가 발생하면 에러 메시지는 어디에 포함시켜서 보내야 하는가
//DTO에 에러 메시지 필드를 선언하고 DTO에 포함시키면된다.
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoDTO {

	private String id;
	private String title;
	private boolean done;
	
	//Entity를 DTO타입으로 변환하기
	public TodoDTO(TodoEntity entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.done = entity.isDone();
	}
	
	//DTO를 Entity타입으로 바꾸는 toEntity메서드 만들기
	public static TodoEntity toEntity(TodoDTO dto) {
		return TodoEntity.builder()
				.id(dto.getId())
				.title(dto.getTitle())
				.done(dto.isDone())
				.build();
	}
}









