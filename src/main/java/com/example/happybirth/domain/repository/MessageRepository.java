package com.example.happybirth.domain.repository;

import com.example.happybirth.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MessageRepository extends JpaRepository<Message, String> {
    @Query("SELECT p FROM Message p ORDER BY p.writer DESC")
    List<Message> findAllDesc();
}