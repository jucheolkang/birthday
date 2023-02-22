package com.example.happybirth.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity

public class User {
    @Id @GeneratedValue
    @Column(name = "USER_name")
    private String userName;
    private String id;
    private String pw;

    private LocalDateTime birthDay;

    @OneToMany(mappedBy = "user")
    private List<Message> messagesList = new ArrayList<Message>();


}
