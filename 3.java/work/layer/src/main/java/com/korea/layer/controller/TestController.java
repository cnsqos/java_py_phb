package com.korea.layer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.korea.layer.dto.ResponseDTO;
import com.korea.layer.dto.TestDTO;


//url로 요청이 들어오면 메서드가 실행이 되고 결과를 브라우저에게 반환한다.
//표현계층에 있는 controller라고 한다.
@RestController
//@RequestMapping("test")
public class TestController {

	//localhost:8080/testGetMapping
	@GetMapping("/testGetMapping")
	public String testController() {
		return "Hello World testGetMapping";
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Spring boot";
	}
	
	//required : 기본값은 true이며, 경로 변수에 값이 반드시 있어야 한다는 의미
	@GetMapping("/{id}")
	public String testPathVariable(@PathVariable(required=false) int id) {
		return "Hello World! ID : " +id;
	}
	
	@GetMapping("/users")
	//required의 기본값은 true이다. -> 값을 전달하지 않으면 400 bad Request 발생
	//defaultValue가 설정이 되면 파라미터 값이 전달이 안되도  기본값을 넣어줄 수 있어서
	//required=false와 같은 효과가 자동으로 적용된다.
	public String GetUserById(@RequestParam(value="id", defaultValue="0", required=false) int userId) {
		return "User ID : " + userId;
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("query") String query, @RequestParam("page") int page) {
		return "Search query : " + query + ", Page : " + page;
	}
	
	@PostMapping("/testRequestBody")
	public String testRequestBody(@RequestBody TestDTO testDTO) {
		return "Hello World! ID : " + testDTO.getId() + ", Message : " + testDTO.getMessage();
	}
	
	
	@GetMapping("/testResponseBody")
	public ResponseEntity<?> testResponseBody() {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Nice too meet you");
		list.add("l like winter");
		//ResponseDTO.builder()가 반환하는 빌더 객체의 타입을 컴파일러가 추론하지 못하는 경우가
		//생기기 때문에 명시적으로 타입을 지정한다.
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
		return ResponseEntity.badRequest().body(response);
		//ResponseDTO를 반환하는것과 body부분은 차이가 없다
		//다만 헤더 HTTP Status를 조작할 수 있다는 점이 다르다.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
