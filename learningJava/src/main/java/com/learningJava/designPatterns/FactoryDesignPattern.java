package com.learningJava.designPatterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactoryDesignPattern {
	public Shape getShape(String shapeType, int attribute) {
		switch(shapeType) {
		case "Circle": return new Circle(attribute);
		case "Triangle": return new Triangle(attribute);
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
	
	int radius; 
	
	Circle(int radius){
		this.radius = radius;
		this.setName();
	}

	@Override
	void display() {
		log.info(this.name + " with radius " + this.radius);
	}
	
	@Override
	void setName() {
		this.name = "Circle";
	}
}

class Triangle extends Shape{
	int side;
	
	Triangle(int side){
		this.side = side;
		this.setName();
	}

	@Override
	void display() {
		log.info(name + " with side length of " + this.side);
	}
	
	@Override
	void setName() {
		this.name = "Triangle";
	}
}