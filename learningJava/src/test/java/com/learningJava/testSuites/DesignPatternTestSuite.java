package com.learningJava.testSuites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import com.learningJava.designPatterns.AbstractFactoryDesignPatternTest;
import com.learningJava.designPatterns.FactoryDesignPatternTest;
import com.learningJava.designPatterns.SingletonDesignPatternTest;

@Suite
@SelectClasses({FactoryDesignPatternTest.class,AbstractFactoryDesignPatternTest.class,SingletonDesignPatternTest.class})
public class DesignPatternTestSuite {
	
}
