package com.sample.ds;

import junit.framework.Assert;

public class DSTest {

	public void testPushPopHappy() throws EmptyStackException {
		StackDS<String> stackDS = new StackDS<String>();
		stackDS.push("s");
		stackDS.push("r");
		stackDS.push("i");
		stackDS.push("n");
		stackDS.push("i");
		Assert.assertEquals("i", stackDS.pop());
	}

}
