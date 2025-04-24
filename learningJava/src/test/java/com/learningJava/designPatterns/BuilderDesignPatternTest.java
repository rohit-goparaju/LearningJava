package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuilderDesignPatternTest {
	public static final Logger log = LoggerFactory.getLogger(BuilderDesignPatternTest.class);
	
	@Test
	void testRequiredParams() {
		BuilderDesignPattern builtObject = new BuilderDesignPattern.Builder("Rohit", 1).build();
		
		assertTrue(builtObject.name.equals("Rohit"));
		assertTrue(builtObject.id == 1);
		assertTrue(builtObject.gender.isBlank());
		assertTrue(builtObject.dateOfBirth == null);
	}
	
	@Test
	void testOptionalParams() {
		
		BuilderDesignPattern builtObject;
		try {
			SimpleDateFormat dobFormat = new SimpleDateFormat("dd-MM-yyyy");
			builtObject = new BuilderDesignPattern.Builder("Rohit", 1).gender("Male").dateOfBirth(dobFormat.parse("30-05-1996")).build();
			assertTrue(builtObject.name.equals("Rohit"));
			assertTrue(builtObject.id == 1);
			assertTrue(builtObject.gender.equals("Male"));
			assertTrue(dobFormat.format(builtObject.dateOfBirth).equals("30-05-1996"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
