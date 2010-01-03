package org.picofarad.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.picofarad.fizzbuzz.FizzBuzz;

public class FizzBuzzTest {
	private FizzBuzz fb;
	private FizzBuzz cfb;

	@Before
	public void initialize() {
		fb = FizzBuzz.createGeneralFizzBuzzGame();
		cfb = FizzBuzz.createCoconutFizzBuzzGame();
	}

	@Test
	public void testPlayWithPlainNumbers() throws Exception {
		assertEquals("1", fb.play(1));
		assertEquals("2", fb.play(2));
	}

	@Test
	public void testPlayWithDivisibleByOneRule() throws Exception {
		assertEquals("fizz", fb.play(3));
		assertEquals("fizz", fb.play(6));

		assertEquals("buzz", fb.play(5));

		assertEquals("coconut", cfb.play(4));
	}

	@Test
	public void testPlayWithDivisibleByMultipleRuleNumbers() throws Exception {
		assertEquals("fizz buzz", fb.play(15));
		assertEquals("fizz buzz", fb.play(30));

		assertEquals("fizz buzz coconut", cfb.play(60));
	}
}
