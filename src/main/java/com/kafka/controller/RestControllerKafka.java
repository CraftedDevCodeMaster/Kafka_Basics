package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.services.Producer;

@RestController
@RequestMapping("/kafka/api")
public class RestControllerKafka {
	
	@Autowired
	Producer producer;

	// API to produce message to Kafka
	@GetMapping("/produceMsg")
	public void getMessegeFromClient(@RequestParam("message") String message) {
		producer.sendMessegeToTopic(message);
	}
}
