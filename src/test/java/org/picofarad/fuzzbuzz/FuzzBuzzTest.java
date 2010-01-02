package org.picofarad.fuzzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FuzzBuzzTest {
	@Test
	public void oneGivesOne() throws Exception {
		assertEquals("1", FuzzBuzz.play(1));
	}

	@Test
	public void twoGivesTwo() throws Exception {
		assertEquals("2", FuzzBuzz.play(2));
	}

	@Test
	public void threeGivesFuzz() throws Exception {
		assertEquals("fuzz", FuzzBuzz.play(3));
	}

	@Test
	public void fourGivesFour() throws Exception {
		assertEquals("4", FuzzBuzz.play(4));
	}

	@Test
	public void fiveGivesBuzz() throws Exception {
		assertEquals("buzz", FuzzBuzz.play(5));
	}
}
