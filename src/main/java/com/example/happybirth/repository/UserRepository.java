package com.example.happybirth.repository;

import com.example.happybirth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
//Repository가 DAO의 역할을 해준다 - JpaRepository는 불러온 것
public interface UserRepository extends JpaRepository<User,String> {
}
