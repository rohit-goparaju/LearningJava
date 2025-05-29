package com.learning.hibernate;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@NamedQuery(name = "getAll", query = "select p from Person p")
@NamedQuery(name = "getById",query = "select p from Person p where p.id = :pid")
@Entity
@Table(name = "person")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String first_name;
	@Column(nullable = false)
	private String last_name;
	private Date dob;
	
	
	@ManyToMany
	@JoinTable(
				name = "person_subscription",
				joinColumns = @JoinColumn(name = "person_id"),
				inverseJoinColumns = @JoinColumn(name = "subscription_id")
			)
	List<Subscription> subscriptions = new ArrayList<Subscription>();
	
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
	
	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
	
	public void addSubscription(Subscription sub) {
		this.subscriptions.add(sub);
	}
	
	public void removeSubscription(Subscription sub) {
		this.subscriptions.remove(sub);
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", dob=" + dob + "]";
	}
}
