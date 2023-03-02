package com.example.happybirth.domain;


import com.example.happybirth.domain.repository.MessageRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageRepositoryTest {
    @Autowired
    MessageRepository messageRepository;

    @After
    public void cleanup(){messageRepository.deleteAll();}

    @Test
    public void 게시글저장_불러오기(){
        //given
        String writer = "작성자";
        String mes = "축하해";
        int im = 1;

        messageRepository.save(Message.builder()
                .writer(writer)
                .message(mes)
                .image(im)
                .build());
        //when
        List<Message> MessageList = messageRepository.findAll();


        //then
        Message message = MessageList.get(0);
        assertThat(message.getWriter()).isEqualTo(writer);
        assertThat(message.getMessage()).isEqualTo(mes);
        assertThat(message.getImage()).isEqualTo(im);
    }


}
