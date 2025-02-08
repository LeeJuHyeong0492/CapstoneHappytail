package com.example.happytail.repository;

import com.example.happytail.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    Boolean existsByUsername(String username); //회원가입 유저 중복 확인

    UserEntity findByUsername(String username); //로그인 유저 확인
}
