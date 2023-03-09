package com.example.happybirth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Member {
    @Id @GeneratedValue
    @Column(name = "USER_name")
    private String userName;

    @Column(nullable = false)
    private String id;
    @Column(nullable = false)
    private String pw;
    @Column(nullable = false)
    private LocalDateTime birthDay;

    @OneToMany(mappedBy = "member",cascade = CascadeType.ALL)
    private List<Message> messagesList = new ArrayList<Message>();


}
