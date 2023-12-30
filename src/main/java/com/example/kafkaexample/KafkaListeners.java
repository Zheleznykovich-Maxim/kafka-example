package com.example.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "example",
            groupId = "groupId"
    )
    void lisener(String data) {
        System.out.println("Listener received:" + data + " 🎉");
    }
}
