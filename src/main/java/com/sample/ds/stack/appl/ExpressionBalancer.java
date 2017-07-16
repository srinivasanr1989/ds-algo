package com.sample.ds.stack.appl;

import com.sample.ds.ArrayStack;
import com.sample.ds.StackDS;
import com.sample.ds.exception.EmptyStackException;

public class ExpressionBalancer {

	public boolean areBracesBalanced(String input) throws EmptyStackException {
		StackDS<Character> balancerStack = new ArrayStack<>();
		char[] braces = input.toCharArray();
		for (Character brace : braces) {
			if (brace.equals('(') || brace.equals('{') || brace.equals('[')) {
				balancerStack.push(brace);
			} else if (brace.equals(')') && balancerStack.pop().equals('(')
					|| (brace.equals(']') && balancerStack.pop().equals('['))
					|| brace.equals('}') && balancerStack.pop().equals('{')) {
				continue;
			}
		}
		if (balancerStack.size() > 0) {
			return false;
		}
		return true;
	}

}
