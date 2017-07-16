package com.sample.ds.appl;

import com.sample.ds.exception.EmptyStackException;
import com.sample.ds.stack.appl.ExpressionBalancer;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ExpressionBalancerTest extends TestCase {

	public void testAreBracesBalanced() {
		ExpressionBalancer balancer = new ExpressionBalancer();
		try {
			Assert.assertTrue(balancer.areBracesBalanced("()"));
			Assert.assertTrue(balancer.areBracesBalanced("()[]{}"));
			Assert.assertTrue(balancer.areBracesBalanced("([]){}"));
			Assert.assertTrue(balancer.areBracesBalanced("{([])}"));
			Assert.assertTrue(balancer.areBracesBalanced("{([()(){}{()}])}"));
			Assert.assertTrue(balancer.areBracesBalanced("{([()(){}{(2*3)}])}"));
			Assert.assertFalse(balancer.areBracesBalanced("({([()(){}{(2*3)}])}"));
		} catch (EmptyStackException e) {
			fail();
		}
	}

}
