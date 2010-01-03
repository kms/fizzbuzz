package org.picofarad.fuzzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FuzzBuzzTest {
	private FuzzBuzz fb;
	private FuzzBuzz cfb;

	@Before
	public void initialize() {
		fb = FuzzBuzz.createGeneralFuzzBuzzGame();
		cfb = FuzzBuzz.createCoconutFuzzBuzzGame();
	}

	@Test
	public void testPlayWithPlainNumbers() throws Exception {
		assertEquals("1", fb.play(1));
		assertEquals("2", fb.play(2));
	}

	@Test
	public void testPlayWithDivisibleByOneRule() throws Exception {
		assertEquals("fuzz", fb.play(3));
		assertEquals("fuzz", fb.play(6));

		assertEquals("buzz", fb.play(5));

		assertEquals("coconut", cfb.play(4));
	}

	@Test
	public void testPlayWithDivisibleByMultipleRuleNumbers() throws Exception {
		assertEquals("fuzz buzz", fb.play(15));
		assertEquals("fuzz buzz", fb.play(30));

		assertEquals("fuzz buzz coconut", cfb.play(60));
	}
}
