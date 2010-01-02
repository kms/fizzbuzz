package org.picofarad.fuzzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FuzzBuzz {
	private List<Rule> rules;

	public FuzzBuzz() {
		rules = new ArrayList<Rule>();

		rules.add(new Rule(3, "fuzz"));
		rules.add(new Rule(5, "buzz"));
	}

	public static class Rule {
		public int divisor;
		public String word;

		public Rule(int i, String s) {
			this.divisor = i;
			this.word = s;
		}

		public void addWordIfDivisible(StringBuilder sb, int number) {
			if (divisibleBy(number, divisor)) {
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
