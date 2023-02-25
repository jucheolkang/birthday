package com.example.happybirth.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class UserDto {

    private String id;
    private String pw;
    private String UserName;

    private LocalDateTime birthDay;
}
