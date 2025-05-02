package com.learningJava.designPatterns;

public class BridgeDesignPattern extends ShapeDesign {

	public BridgeDesignPattern(Color color) {
		super(color);
	}
	
	@Override
	String draw() {
		return "Drawing square " + color.applyColor();
	}
}

interface Color{
	String applyColor();
}

class RedColor implements Color{
	@Override
	public String applyColor() {
		return "Applying red color";
	}
}

abstract class ShapeDesign{
	Color color; //bridge
	ShapeDesign(Color color){
		this.color = color;
	}
	
	abstract String draw();
}

