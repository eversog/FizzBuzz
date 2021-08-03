package com.eversog.fizzbuzz.service;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author gary
 *
 * Write to file with results of "FizzBuzz" game, depending on which rule is
 * required (configured in application.properties).
 */
@Service
public class FileFizzBuzzService implements FizzBuzzService {

	private static final Logger LOG = LoggerFactory.getLogger(FileFizzBuzzService.class);

	@Autowired
	private FizzBuzzRule fizzBuzzRule;

	@Value("${spring.profiles.active:}")
	private String activeProfiles;

	@Override
	public void execute(int maxNum) {
		LOG.info("Using rule: {}", activeProfiles);
		try(PrintWriter writer = new PrintWriter(new FileWriter("src/main/resources/FizzBuzz.txt"))) {
			IntStream.rangeClosed(1, maxNum).forEach(i -> {
				writer.println(fizzBuzzRule.apply(i));
			});
		} catch(Exception e) {
			LOG.error("Error occurred", e);
		}
	}
}
