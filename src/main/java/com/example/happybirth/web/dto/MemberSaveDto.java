package com.example.happybirth.web.dto;

import com.example.happybirth.domain.Member;
import lombok.Builder;

public class MemberSaveDto {
    private String userName;
    private String id;
    private String pw;

    @Builder
    public MemberSaveDto(String userName, String id, String pw){
        this.userName = userName;
        this.id = id;
        this.pw = pw;

    }
    public Member toEntity(){return Member.builder().userName(userName).id(id).pw(pw).build();}

}
