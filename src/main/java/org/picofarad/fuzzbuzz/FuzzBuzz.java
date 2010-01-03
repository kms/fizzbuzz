package org.picofarad.fuzzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FuzzBuzz {
	public static FuzzBuzz createGeneralFuzzBuzzGame() {
		List<Rule> generalFuzzBuzzRules = new ArrayList<Rule>();

		generalFuzzBuzzRules.add(new Rule(3, "fuzz"));
		generalFuzzBuzzRules.add(new Rule(5, "buzz"));

		return new FuzzBuzz(generalFuzzBuzzRules);
	}

	public static FuzzBuzz createCoconutFuzzBuzzGame() {
		List<Rule> coconutFuzzBuzzRules = new ArrayList<Rule>();

		coconutFuzzBuzzRules.add(new Rule(3, "fuzz"));
		coconutFuzzBuzzRules.add(new Rule(5, "buzz"));
		coconutFuzzBuzzRules.add(new Rule(4, "coconut"));

		return new FuzzBuzz(coconutFuzzBuzzRules);
	}

	private List<Rule> rules;

	private FuzzBuzz(List<Rule> r) {
		rules = r;
	}

	private static class Rule {
		public int divisor;
		public String word;

		public Rule(int i, String s) {
			this.divisor = i;
			this.word = s;
		}

		public void addWordIfDivisible(StringBuilder sb, int i) {
			if (divisibleBy(i, divisor)) {
				if (sb.length() != 0) {
					sb.append(" ");
				}
				sb.append(word);
			}
		}

		private boolean divisibleBy(int i, int divisor) {
			return (i % divisor) == 0;
		}
	}

	public String play(int number) {
		StringBuilder sb = new StringBuilder();

		for (Rule rule : rules) {
			rule.addWordIfDivisible(sb, number);
		}

		if (sb.length() == 0) {
			return Integer.toString(number);
		} else {
			return sb.toString();
		}
	}
}
