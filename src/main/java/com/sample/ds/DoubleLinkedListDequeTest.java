package com.sample.ds;

import com.sample.ds.exception.EmptyQueueException;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DoubleLinkedListDequeTest extends TestCase {

	public void testDoubleLinkedListDequeAddRemoveRandom() throws Exception {
		DequeDS<String> deque = new DoubleLinkedListDeque<>();
		Assert.assertEquals(deque.size(), 0);
		deque.addFirst("s");
		deque.addLast("r");
		deque.addFirst("i");
		deque.addLast("n");
		deque.addLast("i");
		System.out.println("testDoubleLinkedListDequeRandomAddRemove after add:" + deque);
		Assert.assertEquals(deque.removeFirst(), "i");
		Assert.assertEquals(deque.removeLast(), "i");
		Assert.assertEquals(deque.removeLast(), "n");
		Assert.assertEquals(deque.removeLast(), "r");
		Assert.assertEquals(deque.size(), 1);
		Assert.assertEquals(deque.removeLast(), "s");
		System.out.println("testDoubleLinkedListDequeRandomAddRemove after remove:" + deque);
		try {
			Assert.assertEquals(deque.removeLast(), "s");
			fail();
		} catch (EmptyQueueException e) {

		}
	}

	public void testDoubleLinkedListDequeAddFirstRemoveLastOnly() throws Exception {
		DequeDS<String> deque = new DoubleLinkedListDeque<>();
		deque.addFirst("i");
		deque.addFirst("n");
		deque.addFirst("i");
		deque.addFirst("r");
		deque.addFirst("s");
		System.out.println("testDoubleLinkedListDequeAddFirstRemoveLastOnly after add:" + deque);
		Assert.assertEquals(deque.removeLast(), "i");
		Assert.assertEquals(deque.removeLast(), "n");
		Assert.assertEquals(deque.removeLast(), "i");
		Assert.assertEquals(deque.removeLast(), "r");
		Assert.assertEquals(deque.removeLast(), "s");
		System.out.println("testDoubleLinkedListDequeAddFirstRemoveLastOnly after remove:" + deque);
		try {
			Assert.assertEquals(deque.removeLast(), "s");
			fail();
		} catch (EmptyQueueException e) {

		}
	}

	public void testDoubleLinkedListDequeAddLastRemoveFirstOnly() throws Exception {
		DequeDS<String> deque = new DoubleLinkedListDeque<>();
		deque.addLast("i");
		deque.addLast("n");
		deque.addLast("i");
		deque.addLast("r");
		deque.addLast("s");
		Assert.assertEquals(deque.size(), 5);
		System.out.println("testDoubleLinkedListDequeAddLastRemoveFirstOnly after add:" + deque);
		Assert.assertEquals(deque.removeFirst(), "i");
		Assert.assertEquals(deque.removeFirst(), "n");
		Assert.assertEquals(deque.removeFirst(), "i");
		Assert.assertEquals(deque.removeFirst(), "r");
		Assert.assertEquals(deque.removeFirst(), "s");
		System.out.println("testDoubleLinkedListDequeAddLastRemoveFirstOnly after remove:" + deque);
		Assert.assertEquals(deque.size(), 0);
		try {
			Assert.assertEquals(deque.removeLast(), "s");
			fail();
		} catch (EmptyQueueException e) {

		}
	}

	public void testDoubleLinkedListDequeAddLastRemoveLastOnly() throws Exception {
		DequeDS<String> deque = new DoubleLinkedListDeque<>();
		deque.addLast("i");
		deque.addLast("n");
		deque.addLast("i");
		deque.addLast("r");
		deque.addLast("s");
		System.out.println("testDoubleLinkedListDequeAddLastRemoveLastOnly after add:" + deque);
		Assert.assertEquals(deque.removeLast(), "s");
		Assert.assertEquals(deque.removeLast(), "r");
		Assert.assertEquals(deque.removeLast(), "i");
		Assert.assertEquals(deque.size(), 2);
		Assert.assertEquals(deque.removeLast(), "n");
		Assert.assertEquals(deque.removeLast(), "i");
		System.out.println("testDoubleLinkedListDequeAddLastRemoveLastOnly after remove:" + deque);
		try {
			Assert.assertEquals(deque.removeLast(), "s");
			fail();
		} catch (EmptyQueueException e) {

		}
	}

	public void testDoubleLinkedListDequeAddFirstRemoveFirstOnly() throws Exception {
		DequeDS<String> deque = new DoubleLinkedListDeque<>();
		deque.addFirst("i");
		deque.addFirst("n");
		deque.addFirst("i");
		deque.addFirst("r");
		deque.addFirst("s");
		System.out.println("testDoubleLinkedListDequeAddFirstRemoveFirstOnly after add:" + deque);
		Assert.assertEquals(deque.removeFirst(), "s");
		Assert.assertEquals(deque.removeFirst(), "r");
		Assert.assertEquals(deque.removeFirst(), "i");
		Assert.assertEquals(deque.removeFirst(), "n");
		Assert.assertEquals(deque.removeFirst(), "i");
		System.out.println("testDoubleLinkedListDequeAddFirstRemoveFirstOnly after remove:" + deque);
		try {
			Assert.assertEquals(deque.removeLast(), "s");
			fail();
		} catch (EmptyQueueException e) {

		}
	}

	public void testDoubleLinkedListDequeAddFirstRemoveLastAlternate() throws Exception {
		DequeDS<String> deque = new DoubleLinkedListDeque<>();
		deque.addFirst("i");
		Assert.assertEquals(deque.removeLast(), "i");
		deque.addFirst("n");
		Assert.assertEquals(deque.removeLast(), "n");
		deque.addFirst("i");
		Assert.assertEquals(deque.removeLast(), "i");
		deque.addFirst("r");
		Assert.assertEquals(deque.removeLast(), "r");
		deque.addFirst("s");
		Assert.assertEquals(deque.removeLast(), "s");
		try {
			Assert.assertEquals(deque.removeLast(), "s");
			fail();
		} catch (EmptyQueueException e) {

		}
	}

}
