package com.learning.hibernate;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "subscription")
public class Subscription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String name;
	
	@ManyToMany(mappedBy = "subscriptions", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	List<Person> subscribers = new ArrayList<Person>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Person> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(List<Person> subscribers) {
		this.subscribers = subscribers;
	}

	public void addSubscriber(Person sub) {
		this.subscribers.add(sub);
	}
	
	public void removeSubscriber(Person sub) {
		this.subscribers.remove(sub);
	}
	
	@Override
	public String toString() {
		return "Subscription [id=" + id + ", name=" + name + ", subscribers=" + subscribers + "]";
	}
	
}
