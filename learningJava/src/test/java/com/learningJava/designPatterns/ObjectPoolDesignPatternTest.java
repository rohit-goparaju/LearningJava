package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class ObjectPoolDesignPatternTest {

	@Test
	void test() {
		ObjectPoolDesignPattern pool = new ObjectPoolDesignPattern(2);
		Reusable r1 = pool.getReusable();
		Reusable r2 = pool.getReusable();
		Reusable r3 = pool.getReusable();
		assertNotNull(r1); 
		assertNotNull(r2); 
		assertNull(r3);
		pool.release(r2);
		r3 = pool.getReusable();
		assertNotNull(r3); 
		pool.release(pool.getReusable());
	}
	
}
