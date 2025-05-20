package com.r96.util;

import java.util.Random;
import java.util.random.RandomGenerator;

public class R96Random {
	public static int[] getRandomIntArr(int size) {
		return Random.from(RandomGenerator.getDefault()).ints(size, 0, size).toArray();
	}

	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder(length);

		Random rand = new Random();

		for(int i = 0; i < length; i++) 
			sb.append((char)rand.nextInt(97, 122));

		return sb.toString();
	}
}
