package com.learningJava.algorithms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KMP {
	
	public static final Logger log = LoggerFactory.getLogger(KMP.class);

	public static int[] createLpsArray(String pattern) {
		int[] lps = new int[pattern.length()];
		
		int i = 1, previousMaxLps = 0;
		
		while(i < pattern.length()) {
			if(pattern.charAt(i) == pattern.charAt(previousMaxLps)) {
				previousMaxLps++;
				lps[i] = previousMaxLps;
				i++;
			}else {
				if(previousMaxLps!=0) {
					previousMaxLps = lps[previousMaxLps-1];
				}else {
					lps[i] = 0;
					i++;
				}
			}
		}
		return lps;
	}
	
	public static int[] createLpsArrayInefficient(String pattern) {
		int[] lps = new int[pattern.length()];
		
		for(int i = 0; i < pattern.length(); i++) {
			String subString = pattern.substring(0, i+1);
			
//			log.info(subString);
			
			int subLength = subString.length();
			
			int lpsValue = 0;
			
			for(int j = 0; j < subLength-1; j++) {
				
				String prefix = subString.substring(0, j+1);
				String suffix = subString.substring(subLength-(j+1));
				
				if(prefix.equals(suffix) && prefix.length() > lpsValue)
				{
					lpsValue = prefix.length();
				}
				
//				log.info("prefix "+prefix);
//				log.info("suffix "+suffix);
			}
			lps[i] = lpsValue;
		}
		
//		SortUtil.printArr(lps);
		return lps;
	}
	
	
	public static int search(String pattern, String text) {
		int[] lps = createLpsArray(pattern);
		
		int i =0, j = 0, index = -1;
		
		while(i < text.length() && j < pattern.length()) {
			if(text.charAt(i) == pattern.charAt(j)) {
				if(index < 0) {
					index = i;
				}
				i++;
				j++;
			}else {
				if(index >= 0) {
					index = -1;
				}
				if(j > 0) {
					j = lps[j-1];
					index = i - j;
				}else {
					i++;
				}
			}
		}
		if(j == pattern.length())
			return index;
		else
			return -1;
	}
	
}

