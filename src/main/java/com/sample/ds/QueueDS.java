package com.sample.ds;

import com.sample.ds.exception.EmptyQueueException;

public interface QueueDS<E> {

	void addLast(E obj);

	E removeFirst() throws EmptyQueueException;

	boolean isEmpty();

	int size();

}
