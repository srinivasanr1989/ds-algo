package com.sample.ds.appl;

import com.sample.ds.exception.EmptyStackException;
import com.sample.ds.stack.appl.ExpressionEvaluator;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ExpressionEvaluatorTest extends TestCase {

	public void testPostfixExpression() {
		ExpressionEvaluator evaluator = new ExpressionEvaluator();
		try {
			Assert.assertEquals(192.0, evaluator.evaluatePostFix("2321^4-222*+^*+2-"));
		} catch (EmptyStackException e) {
			fail();
		}
	}

}
