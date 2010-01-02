package org.picofarad.fuzzbuzz;

public class FuzzBuzz {
	public static String play(int i) {
		if (i == 3) {
			return "fuzz";
		} else if (i == 5) {
			return "buzz";
		} else {
			return Integer.toString(i);
		}
	}
}
