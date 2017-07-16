package com.sample.ds;

import com.sample.ds.exception.EmptyStackException;
import com.sample.ds.stack.appl.InfixToPostfixConverter;

import junit.framework.Assert;
import junit.framework.TestCase;

public class InfixToPostfixConverterTest extends TestCase {

	public void testPostFixConverter() {
		InfixToPostfixConverter converter = new InfixToPostfixConverter();
		try {
			Assert.assertEquals("abcd^e-fgh*+^*+i-", converter.convert("a+b*(c^d-e)^(f+g*h)-i"));
			Assert.assertEquals("Invalid Expression", converter.convert("a+b*(c(^d-e)^(f+g*h)-i"));
		} catch (EmptyStackException e) {
			fail();
		}
	}

}
