package com.example.happybirth.controller;



import com.example.happybirth.repository.UserRepository;
import lombok.RequiredArgsConstructor;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserRepository userRepository;



}
