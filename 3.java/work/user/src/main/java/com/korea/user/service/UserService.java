package com.korea.user.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.korea.user.dto.UserDTO;
import com.korea.user.model.UserEntity;
import com.korea.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    // 사용자 생성
    public UserDTO create(UserDTO dto) {


        // DTO → Entity 변환
        UserEntity entity = UserDTO.toEntity(dto);

        // 저장
        UserEntity savedEntity = userRepository.save(entity);

        // 저장 후 DTO로 반환
        return new UserDTO(savedEntity);
    }

    public List<UserDTO> getAllUsers() {
        List<UserEntity> entities = userRepository.findAll();
        // Entity -> DTO 변환
        return entities.stream()
                .map(UserDTO::new)
                .collect(Collectors.toList());
    }
    
    // 이메일로 사용자 조회
    public UserDTO getUserByEmail(String email) {
        UserEntity entity = userRepository.findByEmail(email);
        if(entity == null) return null;
        return new UserDTO(entity);
    }

 
    
    
    
}