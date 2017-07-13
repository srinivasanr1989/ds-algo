package com.sample.ds.other;

import com.sample.ds.ArrayStack;
import com.sample.ds.QueueDS;
import com.sample.ds.StackDS;
import com.sample.ds.exception.EmptyQueueException;
import com.sample.ds.exception.EmptyStackException;

public class QueueUsingStacks<E> implements QueueDS<E> {

	private StackDS<E> stack = new ArrayStack<>();

	private StackDS<E> reverseStack = new ArrayStack<>();

	@Override
	public void addLast(E obj) {
		while (!reverseStack.isEmpty()) {
			try {
				stack.push(reverseStack.pop());
			} catch (EmptyStackException e) {
				// Won't handle
			}
		}
		stack.push(obj);
	}

	@Override
	public E removeFirst() throws EmptyQueueException {
		while (!stack.isEmpty()) {
			try {
				reverseStack.push(stack.pop());
			} catch (EmptyStackException e) {
				// Won't handle
			}
		}
		try {
			return reverseStack.pop();
		} catch (EmptyStackException e) {
			throw new EmptyQueueException();
		}
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public int size() {
		return stack.size();
	}

}
