package com.example.happybirth.domain;

import jakarta.persistence.*;

@Entity
public class Message {
    @Id @Column(name = "WRITER")
    private String writer;
    @Column(nullable = false, length = 300)
    private String message;

    private int image;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;


}
