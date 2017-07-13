package com.sample.ds;

import com.sample.ds.exception.EmptyQueueException;

/**
 * Linked list implementation of a Queue. Does all inserts and deletes in O(1)
 * 
 */

public class LinkedListQueue<T> implements QueueDS<T> {

	private Node first;

	private Node last;

	private int size;

	private class Node {
		private T value;
		private Node next;
	}

	public void addLast(T objectToAdd) {
		Node oldLast = last;
		last = new Node();
		last.value = objectToAdd;
		if (isEmpty()) {
			first = last;
		} else {
			oldLast.next = last;
		}
		size++;

	}

	public T removeFirst() throws EmptyQueueException {
		if (isEmpty()) {
			throw new EmptyQueueException();
		}
		Node temp = first;
		first = first.next;
		if (isEmpty()) {
			last = null;
		}
		size--;
		return temp.value;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		Node temp = first;
		if (temp == null) {
			return "null";
		}
		while (temp != null) {
			builder.append(temp.value);
			if (temp.next != null) {
				builder.append(",");
			}
			temp = temp.next;
		}
		return builder.toString();
	}

	@Override
	public int size() {
		return size;
	}

}
