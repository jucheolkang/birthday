package com.example.happybirth.web.dto;

import com.example.happybirth.domain.Message;
import lombok.Getter;

@Getter
public class MessageResponseDto {
    private String writer;
    private String message;
    private int image;
    public MessageResponseDto(Message entity){
        this.writer = entity.getWriter();
        this.message = entity.getMessage();
        this.image = entity.getImage();

    }
}
