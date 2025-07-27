package com.kafka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	// Send message to Kafka topic
	public void sendMessegeToTopic(String message) {
		kafkaTemplate.send("Pravin_Dev", message);
	}
}
