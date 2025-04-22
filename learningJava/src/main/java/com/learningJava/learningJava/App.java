package com.learningJava.learningJava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */


public class App {
	final static Logger log = LoggerFactory.getLogger(App.class);
	

	public static void main(String[] args) {

		for(int i = 0; i < 10 ; i++)
		{
			log.info("Hello World!");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
