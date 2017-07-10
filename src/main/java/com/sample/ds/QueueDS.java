package com.sample.ds;

public interface QueueDS<E> {

	void add(E obj);

	E remove() throws Exception;

	boolean isEmpty();

	int size();

}
