package com.example.happybirth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Message {
    @Id @Column(name = "WRITER")
    private String writer;
    @Column(nullable = false, length = 300)
    private String message;
    @Column(nullable = false)
    private int image;

    @ManyToOne
    @JoinColumn(name = "USER_name")
    private User user;


}
