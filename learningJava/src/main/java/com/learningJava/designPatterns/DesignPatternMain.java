package com.learningJava.designPatterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.r96.util.FolderCleaner;

public class DesignPatternMain {
	public static final Logger log = LoggerFactory.getLogger(DesignPatternMain.class);
	
	public static void main(String[] agrs) {
		FolderCleaner.cleanEmptyFolders("consoleLogs", false);
		
		
	}
}
