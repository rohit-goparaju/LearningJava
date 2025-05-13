package com.learningJava.testSuites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import com.learningJava.algorithms.BubbleSortTest;
import com.learningJava.algorithms.InsertionSortTest;
import com.learningJava.algorithms.LinearSearchTest;
import com.learningJava.algorithms.MergeSortTest;
import com.learningJava.algorithms.QuickSortTest;
import com.learningJava.algorithms.SelectionSortTest;

@Suite
@SelectClasses({
	BubbleSortTest.class,
	QuickSortTest.class,
	MergeSortTest.class,
	SelectionSortTest.class,
	InsertionSortTest.class,
	LinearSearchTest.class
})
public class AlgorithmsTestSuite {

}
