package com.learningJava.designPatterns;

public class FacadeDesignPattern {
	private CPU cpu;
	private Memory memory;
	private HardDrive hdd;
	
	public FacadeDesignPattern() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.hdd = new HardDrive();
	}
	
	public String startComputer() {
		return cpu.start() + " " + memory.load() + " " + hdd.read();
	}
}

class CPU{
	String start() {
		return "CPU started";
	}
}

class Memory{
	String load() {
		return "Memory loaded";
	}
}

class HardDrive{
	String read() {
		return "Reading from HDD";
	}
}