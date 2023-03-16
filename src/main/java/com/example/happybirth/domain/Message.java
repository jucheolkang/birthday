package com.example.happybirth.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Table
@Getter
@Entity

@NoArgsConstructor
public class Message {
    @Id @Column(name = "WRITER")
    private String writer;
    @Column(nullable = false, length = 300)
    private String message;
    @Column(nullable = false)
    private int image;

    @Builder
    public Message(String writer, String message, int image){
        this.writer = writer;
        this.message = message;
        this.image = image;
    }

    @ManyToOne
    @JoinColumn(name = "USER_name")
    private Member member;


}
