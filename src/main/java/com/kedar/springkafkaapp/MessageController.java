package com.kedar.springkafkaapp;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

    private KafkaTemplate<String, String> kafkaTemplate;

    MessageController(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/publish")
    public void publishMessage(@RequestBody String data){
        kafkaTemplate.send("kedar2", data);
    }
}
