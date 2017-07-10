package com.sample.ds;

import com.sample.ds.exception.EmptyStackException;

public interface StackDS<E> {

	void push(E obj);

	E pop() throws EmptyStackException;

	boolean isEmpty();

	int size();

}
