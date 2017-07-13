package com.sample.ds;

import com.sample.ds.exception.EmptyQueueException;
import com.sample.ds.exception.EmptyStackException;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DSTest extends TestCase {

	public void testLinkedListStack() throws EmptyStackException {
		LinkedListStack<String> stackDS = new LinkedListStack<String>();
		stackDS.push("s");
		Assert.assertEquals("s", stackDS.pop());
		stackDS.push("r");
		Assert.assertEquals("r", stackDS.pop());
		stackDS.push("i");
		Assert.assertEquals("i", stackDS.pop());
		stackDS.push("n");
		stackDS.push("i");
		Assert.assertEquals("i", stackDS.pop());
		Assert.assertEquals("n", stackDS.pop());
		try {
			stackDS.pop();
			fail();
		} catch (EmptyStackException e) {
		}
	}

	public void testLinkedListQueueDS() throws EmptyQueueException {
		LinkedListQueue<String> queue = new LinkedListQueue<>();
		queue.addLast("s");
		Assert.assertEquals("s", queue.removeFirst());
		queue.addLast("r");
		Assert.assertEquals("r", queue.removeFirst());
		queue.addLast("i");
		queue.addLast("n");
		queue.addLast("i");
		Assert.assertEquals("i,n,i", queue.toString());
		Assert.assertEquals("i", queue.removeFirst());
		Assert.assertEquals("n", queue.removeFirst());
		Assert.assertEquals("i", queue.removeFirst());
		Assert.assertEquals("null", queue.toString());
		try {
			Assert.assertEquals("s", queue.removeFirst());
			fail();
		} catch (EmptyQueueException e) {

		}
	}

	public void testArrayStackDS() throws EmptyStackException {
		StackDS<String> stackDS = new ArrayStack<String>();
		stackDS.push("s");
		Assert.assertEquals("s", stackDS.pop());
		stackDS.push("r");
		Assert.assertEquals(1, stackDS.size());
		Assert.assertEquals("r", stackDS.pop());
		stackDS.push("i");
		Assert.assertEquals("i", stackDS.pop());
		stackDS.push("n");
		stackDS.push("i");
		Assert.assertEquals(2, stackDS.size());
		Assert.assertEquals("i", stackDS.pop());
		Assert.assertEquals("n", stackDS.pop());
		Assert.assertEquals(0, stackDS.size());
		try {
			stackDS.pop();
			fail();
		} catch (EmptyStackException e) {
		}
	}

}
