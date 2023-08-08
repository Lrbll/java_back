package com.acorn;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menu;
		int num1;
		int num2;
		float num3;
		float num4;
		
		while (true) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n");
			System.out.println("계산기 프로그램");
			System.out.println("------메뉴------");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("99. 종료");
			System.out.println("<<< 메뉴 번호 입력 >>>");
			menu = sc.nextInt();
			
			if (menu == 1) {
				System.out.println("\n\n\n\n\n\n\n\n\n\n");
				System.out.println("------덧셈------");
				System.out.println("첫번째 수 입력 >>>");
				num1 = sc.nextInt();
				System.out.println("두번째 수 입력 >>>");
				num2 = sc.nextInt();
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			}
			else if (menu == 2) {
				System.out.println("\n\n\n\n\n\n\n\n\n\n");
				System.out.println("------뺄셈------");
				System.out.println("첫번째 수 입력 >>>");
				num1 = sc.nextInt();
				System.out.println("두번째 수 입력 >>>");
				num2 = sc.nextInt();
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			}
			else if (menu == 3) {
				System.out.println("\n\n\n\n\n\n\n\n\n\n");
				System.out.println("------곱셈------");
				System.out.println("첫번째 수 입력 >>>");
				num1 = sc.nextInt();
				System.out.println("두번째 수 입력 >>>");
				num2 = sc.nextInt();
				System.out.println(num1 + " X " + num2 + " = " + (num1 * num2));
			}
			else if (menu == 4) {
				System.out.println("\n\n\n\n\n\n\n\n\n\n");
				System.out.println("------나눗셈------");
				System.out.println("첫번째 수 입력 >>>");
				num3 = sc.nextInt();
				System.out.println("두번째 수 입력 >>>");
				num4 = sc.nextInt();
				// int 는 정수형 데이터이기 때문에 몫만 구해진다
				// 나머지는 소수점이 아님!!! 3 % 2의 나머지 1, 소수점 5 
				System.out.println(num3 + " % " + num4 + " = " + (num3 / num4));
			}
			else if (menu == 99) {
//				break;
				System.out.println("\n\n\n\n\n\n\n\n\n\n");
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			else {
				System.out.println("\n\n\n\n\n\n\n\n\n\n");
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}
	}

}
