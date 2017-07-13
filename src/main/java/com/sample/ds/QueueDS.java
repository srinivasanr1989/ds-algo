package com.sample.ds;

public interface QueueDS<E> {

	void addLast(E obj);

	E removeFirst() throws Exception;

	boolean isEmpty();

	int size();

}
