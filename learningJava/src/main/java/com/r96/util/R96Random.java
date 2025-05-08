package com.r96.util;

import java.util.Random;
import java.util.random.RandomGenerator;

public class R96Random {
	public static int[] getRandomIntArr(int size) {
		return Random.from(RandomGenerator.getDefault()).ints(size, 0, size).toArray();
	}
}
