package com.sample.ds;

import com.sample.ds.exception.EmptyStackException;

/**
 * 
 * @author Srinivasan
 * 
 *         This is a linked list implementation of a Stack data structure. It
 *         supports basic push and pop operations and uses generics to support
 *         stack of any type.
 * 
 *
 * 
 */
public class LinkedListStack<T> implements StackDS<T> {

	private int length;

	private Node first;

	private class Node {
		T value;
		Node next;
	}

	public void push(T in) {
		Node temp = first;
		first = new Node();
		first.value = in;
		first.next = temp;
		length++;
	}

	public T pop() throws EmptyStackException {
		if (length == 0) {
			throw new EmptyStackException();
		}
		Node temp = first;
		first = first.next;
		length--;
		return temp.value;
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
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		return length;
	}

}
