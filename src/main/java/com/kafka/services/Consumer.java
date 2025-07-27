package com.kafka.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	// Kafka consumer to read messages from topic
	@KafkaListener(topics = "Pravin_Dev", groupId = "pravin_group")
	public void lisenToTopic(String recivedMessege) {
		System.out.println("Recived Messege is:::: " + recivedMessege);
	}
}
