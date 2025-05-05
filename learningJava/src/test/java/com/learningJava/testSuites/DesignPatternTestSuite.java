package com.learningJava.testSuites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import com.learningJava.designPatterns.AbstractFactoryDesignPatternTest;
import com.learningJava.designPatterns.AdapterDesignPatternTest;
import com.learningJava.designPatterns.BridgeDesignPatternTest;
import com.learningJava.designPatterns.BuilderDesignPatternTest;
import com.learningJava.designPatterns.CompositeDesignPatternTest;
import com.learningJava.designPatterns.DecoratorDesignPatternTest;
import com.learningJava.designPatterns.FacadeDesignPatternTest;
import com.learningJava.designPatterns.FactoryDesignPatternTest;
import com.learningJava.designPatterns.FlyweightDesignPatternTest;
import com.learningJava.designPatterns.ObjectPoolDesignPatternTest;
import com.learningJava.designPatterns.PrototypeDesignPatternTest;
import com.learningJava.designPatterns.ProxyDesignPatternTest;
import com.learningJava.designPatterns.SingletonDesignPatternTest;

@Suite
@SelectClasses({FactoryDesignPatternTest.class,
	AbstractFactoryDesignPatternTest.class,
	SingletonDesignPatternTest.class,
	PrototypeDesignPatternTest.class,
	BuilderDesignPatternTest.class,
	ObjectPoolDesignPatternTest.class,
	AdapterDesignPatternTest.class,
	BridgeDesignPatternTest.class,
	CompositeDesignPatternTest.class,
	DecoratorDesignPatternTest.class,
	FacadeDesignPatternTest.class,
	FlyweightDesignPatternTest.class,
	ProxyDesignPatternTest.class})
public class DesignPatternTestSuite {
	
}
