package com.learningJava.designPatterns;

public class DecoratorDesignPattern extends CoffeeDecorator {
	public DecoratorDesignPattern(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public String getDesctription() {
		return super.getDesctription() + " milk";
	}
	
	@Override
	public double getCost() {
		return super.getCost() + 5;
	}
}

interface Coffee{
	String getDesctription();
	double getCost();
}

class SimpleCoffee implements Coffee{
	@Override
	public double getCost() {
		return 10;
	}
	
	@Override
	public String getDesctription() {
		return "Simple coffee";
	}
}

abstract class CoffeeDecorator implements Coffee{
	Coffee decoratedCoffee;
	public CoffeeDecorator(Coffee coffee) {
		this.decoratedCoffee = coffee;
	}
	
	@Override
	public double getCost() {
		return decoratedCoffee.getCost();
	}
	
	@Override
	public String getDesctription() {
		return decoratedCoffee.getDesctription();
	}
}


