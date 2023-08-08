package com.acorn;

import java.util.Arrays;

public class study01 {

	public static void main(String[] args) {
		int[] arr = new int[100];
		for (int r = 0; r < 100; r++) {
			arr[r] = (int)(Math.random()*100 +1);
		}
//		int[] arr = {60, 50, 95, 50, 70};
		
		for (int i = 0; i < (arr.length - 1); i++) {
				for (int j = i; j < arr.length; j++) {
					int num1 = arr[i];
					int num2 = arr[j];
					if (num1 > num2) {
						System.out.println(arr[i] + " <=> " + arr[j] + " 교환");
						arr[j] = num1;
						arr[i] = num2;
						System.out.println(Arrays.toString(arr));
						System.out.println("\n");
					}
			}
		}
		System.out.println("최종 배열");
		System.out.println(Arrays.toString(arr));
	}

}
