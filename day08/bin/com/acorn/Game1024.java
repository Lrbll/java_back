package com.acorn;

import java.util.Arrays;
import java.util.Scanner;

import com.sun.java.swing.action.ExitAction;

public class Game1024 {
	static Scanner sc = new Scanner(System.in);
	static int[][] arr = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 },{}};
	static int[] aaarr = {0,2,4,5,8};

	public static void main(String[] args) {
		System.out.println(arr[0]);
		System.out.println(Arrays.asList(arr[0][0]).indexOf(0));
		NN();
	}

	public static void DP() {
		System.out.println(Arrays.toString(arr[0]) + '\n' + Arrays.toString(arr[1]) + '\n' + Arrays.toString(arr[2]));
	}

	public static void NN() {
		while (true) {
			int x = (int) Math.round(Math.random() * 2);
			int y = (int) Math.round(Math.random() * 2);
			System.out.println("end"+Arrays.asList(arr[0][0]).contains(0));
			int zz = 2;
			System.out.println(Arrays.asList(aaarr[1]).contains(zz));
			if (arr[x][y] == 0) {
				arr[x][y] = (int) (Math.round(Math.random()) + 1);
				break;
			}
		}
		DP();
		System.out.println("이동");
		MOVE(sc.nextInt());
	}

	public static void MOVE(int x) {
		if (x == 2) {
			for(int i=2;i>=0;i--) {
				for(int j=0;j<=2;j++) {
					
				}
			}
		}
		NN();
	}

}