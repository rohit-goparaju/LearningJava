package com.learningJava.designPatterns;

import java.util.ArrayList;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObjectPoolDesignPattern {
	public static final Logger log = LoggerFactory.getLogger(ObjectPoolDesignPattern.class);
	
	private ArrayList<Reusable> available;
	private ArrayList<Reusable> inUse;
	
	public ObjectPoolDesignPattern(int initialSize) {
		available = new ArrayList<Reusable>();
		inUse = new ArrayList<Reusable>();
		for(int index = 0; index < initialSize; index++) {
			available.add(new Reusable());
		}
	}
	
	public Reusable getReusable() {
		if(available.size() > 0) {
			 inUse.add(available.remove(0));
			 return inUse.getLast();
		}
		log.info("All objects in use, release in use objects and try again or create new object.");
		return null;
	}
	
	public void release(Reusable obj) {
		if(Objects.nonNull(obj)) {
			available.add(obj);
			inUse.remove(obj);
		}
	}
}

class Reusable{
	
}