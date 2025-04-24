package com.learningJava.designPatterns;

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
	String name;

	abstract void setName();

	String getDisplayString() {
		return name;
	}
}

class Circle extends Shape{
	
	int radius; 
	
	Circle(int radius){
		this.radius = radius;
		this.setName();
	}

	@Override
	String getDisplayString() {
		return (this.name + " with radius " + this.radius);
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
	String getDisplayString() {
		return(name + " with side " + this.side);
	}
	
	@Override
	void setName() {
		this.name = "Triangle";
	}
}