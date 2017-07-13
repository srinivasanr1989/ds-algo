package com.sample.ds;

import com.sample.ds.exception.EmptyQueueException;

public interface DequeDS<E> extends QueueDS<E> {

	public void addFirst(E obj);

	public E removeLast() throws EmptyQueueException;

}
