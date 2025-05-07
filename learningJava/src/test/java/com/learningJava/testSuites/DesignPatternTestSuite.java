package com.learningJava.testSuites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import com.learningJava.designPatterns.AbstractFactoryDesignPatternTest;
import com.learningJava.designPatterns.AdapterDesignPatternTest;
import com.learningJava.designPatterns.BridgeDesignPatternTest;
import com.learningJava.designPatterns.BuilderDesignPatternTest;
import com.learningJava.designPatterns.ChainOfResponsibilityDesignPatternTest;
import com.learningJava.designPatterns.CommandPatternTest;
import com.learningJava.designPatterns.CompositeDesignPatternTest;
import com.learningJava.designPatterns.DecoratorDesignPatternTest;
import com.learningJava.designPatterns.FacadeDesignPatternTest;
import com.learningJava.designPatterns.FactoryDesignPatternTest;
import com.learningJava.designPatterns.FlyweightDesignPatternTest;
import com.learningJava.designPatterns.InterpreterPatternTest;
import com.learningJava.designPatterns.MediatorPattern;
import com.learningJava.designPatterns.MementoPatternTest;
import com.learningJava.designPatterns.ObjectPoolDesignPatternTest;
import com.learningJava.designPatterns.ObserverPatternTest;
import com.learningJava.designPatterns.PrototypeDesignPatternTest;
import com.learningJava.designPatterns.ProxyDesignPatternTest;
import com.learningJava.designPatterns.SingletonDesignPatternTest;
import com.learningJava.designPatterns.StatePatternTest;
import com.learningJava.designPatterns.StrategyPatternTest;

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
	ProxyDesignPatternTest.class,
	ChainOfResponsibilityDesignPatternTest.class,
	CommandPatternTest.class,
	InterpreterPatternTest.class,
	MediatorPattern.class,
	MementoPatternTest.class,
	ObserverPatternTest.class,
	StatePatternTest.class,
	StrategyPatternTest.class})
public class DesignPatternTestSuite {
	
}
