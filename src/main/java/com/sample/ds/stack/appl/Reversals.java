package com.sample.ds.stack.appl;

import com.sample.ds.ArrayStack;
import com.sample.ds.StackDS;
import com.sample.ds.exception.EmptyStackException;

public class Reversals {

	/**
	 * 
	 * @param String
	 *            input
	 * @param char
	 *            delimiter
	 * @return String reversedString
	 * @throws EmptyStackException
	 * 
	 *             Takes a delimited String as input and reverses it relative to the
	 *             delimiter. That is, "Hello-World" will be reversed relative to
	 *             the delimiter '-' as "World-Hello".
	 * 
	 *             Logic : 1) Scan the chars in the String, Repeat the following
	 *             steps till the end of the string 2) Append them one by one until
	 *             the delimiter is found 3) If delimiter is found, then push it to
	 *             Stack if Stack is empty 4) If Stack is not empty, pop the value
	 *             and append to the string 5) Push the String back to the Stack and
	 *             reset the StringBuilder/String
	 * 
	 */
	public String reverseString(String input, char delimiter) throws EmptyStackException {
		StringBuilder reverseStringBuilder = new StringBuilder();
		StackDS<String> delimitedStrings = new ArrayStack<>();
		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) != delimiter) {
				reverseStringBuilder.append(input.charAt(i)); // can be replaced with String.split() as well
			} else {
				if (delimitedStrings.isEmpty()) {
					delimitedStrings.push(reverseStringBuilder.toString());
				} else {
					reverseStringBuilder.append(".").append(delimitedStrings.pop());
					delimitedStrings.push(reverseStringBuilder.toString());
				}
				reverseStringBuilder.setLength(0);
			}
		}
		return reverseStringBuilder.append(".").append(delimitedStrings.pop()).toString();

	}

}
