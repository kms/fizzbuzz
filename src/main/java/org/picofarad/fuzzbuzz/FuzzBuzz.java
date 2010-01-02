package org.picofarad.fuzzbuzz;

public class FuzzBuzz {
	public static String play(int i) {
		StringBuilder sb = new StringBuilder();

		addWordIfDivisible(i, sb, 3, "fuzz");
		addWordIfDivisible(i, sb, 5, "buzz");

		if (sb.length() == 0) {
			return Integer.toString(i);
		} else {
			return sb.toString();
		}
	}

	private static void addWordIfDivisible(int i, StringBuilder sb,
			int divisor, String word) {
		if (divisibleBy(i, divisor)) {
			if (sb.length() != 0) {
				sb.append(" ");
			}
			sb.append(word);
		}
	}

	private static boolean divisibleBy(int i, int divisor) {
		return (i % divisor) == 0;
	}
}
