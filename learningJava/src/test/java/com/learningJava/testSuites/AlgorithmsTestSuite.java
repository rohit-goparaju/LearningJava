package com.learningJava.testSuites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import com.learningJava.algorithms.BubbleSortTest;

@Suite
@SelectClasses({
	BubbleSortTest.class
})
public class AlgorithmsTestSuite {

}
