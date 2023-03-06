package com.example.happybirth.service;

import com.example.happybirth.domain.repository.MessageRepository;
import com.example.happybirth.web.dto.MessageLIstResponseDto;
import com.example.happybirth.web.dto.MessageResponseDto;
import com.example.happybirth.web.dto.MessageSaveDto;
import com.example.happybirth.domain.Message;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor

@Service
public class MessageService {

    private final MessageRepository messageRepository;
    @Transactional
    public String save(MessageSaveDto requestDto){
        return messageRepository.save(requestDto.toEntity()).getWriter();
    }
    @Transactional
    public MessageResponseDto findByWriter(String Writer){
        Message entity = messageRepository.findById(String.valueOf(Writer)).orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. id =" + Writer));
        return new MessageResponseDto(entity);
    }
    @Transactional(readOnly = true)
    public List<MessageLIstResponseDto> finrAllDesc(){
        return messageRepository.findAllDesc().stream().map(MessageLIstResponseDto::new).collect(Collectors.toList());
    }

    @Transactional
    public void delete(){
        messageRepository.deleteAll();

    }

}
