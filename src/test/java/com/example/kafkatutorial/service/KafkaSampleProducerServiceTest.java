package com.example.kafkatutorial.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.doNothing;
@ExtendWith(MockitoExtension.class)
class KafkaSampleProducerServiceTest {

    @Autowired
    private KafkaSampleProducerService kafkaSampleProducerService;

    @Mock
    private KafkaTemplate<String, String> kafkaTemplate;

    @Test
    void sendMessage() {
        String message = "안녕하세요.";
        given(kafkaTemplate.send("kafka-tutorial", message)).willReturn(null);
        kafkaSampleProducerService.sendMessage(message);
    }
}