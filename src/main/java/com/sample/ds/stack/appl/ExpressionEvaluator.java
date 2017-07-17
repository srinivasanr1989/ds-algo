package com.sample.ds.stack.appl;

import java.util.Arrays;
import java.util.List;

import com.sample.ds.ArrayStack;
import com.sample.ds.StackDS;
import com.sample.ds.exception.EmptyStackException;

public class ExpressionEvaluator {

	private static final List<Character> recognizedOperators = Arrays
			.asList(new Character[] { '*', '/', '+', '-', '^' });

	public double evaluatePostFix(String expression) throws EmptyStackException {

		StackDS<Double> operandStack = new ArrayStack<>();
		for (int i = 0; i < expression.length(); i++) {
			char currentValInExpression = expression.charAt(i);
			if (recognizedOperators.contains(currentValInExpression)) {
				operandStack.push(evaluate(operandStack.pop(), operandStack.pop(), currentValInExpression));
			} else {
				operandStack.push(Double.valueOf(Character.digit(currentValInExpression, 10)));
			}
		}
		if (operandStack.size() > 1) {
			return -1;
		}
		return operandStack.peek();
	}

	private double evaluate(double b, double a, char operator) {
		switch (operator) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			return a / b;
		case '^':
			return Math.pow(a, b);
		default:
			return -1;
		}
	}

}
