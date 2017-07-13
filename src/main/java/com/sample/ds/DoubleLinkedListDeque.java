package com.sample.ds;

import com.sample.ds.exception.EmptyQueueException;

/**
 *
 * Deque Implementation using a double linked list.
 * 
 **/

public class DoubleLinkedListDeque<E> implements DequeDS<E> {

	private Node front;

	private Node rear;

	int size;

	private class Node {
		E value;
		Node next;
		Node prev;
	}

	/* Adds an element to the rear/end of the list */
	@Override
	public void addLast(E obj) {
		if (size == 0) {
			rear = new Node();
			rear.value = obj;
			front = rear;
		} else {
			Node oldRear = rear;
			rear = new Node();
			rear.value = obj;
			rear.prev = oldRear;
			oldRear.next = rear;
		}
		size++;
	}

	/* Removes an element from the rear/end of the list */
	@Override
	public E removeFirst() throws EmptyQueueException {
		Node oldFront = null;
		E item = null;
		if (isEmpty()) {
			throw new EmptyQueueException();
		} else {
			oldFront = front;
			item = oldFront.value;
			front = front.next;
			size--;
		}
		return item;
	}

	/* Adds an element to the front/beginning of the list */
	public void addFirst(E obj) {
		if (size == 0) {
			front = new Node();
			front.value = obj;
			rear = front;
		} else {
			Node oldFront = front;
			front = new Node();
			front.value = obj;
			front.next = oldFront;
			oldFront.prev = front;
		}
		size++;
	}

	/* Removes an element from the front/beginning of the list */
	public E removeLast() throws EmptyQueueException {
		E item = null;
		Node oldRear = null;
		if (isEmpty()) {
			throw new EmptyQueueException();
		} else {
			oldRear = rear;
			item = oldRear.value;
			rear = rear.prev;
			size--;
			return item;
		}
	}

	/* Checks if the Deque is empty */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/* Returns the size of the Deque */
	@Override
	public int size() {
		return size;
	}

	/* Returns a comma separated String representation of the Deque */
	public String toString() {
		StringBuilder builder = new StringBuilder();
		Node temp = front;
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

}
