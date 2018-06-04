package edu.ubbcluj.doghome;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DogHomeApplication {

	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.getLogger(DogHomeApplication.class);
		
		SpringApplication.run(DogHomeApplication.class, args);
		logger.info("Dog Home started!. You can reach the serverer via port 8080");
	}
}
