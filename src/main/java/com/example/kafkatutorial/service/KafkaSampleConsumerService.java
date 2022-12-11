package com.example.kafkatutorial.service;

import com.example.kafkatutorial.dto.KafkaSampleMessageDto;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaSampleConsumerService {
    @KafkaListener(topics = "kafka-tutorial", groupId = "group-id-kafka-tutorial")
    public void consumer(String message) throws Exception {
        System.out.println("receive message : "+message);
    }
}

