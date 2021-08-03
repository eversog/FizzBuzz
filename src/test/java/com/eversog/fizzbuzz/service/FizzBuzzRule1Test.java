package com.eversog.fizzbuzz.service;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class FizzBuzzRule1Test {

	private FizzBuzzRule1 fizzBuzzRule1 = new FizzBuzzRule1();

	@Test
	public void should_return_Error_when_non_positive() {
		Assert.assertEquals("Error", fizzBuzzRule1.apply(0));
		Assert.assertEquals("Error", fizzBuzzRule1.apply(-1));
	}

	@Test
	public void should_return_Fizz_when_divisible_by_3() {
		Assert.assertEquals("Fizz", fizzBuzzRule1.apply(3));
		Assert.assertEquals("Fizz", fizzBuzzRule1.apply(12));
		Assert.assertEquals("Fizz", fizzBuzzRule1.apply(63));
	}

	@Test
	public void should_return_Buzz_when_divisible_by_5() {
		Assert.assertEquals("Buzz", fizzBuzzRule1.apply(5));
		Assert.assertEquals("Buzz", fizzBuzzRule1.apply(25));
		Assert.assertEquals("Buzz", fizzBuzzRule1.apply(65));
	}

	@Test
	public void should_return_FizzBuzz_when_divisible_by_3_and_5() {
		Assert.assertEquals("FizzBuzz", fizzBuzzRule1.apply(15));
		Assert.assertEquals("FizzBuzz", fizzBuzzRule1.apply(45));
		Assert.assertEquals("FizzBuzz", fizzBuzzRule1.apply(90));
	}

	@Test
	public void should_return_number_when_not_divisible_by_3_or_5() {
		Assert.assertEquals("2", fizzBuzzRule1.apply(2));
		Assert.assertEquals("23", fizzBuzzRule1.apply(23));
		Assert.assertEquals("74", fizzBuzzRule1.apply(74));
	}
}
