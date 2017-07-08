package com.sample.ds;

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
public class StackDS<T> {

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

}
