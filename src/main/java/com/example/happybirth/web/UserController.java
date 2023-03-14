package com.example.happybirth.web;



import com.example.happybirth.service.MemberService;
import com.example.happybirth.web.dto.MemberSaveDto;
import lombok.RequiredArgsConstructor;


import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor

public class UserController {
    private final MemberService memberService;
@PostMapping("/user")
    public void addUser(@RequestBody MemberSaveDto memberSaveDto){
    memberService.memberSave(memberSaveDto);
}




}
