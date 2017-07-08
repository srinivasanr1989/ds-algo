package com.sample.ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/***
 * 
 * @author Srinivasan
 *
 */

public class ListStructures {

	public static void main(String[] a) throws InterruptedException {
		ArrayListInsertor insertArrayListTask = new ListStructures().new ArrayListInsertor();
		LinkedListInsertor insertLinkedListTask = new ListStructures().new LinkedListInsertor();
		ListIteratorInsertor insertListIteratorTask = new ListStructures().new ListIteratorInsertor();
		Thread thread1 = new Thread(insertArrayListTask);
		Thread thread2 = new Thread(insertLinkedListTask);
		Thread thread3 = new Thread(insertListIteratorTask);
		thread1.start();
		thread2.start();
		thread3.start();
	}

	private class ArrayListInsertor implements Runnable {

		private List<Integer> multiplesofNineteen = new ArrayList<Integer>();

		public void run() {
			long start = System.currentTimeMillis();
			for (int i = 0; i < Integer.MAX_VALUE / 1000; i++) {
				multiplesofNineteen.add(i);
			}
			long end = System.currentTimeMillis();
			System.out.println("Timetaken by " + multiplesofNineteen.getClass().getName() + ":" + (end - start));
		}

	}

	private class LinkedListInsertor implements Runnable {

		private List<Integer> multiplesofNineteen = new LinkedList<Integer>();

		public void run() {
			long start = System.currentTimeMillis();
			for (int i = 0; i < Integer.MAX_VALUE / 1000; i++) {
				multiplesofNineteen.add(i);
			}
			long end = System.currentTimeMillis();
			System.out.println("Timetaken by " + multiplesofNineteen.getClass().getName() + ":" + (end - start));
		}

	}

	private class ListIteratorInsertor implements Runnable {

		private ListIterator<Integer> multiplesofNineteen = new LinkedList<Integer>().listIterator();

		public void run() {
			long start = System.currentTimeMillis();
			for (int i = 0; i < Integer.MAX_VALUE / 1000; i++) {
				multiplesofNineteen.add(i);
			}
			long end = System.currentTimeMillis();
			System.out.println("Timetaken by " + multiplesofNineteen.getClass().getName() + ":" + (end - start));
		}

	}

}
