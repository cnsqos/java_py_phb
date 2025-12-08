package com.korea.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.korea.user.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    // 이메일로 유저 검색
    UserEntity findByEmail(String email);
}

