package seed.leetcode.demo.A1001to1100;

import java.util.Stack;

public class A1003_CheckIfWordIsValidAfterSubstitutions {

	public boolean isValid(String s) {
		if (s.length() == 0)
			return true;
		if (!s.startsWith("a"))
			return false;

		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c == 'a') {
				stack.push('c');
				stack.push('b');
			} else if (stack.isEmpty() || !stack.pop().equals(c)) {
				return false;
			}
		}

		return stack.isEmpty();
	}
}
