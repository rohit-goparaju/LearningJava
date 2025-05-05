package com.learningJava.designPatterns;

public class ProxyDesignPattern {
	
	InternetAccess accessGranter = new InternetAccess(); //proxy
	
	void grantInternetAccess(Employee e) {
		if(e.jobLevel > 5) {
			accessGranter.grantInternetAccess(e);
		}
	}
}

class Employee{
	String name;
	int jobLevel;
	boolean internetAccess = false;
	
	public Employee(String name, int jobLevel) {
		super();
		this.name = name;
		this.jobLevel = jobLevel;
	}
}

class InternetAccess{
	void grantInternetAccess(Employee e) {
		e.internetAccess = true;
	}
}
