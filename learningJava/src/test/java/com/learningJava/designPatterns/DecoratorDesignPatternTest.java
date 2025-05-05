package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DecoratorDesignPatternTest {

	@Test
	void test() {
		SamsungPhone phone = new SamsungPhone();
		
		DecoratorDesignPattern phoneUltra = new DecoratorDesignPattern(new SamsungPhone());
		
		assertTrue(phone.getFeatures().equals("5000mah battery, 200MP rear camera, ip 68 water resistance"));
		assertEquals(60000, phone.getCost());
		
		assertTrue(phoneUltra.getFeatures().equals("5000mah battery, 200MP rear camera, ip 68 water resistance"+", 50MP ultrawide, 100x telescopic zoom, AI features, Ultra tag"));
		assertEquals(100000, phoneUltra.getCost());
	}
	
}
