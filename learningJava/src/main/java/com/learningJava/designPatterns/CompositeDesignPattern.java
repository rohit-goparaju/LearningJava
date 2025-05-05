package com.learningJava.designPatterns;

import java.util.ArrayList;
import java.util.List;

public class CompositeDesignPattern implements Graphic {
	List<Graphic> children = new ArrayList<>();

	public void add(Graphic g) {
		children.add(g);
	}

	public void remove(Graphic g) {
		children.remove(g);
	}

	@Override
	public String draw() {

		String drawResult = "";

		for(Graphic g : children) {
			drawResult = drawResult + g.draw() + " ";
		}
		return drawResult;
	}
}

interface Graphic{
	String draw();

}

class CircleGraphic implements Graphic{
	@Override
	public String draw() {
		return "Drawing circle";
	}
}

class SquareGraphic implements Graphic{
	@Override
	public String draw() {
		return "Drawing square";
	}
}
