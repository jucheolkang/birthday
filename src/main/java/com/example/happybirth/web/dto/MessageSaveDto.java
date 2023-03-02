package com.example.happybirth.web.dto;

import com.example.happybirth.domain.Message;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter

@NoArgsConstructor
public class MessageSaveDto {
    private String writer;
    private String message;
    private int image;
    @Builder
    public MessageSaveDto(String writer, String message, int image){
        this.writer = writer;
        this.message = message;
        this.image = image;
    }
    public Message toEntity(){
        return Message.builder().writer(writer).message(message).image(image).build();
    }
}
