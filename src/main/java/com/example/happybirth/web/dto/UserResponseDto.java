package com.example.happybirth.web.dto;

import com.example.happybirth.domain.Member;

import java.time.LocalDateTime;

public class UserResponseDto {
    private String userName;
    private String id;
    private String pw;

    private LocalDateTime birthDay;

    public UserResponseDto(Member entity){
        this.userName = entity.getUserName();
        this.id = entity.getId();
        this.pw = entity.getPw();
        this.birthDay= entity.getBirthDay();
    }
}
