package com.learningJava.designPatterns;

//Client
public class CommandPattern {
	
	Light light = new Light();
	Command turnOn = new LightOnCommand(light);
}

//command interface
interface Command{
	boolean execute();
}

//Receiver
class Light{
	boolean turnOn() {
		return true;
	}
}


//Concrete command
class LightOnCommand implements Command{
	Light light;

	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}
	
	@Override
	public boolean execute() {
		return this.light.turnOn();
	}
}