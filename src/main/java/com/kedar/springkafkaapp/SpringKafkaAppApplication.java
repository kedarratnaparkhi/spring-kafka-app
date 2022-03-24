package com.kedar.springkafkaapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringKafkaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaAppApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
		return args -> {
			for (int i = 0; i < 100; i++) {
				kafkaTemplate.send("kedar2", "hello from Spring Boot application"+i);
			}
		};
	}
}
