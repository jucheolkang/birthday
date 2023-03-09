package com.example.happybirth.domain.repository;

import com.example.happybirth.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}