package com.learningJava.designPatterns;

import java.util.Objects;

public class ChainOfResponsibilityDesignPattern extends Handler{
	@Override
	boolean handleRequest(String request) {
		return true;
	}
}

abstract class Handler{
	Handler next;
	void setNext(Handler next) {
		this.next= next;
	}

	abstract boolean handleRequest(String request);

}

class Manager extends Handler{
	@Override
	boolean handleRequest(String request) {
		if(request.equals("leave"))
			return true;
		else if(!Objects.isNull(next))
			return next.handleRequest(request);
		return false;
	}
}

class Director extends Handler{
	@Override
	boolean handleRequest(String request) {
		if(request.equals("budget"))
			return true;
		else if(!Objects.isNull(next))
			return next.handleRequest(request);
		return false;
	}
}