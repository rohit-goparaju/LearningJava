package com.learningJava.designPatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ObserverPattern {
	NewsAgency agency = new NewsAgency();
	NewsChannel ch1 = new NewsChannel();
	NewsChannel ch2 = new NewsChannel();
	
	{
		agency.registerObserver(ch1);
		agency.registerObserver(ch2);
	}
}

//observer
interface Observer{
	boolean update(String message);
}

//subject
interface Subject{
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	boolean notifyObservers();
}

//concrete subject
class NewsAgency implements Subject{
	List<Observer> channels = new ArrayList<>();
	String news;
	
	public boolean setNews(String news) {
		this.news = news;
		return notifyObservers();
	}

	@Override
	public void registerObserver(Observer o) {
		channels.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		channels.remove(o);
	}
	
	@Override
	public boolean notifyObservers() {
		boolean result = true;
		for(Observer o : channels) {
			if(!o.update(news))
				result = false;
		}
		return result;
	}
}

//concrete observer
class NewsChannel implements Observer{
	@Override
	public boolean update(String message) {
		return Objects.nonNull(message);
	}
}