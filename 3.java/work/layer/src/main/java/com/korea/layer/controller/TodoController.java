package com.korea.layer.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		
		
		   //생성된 모든 할 일을 조회하는 retrieveTodoList메서드 만들기
		   //어떤 한 유저가 만든 할일에 대해서 모두 조회
		   //임시유저 : tmporary-user
		   //@GetMapping
		
		
		@GetMapping
		public ResponseEntity<?> retrieveTodoList() {
			String temporaryUserID = "tmporary-user";
			
			List<TodoEntity> entities = service.retrieve(temporaryUserID);
			
			List<TodoDTO> dtos = new ArrayList<TodoDTO>();
			
			for(TodoEntity e : entities) {
				dtos.add(new TodoDTO(e));
			}
			
			
			
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
			return ResponseEntity.ok().body(response);
			
		}

		
		//할일을 수정하기 위한  updateTodo메서드 작성하기
		//수정하려는 내용을 사용자로부터 받아
		//임시유저 넣어야함
		
		
		   //할일을 수정하기 위한 updateTodo메서드 작성하기
		   //수정하려는 내용을 사용자로부터 받아서 처리
		   //임시유저 "temporary-user"
		   //update from Todo set title="수정할내용" where id = ??
		   //id와 title을 받아야함
		
		
		@PutMapping
		public ResponseEntity<?> updateTodo(@RequestBody TodoDTO dto){
			String temporaryUserId = "temporary-user";
			
			//dto를 Entity로 변환한다.
			TodoEntity entity = TodoDTO.toEntity(dto);
			
			entity.setUserId(temporaryUserId);
			
			//서비스레이어의 update메서드를 이용해 entity를 업데이트한다.
			List<TodoEntity> entities = service.update(entity);
			
			//자바 스트림을 이용해 반환된 엔티티 리스트를 TodoDTO 리스트로 변환한다.
			List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
			
			//변환된 TodoDTO 리스트를 이용해 ResponseDTO를 초기화한다.
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
			
			return ResponseEntity.ok().body(response);
		}
		
		//삭제하기
		//@deleteMapping
		//deleteTodo
		//삭제 후 전체조회를 해서 반환
		//임시유저 세팅
		
		@DeleteMapping
		public ResponseEntity<?> deleteTodo(@RequestBody TodoDTO dto){
			try {
				
				String tempraryUserId = "temporary-user";
				
		
				TodoEntity entity = TodoDTO.toEntity(dto);
			
			
				entity.setUserId(tempraryUserId);
				
				
				List<TodoEntity> entities = service.delete(entity);
				
				
				List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
				
				
				ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
				
			
				return ResponseEntity.ok().body(response);
				
			} catch (Exception e) {
				
				String error = e.getMessage();
				
			
				ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().error(error).build();
				
		
				return ResponseEntity.badRequest().body(response);
			}
		
		}
		
}





