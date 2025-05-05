package com.learningJava.designPatterns;

public class DecoratorDesignPattern extends PhoneDecorator {
	
	public DecoratorDesignPattern(Phone phone) {
		super(phone);
	}
	
	@Override
	public String getFeatures() {
		return super.getFeatures() + ", 50MP ultrawide, 100x telescopic zoom, AI features, Ultra tag";
	}
	
	@Override
	public Double getCost() {
		return super.getCost() + 40000;
	}
	
}

interface Phone{
	String getFeatures();
	Double getCost();
}

class SamsungPhone implements Phone{
	@Override
	public String getFeatures() {
		return "5000mah battery, 200MP rear camera, ip 68 water resistance";
	}
	
	@Override
	public Double getCost() {
		return 60000.00;
	}
}


abstract class PhoneDecorator implements Phone{
	Phone decoratedPhone;
	public PhoneDecorator(Phone phone) {
		this.decoratedPhone = phone;
	}
	
	@Override
	public String getFeatures() {
		return decoratedPhone.getFeatures();
	}
	
	@Override
	public Double getCost() {
		return decoratedPhone.getCost();
	}
}