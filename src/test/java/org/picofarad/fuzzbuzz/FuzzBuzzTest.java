package org.picofarad.fuzzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FuzzBuzzTest {
	private FuzzBuzz fb;

	@Before
	public void initialize() {
		fb = new FuzzBuzz();
	}

	@Test
	public void oneGivesOne() throws Exception {
		assertEquals("1", fb.play(1));
	}

	@Test
	public void twoGivesTwo() throws Exception {
		assertEquals("2", fb.play(2));
	}

	@Test
	public void threeGivesFuzz() throws Exception {
		assertEquals("fuzz", fb.play(3));
	}

	@Test
	public void fourGivesFour() throws Exception {
		assertEquals("4", fb.play(4));
	}

	@Test
	public void fiveGivesBuzz() throws Exception {
		assertEquals("buzz", fb.play(5));
	}

	@Test
	public void sixGivesFuzz() throws Exception {
		assertEquals("fuzz", fb.play(6));
	}

	@Test
	public void tenGivesBuzz() throws Exception {
		assertEquals("buzz", fb.play(10));
	}

	@Test
	public void fifteenGivesFuzzBuzz() throws Exception {
		assertEquals("fuzz buzz", fb.play(15));
	}

	@Test
	public void thirtyGivesFuzzBuzz() throws Exception {
		assertEquals("fuzz buzz", fb.play(30));
	}
}
