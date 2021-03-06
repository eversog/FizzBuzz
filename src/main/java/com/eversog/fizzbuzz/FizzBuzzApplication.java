package com.eversog.fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.eversog.fizzbuzz.service.FileFizzBuzzService;
import com.eversog.fizzbuzz.service.FizzBuzzService;

@SpringBootApplication
public class FizzBuzzApplication {

	private static final Logger LOG = LoggerFactory.getLogger(FizzBuzzApplication.class);

	@Autowired
	private FizzBuzzService fizzBuzzService;

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(FileFizzBuzzService service) {
		return (args) -> {
			LOG.info("Running executeFizzBuzz");
			fizzBuzzService.execute(100);
		};
	}
}
