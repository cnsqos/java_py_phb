package com.korea.layer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.layer.dto.ResponseDTO;
import com.korea.layer.service.TodoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("todo")
@RequiredArgsConstructor
public class TodoController {
	//해야할 일 api 만들것이다.
	
	//@Autowired //필드 주입
	//스프링 컨테이너가 실행될 때 TodoService타입의 빈을 찾아서 service 필드에
	//넣어준다.
	private final TodoService service; //null
	
	//생성자 주입
//	public TodoController(TodoService service) {
//		this.service = service;
//	}
	
	//setter주입
	//Setter를 통해 주입하는 방식이다.
//	public void setService(TodoService service) {
//		this.service = service;
//	}
	
	
	
	//localhost:8080/todo/test
	@GetMapping("/test")
	public ResponseEntity<?> testTodo() {
		String str = service.testService();//testService()메서드를 실행해서 결과를 얻어온다.
		List<String> list = new ArrayList<String>();
		list.add(str);
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
		return ResponseEntity.ok().body(response);
	}

}





