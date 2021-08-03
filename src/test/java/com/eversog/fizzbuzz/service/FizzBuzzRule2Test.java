package com.eversog.fizzbuzz.service;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class FizzBuzzRule2Test {

	private FizzBuzzRule2 fizzBuzzRule2 = new FizzBuzzRule2();

	@Test
	public void should_return_Error_when_non_positive() {
		Assert.assertEquals("Error", fizzBuzzRule2.apply(0));
		Assert.assertEquals("Error", fizzBuzzRule2.apply(-1));
	}

	@Test
	public void should_return_Fizz_when_divisible_by_or_contains_3() {
		Assert.assertEquals("Fizz", fizzBuzzRule2.apply(3));
		Assert.assertEquals("Fizz", fizzBuzzRule2.apply(12));
		Assert.assertEquals("Fizz", fizzBuzzRule2.apply(23));
	}

	@Test
	public void should_return_Buzz_when_divisible_by_or_contains_5() {
		Assert.assertEquals("Buzz", fizzBuzzRule2.apply(5));
		Assert.assertEquals("Buzz", fizzBuzzRule2.apply(25));
		Assert.assertEquals("Buzz", fizzBuzzRule2.apply(56));
	}

	@Test
	public void should_return_FizzBuzz_when_divisible_by_or_contains_3_and_5() {
		Assert.assertEquals("FizzBuzz", fizzBuzzRule2.apply(15));
		Assert.assertEquals("FizzBuzz", fizzBuzzRule2.apply(35));
		Assert.assertEquals("FizzBuzz", fizzBuzzRule2.apply(90));
	}

	@Test
	public void should_return_number_when_not_divisible_by_or_contains_3_or_5() {
		Assert.assertEquals("2", fizzBuzzRule2.apply(2));
		Assert.assertEquals("28", fizzBuzzRule2.apply(28));
		Assert.assertEquals("74", fizzBuzzRule2.apply(74));
	}
}
