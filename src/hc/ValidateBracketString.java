package hc;

import java.util.Stack;

public class ValidateBracketString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String parantheses = "(){}[]";
		boolean res = isValidParantheses(parantheses);
		if(res) {
			System.out.println("Valid Parantheses");
		} else {
			System.out.println("Invalid Parantheses");
		}
	}

	public static boolean isValidParantheses(String str) {
		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {
			if (ch == '(') {
				stack.push(')');
			} else if (ch == '{') {
				stack.push('}');
			} else if (ch == '[') {
				stack.push(']');
			} else if (stack.isEmpty() || stack.pop() != ch) {
				return false;
			}
		}
		return stack.isEmpty();
	}

}
