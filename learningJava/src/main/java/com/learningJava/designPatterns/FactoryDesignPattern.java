package com.learningJava.designPatterns;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FactoryDesignPattern {

	public static enum PlanType{
		DOMESTIC, INSTITUTIONAL, COMMERCIAL
	};

	
	public Optional<Plan> getPlan(PlanType planType) {
		switch(planType) {
		case PlanType.DOMESTIC:
			return Optional.of(new DomesticPlan());
		case PlanType.INSTITUTIONAL:
			return Optional.of(new InstitutionalPlan());
		case PlanType.COMMERCIAL: 
			return Optional.of(new CommercialPlan());
		default: 
			return Optional.empty();
		}
	}
}

abstract class Plan{
	public static final Logger log = LoggerFactory.getLogger(Plan.class);
	protected double rate;
	
	abstract void getRate();
	
	public void calculateBill(int units) {
		double bill = rate * units;
		log.info("Bill for " + units + " units is : " + String.valueOf(bill));
	}
}

class DomesticPlan extends Plan{
	@Override
	public void getRate() {
		rate = 3.5;
	}
}

class InstitutionalPlan extends Plan{
	@Override
	void getRate() {
		rate = 5.5;
	}
}

class CommercialPlan extends Plan{
	@Override
	void getRate() {
		rate = 7.5;
	}
}