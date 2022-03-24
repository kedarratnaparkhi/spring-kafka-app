package com.kedar.springkafkaapp;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "kedar2", groupId = "group001")
    void listener(String data){
        System.out.println("Listener Received: "+data+" 😛");
    }
}
