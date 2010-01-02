package org.picofarad.fuzzbuzz;

public class FuzzBuzz {
	public static String play(int i) {
		StringBuilder sb = new StringBuilder();

		if (divisibleBy(i, 3)) {
			sb.append("fuzz");
		}

		if (divisibleBy(i, 5)) {
			if (sb.length() != 0) {
				sb.append(" ");
			}
			sb.append("buzz");
		}

		if (sb.length() == 0) {
			return Integer.toString(i);
		} else {
			return sb.toString();
		}
	}

	private static boolean divisibleBy(int i, int divisor) {
		return (i % divisor) == 0;
	}
}
