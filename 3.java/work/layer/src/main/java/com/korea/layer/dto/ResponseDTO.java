package com.korea.layer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// 클라이언트에게 데이터와 에러 메시지를 보내기 위한 DTO
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO<T> {

    private String error;
    
    // TodoDTO 뿐만 아니라 이후에 다른 모델의 DTO도 ResponseDTO를 이용해 반환할 수 있도록 제네릭 타입을 사용.
    private List<T> data;
    
}