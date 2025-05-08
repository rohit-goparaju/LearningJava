package com.learningJava.testSuites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import com.learningJava.algorithms.BubbleSortTest;
import com.learningJava.algorithms.QuickSortTest;

@Suite
@SelectClasses({
	BubbleSortTest.class,
	QuickSortTest.class
})
public class AlgorithmsTestSuite {

}
