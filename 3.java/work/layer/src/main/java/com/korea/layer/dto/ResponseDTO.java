package com.korea.layer.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//클라이언트에게 데이터와 에러 메시지를 보내기 위한 DTO
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseDTO<T> {

	private String error;
	//TodoDTO 뿐만 아니라 이후에 다른 모델의 DTO도 ResponseDTO를 이용해 반환할 수 있도록
	//제네릭 타입을 사용했다.
	private List<T> data;
}









