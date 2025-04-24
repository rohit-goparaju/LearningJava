package com.learningJava.designPatterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactoryDesignPattern {
	public Shape getShape(String shapeType) {
		switch(shapeType) {
		case "Circle": return new Circle();
		case "Triangle": return new Triangle();
		default: return null;
		}
	}
}

abstract class Shape{
	public static final Logger log = LoggerFactory.getLogger(Shape.class);
	String name;

	abstract void setName();

	void display() {
		log.info(name);
	}
}

class Circle extends Shape{

	Circle(){
		this.setName();
	}

	@Override
	void setName() {
		this.name = "Circle";
	}
}

class Triangle extends Shape{
	Triangle(){
		this.setName();
	}

	@Override
	void setName() {
		this.name = "Triangle";
	}
}