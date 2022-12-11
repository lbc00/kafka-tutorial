package com.example.kafkatutorial.service;

import com.example.kafkatutorial.dto.KafkaSampleMessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSampleProducerService {
    private final KafkaTemplate<String, String> kafkaTemplate;
    //@Autowired
    //private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaSampleProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        System.out.println("send message : "+message);
        this.kafkaTemplate.send("kafka-tutorial", message);
    }
}
