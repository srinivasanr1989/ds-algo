package com.sample.ds.stack.appl;

import com.sample.ds.ArrayStack;
import com.sample.ds.StackDS;
import com.sample.ds.exception.EmptyStackException;

public class InfixToPostfixConverter {

	public String convert(String expression) throws EmptyStackException {
		char[] charsInExpression = expression.toCharArray();
		StringBuilder result = new StringBuilder();
		StackDS<Character> operatorStack = new ArrayStack<Character>();
		for (Object obj : charsInExpression) { // use charAt(i) to save space
			Character c = (Character) obj;
			if (c.equals('(')) {
				operatorStack.push(c);
			} else if (Character.isLetterOrDigit(c) || c.equals('(')) {
				result.append(c);
			} else if (c.equals(')')) {
				while (!operatorStack.isEmpty() && !operatorStack.peek().equals('(')) {
					result.append(operatorStack.pop());
				}
				if (!operatorStack.isEmpty() && !operatorStack.peek().equals('(')) {
					return "Invalid Expression";
				} else {
					operatorStack.pop();
				}
			} else {
				while (!operatorStack.isEmpty() && (getPrecedence(c) <= getPrecedence(operatorStack.peek()))) {
					result.append(operatorStack.pop());
				}
				operatorStack.push(c);
			}
		}
		while (!operatorStack.isEmpty()) {
			if (!operatorStack.peek().equals('(')) {
				result.append(operatorStack.pop());
			} else {
				return "Invalid Expression";
			}
		}
		return result.toString();
	}

	private int getPrecedence(Character in) {
		switch (in) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return -1;

		}
	}
}
