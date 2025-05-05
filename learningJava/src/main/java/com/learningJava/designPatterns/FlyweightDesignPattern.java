package com.learningJava.designPatterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Forest with many trees

public class FlyweightDesignPattern {
	List<Tree> trees = new ArrayList<>();

	public void plantTree(int x, int y, String name, String color, String texture) {
		TreeType type = TreeFactory.getTreeType(name, color, texture);
		trees.add(new Tree(type, x, y));
	}

	public String draw() {
		return trees.stream().map(t-> t.draw()).reduce((s1,s2)->s1+","+s2).get();
	}	
}

//Flyweight: shared TreeType.
class TreeType{
	private String name;
	private String color;
	private String texture;

	public TreeType(String name, String color, String texture) {
		super();
		this.name = name;
		this.color = color;
		this.texture = texture;
	}

	public String draw(int x, int y) {
		return "drawing " + name + " tree at ( " + x + " , "+y+" )";
	}
}

//Factory to reuse treetypes.
class TreeFactory{
	private static Map<String, TreeType> treeTypes = new HashMap<>();

	public static TreeType getTreeType(String name, String color ,String texture) {
		String key = name+color+texture;
		if(!treeTypes.containsKey(key)) {
			treeTypes.put(key, new TreeType(name, color, texture));
		}
		return treeTypes.get(key);
	}
}

//Tree with unique position (Extrinsic).
class Tree{
	private TreeType type;
	private int x, y;

	public Tree(TreeType type, int x, int y) {
		super();
		this.type = type;
		this.x = x;
		this.y = y;
	}

	public String draw() {
		return type.draw(x, y);
	}
}

