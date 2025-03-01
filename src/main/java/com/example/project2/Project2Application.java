package com.example.project2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project2Application {

	// Create logger instance
	private static final Logger logger = LoggerFactory.getLogger(Project2Application.class);

	public static void main(String[] args) {
		logger.info("Starting Project2Application...");

		SpringApplication.run(Project2Application.class, args);

		logger.info("Project2Application Started Successfully!");
	}
}
