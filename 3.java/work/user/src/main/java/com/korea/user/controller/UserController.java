package com.korea.user.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.korea.user.dto.UserDTO;
import com.korea.user.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

  
    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody UserDTO dto) {
        try {
            UserDTO savedUser = userService.create(dto);
            return ResponseEntity.ok(savedUser);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @GetMapping
    public ResponseEntity<?> getUserByEmail() {
        try {
            List<UserDTO> users = userService.getAllUsers();
            return ResponseEntity.ok(users);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
  

    // 이메일로 사용자 조회
    @GetMapping("/{email}")
    public ResponseEntity<?> getUserByEmail(@PathVariable String email) {
        UserDTO user = userService.getUserByEmail(email);
        if(user != null) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.status(404).body("User not found with email " + email);
    }
    
    @DeleteMapping
	public ResponseEntity<?> getUserByEmail(@RequestBody UserDTO dto){
    	try {
			
		} catch (Exception e) {

		}
    }
    
    
    
    
}