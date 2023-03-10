package com.example.happybirth.service;

import com.example.happybirth.domain.Member;
import com.example.happybirth.domain.repository.MemberRepository;
import com.example.happybirth.web.dto.MemberSaveDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public void memberSave(MemberSaveDto memberSaveDto){
        memberRepository.save(memberSaveDto.toEntity());
    }




}
