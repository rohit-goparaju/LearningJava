package com.learningJava.testSuites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import com.learningJava.designPatterns.FactoryDesignPatternTest;

@Suite
@SelectClasses({FactoryDesignPatternTest.class})
public class DesignPatternTestSuite {
	
}
