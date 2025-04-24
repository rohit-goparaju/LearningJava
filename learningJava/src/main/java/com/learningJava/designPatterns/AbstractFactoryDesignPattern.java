package com.learningJava.designPatterns;

public class AbstractFactoryDesignPattern {
	public AbstractFactory<?> getFactory(String type){
		switch(type) {
		case "UtensilFactory": return new UtensilFactory();
		case "FurnitureFactory": return new FurnitureFactory();
		default: return null;
		}
	}
}

abstract class Utensil{
	String purpose; 
	
	abstract String getPurpose();
}

class Bowl extends Utensil{
	public Bowl(String purpose) {
		this.purpose = purpose;
	}
	
	@Override
	String getPurpose() {
		return this.purpose;
	}
}

class Spoon extends Utensil{
	public Spoon(String purpose) {
		this.purpose = purpose;
	}
	
	@Override
	String getPurpose() {
		return this.purpose;
	}
}

interface AbstractFactory<T>{
	T create(String type, String purpose);
}

class UtensilFactory implements AbstractFactory<Utensil>{
	@Override
	public Utensil create(String type, String purpose) {
		switch(type) {
		case "Spoon": return new Spoon(purpose);
		case "Bowl": return new Bowl(purpose);
		default: return null;
		}
	}
}

abstract class Furniture{
	String purpose;
	abstract String getPurpose();
}


class DiningChair extends Furniture{
	public DiningChair(String purpose) {
		this.purpose = purpose;
	}
	
	@Override
	String getPurpose() {
		return this.purpose;
	}
}

class DiningTable extends Furniture{
	public DiningTable(String purpose) {
		this.purpose = purpose;
	}
	
	@Override
	String getPurpose() {
		return this.purpose;
	}
}

class FurnitureFactory implements AbstractFactory<Furniture>{
	@Override
	public Furniture create(String type, String purpose) {
		switch(type) {
		case "DiningChair": return new DiningChair(purpose);
		case "DiningTable": return new DiningTable(purpose);
		default: return null;
		}
	}
}