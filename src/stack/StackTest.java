package stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		boolean valid = isValid("[]{}()");
		System.out.println(valid);
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '[' || c == '{' || c == '(') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				Character peek = stack.pop();
				if (c == ')' && peek != '(') {
					return false;
				}
				if (c == '}' && peek != '{') {
					return false;
				}
				if (c == ']' && peek != '[') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
