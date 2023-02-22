package com.example.happybirth;

import com.example.happybirth.domain.User;
import com.example.happybirth.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    @DisplayName("user 등록 테스트")
    public void createUserTest(){
        User user = new User();
        user.setUserName("딩디");
        user.setId("1234");
        user.setPw("1234");
        user.setBirthDay(LocalDateTime.now());
        User saveUser = UserRepository.save(user);
        System.out.println(saveUser.toString());


    }
}
