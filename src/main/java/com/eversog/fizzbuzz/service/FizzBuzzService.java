package com.eversog.fizzbuzz.service;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

	private static final Logger LOG = LoggerFactory.getLogger(FizzBuzzService.class);

	@Autowired
	private FizzBuzz fizzBuzz;

    @Value("${spring.profiles.active:}")
    private String activeProfiles;

	public void executeFizzBuzz(int maxNum) {
		LOG.info("Using rule: {}", activeProfiles);
		try(PrintWriter writer = new PrintWriter(new FileWriter("src/main/resources/FizzBuzz.txt"))) {
			IntStream.rangeClosed(1, maxNum).forEach(i -> {
				writer.println(fizzBuzz.apply(i));
			});
		} catch(Exception e) {
			LOG.error("Error occurred", e);
		}
	}
}
