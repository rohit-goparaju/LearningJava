package com.learningJava.designPatterns;

public class InterpreterPattern {
	int testHelper(int num1, int num2) {
		return new Add(new Number(num1), new Number(num2)).interpret();
	}
}

interface Expression{
	int interpret();
}

class Number implements Expression{

	int number;

	public Number(int number) {
		super();
		this.number = number;
	}

	@Override
	public int interpret() {
		return number;
	}
}

class Add implements Expression{
	Number operand1, operand2;

	public Add(Number operand1, Number operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public int interpret() {
		return operand1.interpret() + operand2.interpret();
	}
}