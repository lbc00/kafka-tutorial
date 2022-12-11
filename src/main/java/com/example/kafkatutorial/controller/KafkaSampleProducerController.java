package com.example.kafkatutorial.controller;

import com.example.kafkatutorial.service.KafkaSampleProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaSampleProducerController {
    private final KafkaSampleProducerService kafkaSampleProducerService;

    public KafkaSampleProducerController(KafkaSampleProducerService kafkaSampleProducerService) {
        this.kafkaSampleProducerService = kafkaSampleProducerService;
    }

    @GetMapping(value = "sendMessage")
    public String sendMessage(String message) {
        kafkaSampleProducerService.sendMessage(message+System.currentTimeMillis());
        return message;
    }
}
