package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StrategyPatternTest {
	@Test
	void test() {
		StrategyPattern p = new StrategyPattern();
		p.cart.setPaymentStrategy(new CreditCard());
		
		assertTrue(p.cart.checkout(1).equals(new CreditCard().pay(1)));
		p.cart.setPaymentStrategy(new UPI());
		assertTrue(p.cart.checkout(1).equals(new UPI().pay(1)));
	}

}
