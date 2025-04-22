package com.learningJava.learningJava;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 */


public class App {

	public static final Logger log = LogManager.getLogger(App.class);

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
