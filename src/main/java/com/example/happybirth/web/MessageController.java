package com.example.happybirth.web;


import com.example.happybirth.web.dto.MessageResponseDto;
import com.example.happybirth.web.dto.MessageSaveDto;
import com.example.happybirth.service.MessageService;
import org.springframework.web.bind.annotation.*;


@RestController

public class MessageController {
    private final MessageService messageService ;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/api/v1/Message")
    public String save(@RequestBody MessageSaveDto requestDto){
        return messageService.save(requestDto);
    }

    @GetMapping("/api/v1/Message/{writer}")
    public MessageResponseDto findByWriter(@PathVariable String writer){return messageService.findByWriter(writer);}

}
