package com.learningJava.designPatterns;

public class StrategyPattern {
	ShoppingCart cart = new ShoppingCart();
}

//Strategy interface
interface PaymentStrategy{
	String pay(double amount);
}

//concrete strategies
class CreditCard implements PaymentStrategy{
	@Override
	public String pay(double amount) {
		return "Paid " + amount + " using credit card";
	}
}

//UPI
class UPI implements PaymentStrategy{
	@Override
	public String pay(double amount) {
		return "Paid " + amount + " using UPI";
	}
}

//context
class ShoppingCart{
	PaymentStrategy paymentStrategy;

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	String checkout(double amount) {
		return paymentStrategy.pay(amount);
	}
}