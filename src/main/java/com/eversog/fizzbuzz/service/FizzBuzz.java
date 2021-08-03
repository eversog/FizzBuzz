package com.eversog.fizzbuzz.service;

public interface FizzBuzz {

	static final String ERROR = "Error";
	static final String FIZZ = "Fizz";
	static final String BUZZ = "Buzz";
	static final String FIZZ_BUZZ = FIZZ + BUZZ;

	String apply(int num);
}
