package com.example.happybirth.domain;

import com.mysql.cj.x.protobuf.MysqlxCursor;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
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

    @Column
    private String email;


    @OneToMany(mappedBy = "member",cascade = CascadeType.ALL)
    private List<Message> messagesList = new ArrayList<Message>();
    @Builder
    public Member(String userName, String id, String pw, LocalDateTime birthDay, String email){
        this.userName = userName;
        this.id = id;
        this.pw = pw;
        this.birthDay = birthDay;
        this.email = email;
    }

}
