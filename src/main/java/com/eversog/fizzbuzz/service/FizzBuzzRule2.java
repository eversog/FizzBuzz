package com.eversog.fizzbuzz.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author gary
 * Rule 2:
 * A number is Fizz if it is divisible by 3 or if it has 3 in it.
 * A number is Buzz if it is divisible by 5 or if it has 5 in it.
 * A number is FizzBuzz if it satisfies both criteria.
 */
@Component
@Profile("Rule2")
public class FizzBuzzRule2 implements FizzBuzz {

	private static final Logger LOG = LoggerFactory.getLogger(FizzBuzzRule2.class);

	private StringBuilder buffer = new StringBuilder();

	@Override
	public String apply(int num) {
		buffer.setLength(0);
		if (num < 1)
			buffer.append(ERROR);
		else {
			String numStr = Integer.toString(num);
			if (num % 3 == 0 || numStr.contains("3"))
				buffer.append(FIZZ);

			if (num % 5 == 0 || numStr.contains("5"))
				buffer.append(BUZZ);

			if (buffer.length() == 0)
				buffer.append(numStr);
		}

		LOG.info("{}: {}", num, buffer);
		return buffer.toString();
	}
}
