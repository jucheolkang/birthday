package com.example.happybirth.web.dto;

import com.example.happybirth.domain.Message;
import lombok.Getter;

@Getter
public class MessageLIstResponseDto {
    private String writer;
    private int image;

    public MessageLIstResponseDto(Message entity){
        this.writer = entity.getWriter();
        this.image = entity.getImage();

    }

}
