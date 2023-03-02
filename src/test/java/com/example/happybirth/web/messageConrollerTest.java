package com.example.happybirth.web;

import com.example.happybirth.domain.Message;
import com.example.happybirth.domain.repository.MessageRepository;
import com.example.happybirth.web.dto.MessageResponseDto;
import com.example.happybirth.web.dto.MessageSaveDto;
import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT)
public class messageConrollerTest {
    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    private MessageRepository messageRepository;
    @After
    public void tearDown() throws Exception{
        messageRepository.deleteAll();
    }
    @DisplayName("메시지 등록 테스트")
    @Test
    public void message_등록()throws Exception{
        //given
        String writer = "글쓴이";
        String mes = "축하";
        int ima = 1;
        MessageSaveDto requestDto = MessageSaveDto.builder()
                .writer(writer)
                .message(mes)
                .image(ima)
                .build();
        String url = "http://localhost:"+port+"/api/v1/message";

        //when
        ResponseEntity<String> responseEntity = restTemplate. postForEntity(url, requestDto, String.class);

        //then
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isGreaterThan(String.valueOf(0L));
        List<Message> all = messageRepository.findAll();
        assertThat(all.get(0).getWriter()).isEqualTo(writer);
        assertThat(all.get(0).getMessage()).isEqualTo(mes);
        assertThat(all.get(0).getImage()).isEqualTo(ima);

    }
}
