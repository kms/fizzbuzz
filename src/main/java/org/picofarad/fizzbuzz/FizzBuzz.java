package org.picofarad.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public static FizzBuzz createGeneralFizzBuzzGame() {
		List<Rule> generalFizzBuzzRules = new ArrayList<Rule>();

		generalFizzBuzzRules.add(new Rule(3, "fizz"));
		generalFizzBuzzRules.add(new Rule(5, "buzz"));

		return new FizzBuzz(generalFizzBuzzRules);
	}

	public static FizzBuzz createCoconutFizzBuzzGame() {
		List<Rule> coconutFizzBuzzRules = new ArrayList<Rule>();

		coconutFizzBuzzRules.add(new Rule(3, "fizz"));
		coconutFizzBuzzRules.add(new Rule(5, "buzz"));
		coconutFizzBuzzRules.add(new Rule(4, "coconut"));

		return new FizzBuzz(coconutFizzBuzzRules);
	}

	private List<Rule> rules;

	private FizzBuzz(List<Rule> r) {
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
