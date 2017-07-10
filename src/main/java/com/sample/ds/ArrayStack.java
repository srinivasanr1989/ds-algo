package com.sample.ds;

public class ArrayStack<T> implements StackDS<T> {

	Object[] arr;

	int index;

	final int INIT_SIZE = 10;

	public ArrayStack(int size) {
		if (size < 0) {
			throw new IllegalArgumentException("Size of stack must be positive");
		}
		arr = new Object[size];
	}

	public ArrayStack() {
		arr = new Object[INIT_SIZE];
	}

	@Override
	public void push(T obj) {
		if (arr.length == index) {
			// Multiply size of array by 2
			resize(arr.length << 1);
		}
		arr[index++] = obj;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() {

		T item = (T) arr[--index];
		// To handle loitering
		arr[index] = null;
		if (arr.length == index / 4) {
			// maxsize/2 to avoid thrashing
			resize(arr.length >> 1);
		}
		return item;
	}

	@Override
	public boolean isEmpty() {
		return index == 0;
	}

	@Override
	public int size() {
		return index;
	}

	private void resize(int size) {
		Object[] copy = new Object[size];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		arr = copy;
	}

}