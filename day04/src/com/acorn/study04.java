package com.acorn;

import java.util.Arrays;

public class study04 {

	public static void main(String[] args) {
		int[] numArray = new int[10];
		for (int i = 0; i < 10; i++) {
			numArray[i] = (i + 1);
			System.out.print(numArray[i] + " ");
		}
//		System.out.println(Arrays.toString(numArray));
		
		int[] numArray2 = new int[10];
		for (int i = 0; i < 10; i++) {
			numArray2[i] = (10 - i);
			System.out.print(numArray2[i] + " ");
		}
	}

}
