package com.korea.layer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.layer.dto.ResponseDTO;
import com.korea.layer.dto.TodoDTO;
import com.korea.layer.model.TodoEntity;
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
	
	@PostMapping
	public ResponseEntity<?> createTodo(@RequestBody TodoDTO dto){
		try {
			//로그인 기능이 없기 때문에 임시 유저
			String tempraryUserId = "temporary-user";
			//DTO -> Entity
			TodoEntity entity = TodoDTO.toEntity(dto);
			
			//엔티티가 새로운 데이터임을 보장
			entity.setId(null);
			
			//엔티티에 임시 유저 아이디 세팅
			entity.setUserId(tempraryUserId);
			
			//서비스 레이어의 create메서드를 호출해서, TodoEntity를 데이터베이스에 저장하는 작업을 한다.
			//저장을 한 다음 TodoEntity객체들을 저장한 List를 반환한다.
			
			List<TodoEntity> entites = service.create(entity);
			
			List<TodoDTO> dtos = new ArrayList<>();
			
			//리스트 안에 들어 있는 TodoEntity를 TodoDTO 타입으로 변경해서 dtos에 넣는다.
			for(TodoEntity e : entites) {
				dtos.add(new TodoDTO(e)); //entity를 dto로 바꿔서 리스트에 추가
			}
			
			//builder패턴을 이용해서 dtos를 ResponseDTO에 담아서 ResponseEntity로 반환한다. 
			
			 ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
	         return ResponseEntity.ok(response);
			
		} catch (Exception e) {
			String error = e.getMessage();
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().error(error).build();
            return ResponseEntity.ok().body(response);
			
		}
	} 

}





