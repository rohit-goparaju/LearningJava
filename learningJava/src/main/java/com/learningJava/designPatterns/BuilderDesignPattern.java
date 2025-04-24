package com.learningJava.designPatterns;

import java.util.Date;

public class BuilderDesignPattern {
	
	//required parameters
	final String name;
	final int id;
	
	//optional parameters
	final String gender;
	final Date dateOfBirth;
	
	//private constructor
	private BuilderDesignPattern(Builder builder){
		this.name = builder.name;
		this.id = builder.id;
		this.gender = builder.gender;
		this.dateOfBirth = builder.dateOfBirth;
	}
	
	public static class Builder{
		private final String name;
		private final int id;
		private String gender = "";
		private Date dateOfBirth = null;
		
		public Builder(String name, int id){
			this.name = name;
			this.id = id;
		}
		
		public Builder gender(String gender) {
			this.gender = gender;
			return this;
		}
		
		public Builder dateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
			return this;
		}
		
		public BuilderDesignPattern build() {
			return new BuilderDesignPattern(this);
		}
	}
}
