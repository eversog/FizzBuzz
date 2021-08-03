package com.eversog.fizzbuzz.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author gary
 * Rule 1:
 * A number is Fizz if it is divisible by 3.
 * A number is Buzz if it is divisible by 5.
 * A number is FizzBuzz if it satisfies both criteria.
 */
@Component
@Profile("Rule1")
public class FizzBuzzRule1 implements FizzBuzz {

	private static final Logger LOG = LoggerFactory.getLogger(FizzBuzzRule1.class);

	@Override
	public String apply(int num) {
		String buffer;
		if (num < 1)
			buffer = ERROR;
		else if (num % 15 == 0)
			buffer = FIZZ_BUZZ;
		else if (num % 3 == 0)
			buffer = FIZZ;
		else if (num % 5 == 0)
			buffer = BUZZ;
		else
			buffer = Integer.toString(num);

		LOG.info("{}: {}", num, buffer);
		return buffer;
	}
}
