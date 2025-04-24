package com.learningJava.learningJava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.r96.util.FolderCleaner;

/**
 * Hello world!
 */


public class App {
	final static Logger log = LoggerFactory.getLogger(App.class);


	public static void main(String[] args) {
		FolderCleaner.cleanEmptyFolders("consoleLogs", false);
		
		
	}
}
