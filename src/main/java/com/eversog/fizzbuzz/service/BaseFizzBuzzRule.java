package com.eversog.fizzbuzz.service;

public abstract class BaseFizzBuzzRule implements FizzBuzzRule {

	protected void validate(int num) throws InvalidEntryException {
		if (num < 1)
			throw new InvalidEntryException("Invalid entry");
	}
}
