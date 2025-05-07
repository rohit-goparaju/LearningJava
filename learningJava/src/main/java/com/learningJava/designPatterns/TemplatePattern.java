package com.learningJava.designPatterns;

import java.util.StringJoiner;

public class TemplatePattern {
	Game r6 = new R6Siege();
}

//Template class
abstract class Game{
	//structure defined by base class
	public final String play() {
		StringJoiner strJoiner = new StringJoiner(",");
		strJoiner.add(init());
		strJoiner.add(start());
		strJoiner.add(stop());
		
		return strJoiner.toString();
	}
	
	abstract String init();
	abstract String start();
	abstract String stop();
}

class R6Siege extends Game{
	@Override
	String init() {
		return "R6Siege initialized";
	}
	
	@Override
	String start() {
		return "R6Siege started";
	}
	
	@Override
	String stop() {
		return "R6Siege stopped";
	}
}