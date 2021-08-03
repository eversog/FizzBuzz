package com.eversog.fizzbuzz.service;

import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

	private static final Logger LOG = LoggerFactory.getLogger(FizzBuzzService.class);

	public void executeFizzBuzz(int maxNum) {
		IntStream.rangeClosed(1, maxNum).forEach(i -> {
			if (i % 3 == 0)
				if (i % 5 == 0)
					LOG.info("FizzBuzz");
				else
					LOG.info("Fizz");
			else if (i % 5 == 0)
				LOG.info("Buzz");
			else
				LOG.info("{}", i);
		});
	}
}
