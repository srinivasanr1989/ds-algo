package com.sample.ds;

import com.sample.ds.appl.ExpressionBalancerTest;

import junit.framework.TestResult;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTestSuite extends TestSuite {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTestSuite(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static TestSuite suite() {
		TestSuite testSuite = new TestSuite();
		testSuite.addTestSuite(StackQueueTest.class);
		testSuite.addTestSuite(DoubleLinkedListDequeTest.class);
		testSuite.addTestSuite(ExpressionBalancerTest.class);
		return testSuite;
	}

	public void testApp() {
		suite().run(new TestResult());
	}
}
