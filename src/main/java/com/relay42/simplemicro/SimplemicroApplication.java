package com.relay42.simplemicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class SimplemicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplemicroApplication.class, args);
		log.info("Simple App is Up");
	}
}
