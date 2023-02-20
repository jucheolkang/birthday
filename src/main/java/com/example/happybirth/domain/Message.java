package com.example.happybirth.domain;

import jakarta.persistence.*;

@Entity
public class Message {
    @Id
    private String Writer;
    private String message;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;


}
