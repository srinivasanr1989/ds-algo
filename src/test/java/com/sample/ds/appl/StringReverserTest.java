package com.sample.ds.appl;

import com.sample.ds.ArrayStack;
import com.sample.ds.StackDS;
import com.sample.ds.exception.EmptyStackException;
import com.sample.ds.stack.appl.Reversals;

import junit.framework.Assert;
import junit.framework.TestCase;

public class StringReverserTest extends TestCase {

	public void testStringReverse() {
		Reversals reverser = new Reversals();
		StackDS<String> stack = new ArrayStack<>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		try {
			Assert.assertEquals("program.reversal.string.a.is.this",
					reverser.reverseString("this.is.a.string.reversal.program", '.'));
			Assert.assertEquals("repo.git.my.to.welcome", reverser.reverseString("welcome.to.my.git.repo", '.'));
			Assert.assertEquals("repo.git.my.to.welcome", reverser.reverseString("welcome.to.my.git.repo", '.'));
			System.out.println(stack.toString());
		} catch (EmptyStackException e) {
			fail();
		}
	}
}
