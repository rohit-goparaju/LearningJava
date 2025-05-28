package com.learning.jdbc;

import java.sql.Date;
import java.sql.Timestamp;

public class Person {
	private int id;
	private String first_name, last_name;
	private Date dob;
	private Timestamp created_on, last_updated_on;
	private double salary, bonus;
	
	public Person(int id, String first_name, String last_name, Date dob, Timestamp created_on,
			Timestamp last_updated_on, double salary, double bonus) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.dob = dob;
		this.created_on = created_on;
		this.last_updated_on = last_updated_on;
		this.salary = salary;
		this.bonus = bonus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Timestamp getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}

	public Timestamp getLast_updated_on() {
		return last_updated_on;
	}

	public void setLast_updated_on(Timestamp last_updated_on) {
		this.last_updated_on = last_updated_on;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", dob=" + dob
				+ ", created_on=" + created_on + ", last_updated_on=" + last_updated_on + ", salary=" + salary
				+ ", bonus=" + bonus + "]";
	}
	
}
