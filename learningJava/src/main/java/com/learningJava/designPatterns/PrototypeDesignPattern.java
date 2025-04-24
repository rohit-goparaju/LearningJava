package com.learningJava.designPatterns;

interface Prototype<T>{
	T getClone();
}

public class PrototypeDesignPattern implements Prototype<PrototypeDesignPattern>{
	String name;
	int value;
	
	public PrototypeDesignPattern(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public PrototypeDesignPattern getClone() {
		return new PrototypeDesignPattern(this.name, this.value);
	}
}
