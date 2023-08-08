package com.acorn;

import java.util.Scanner;

public class study02 {

	public static void main(String[] args) {
//		// 키보드 입력 개체 생성
//		Scanner sc = new Scanner(System.in);
//		
//		// (나) 두 개의 숫자를 키보드 입력 > 두 번에 걸쳐 입력 받기
//		System.out.println("첫 번째 수 입력 >>>");
//		int num1 = sc.nextInt();
//		System.out.println("두 번째 수 입력 >>>");
//		int num2 = sc.nextInt();
//		int myResult = (int)(Math.abs((num1 - num2)));
//		// Math.abs() : 절대값 구하기
//		
//		// (컴퓨터) 두 개의 난수 생성
//		// 0.0 ≤  (Math.random()의 반환값) < 1.0
//		int num3 = (int)((Math.random()*100) + 1); // int형으로 변환해서 해서 소수점 삭제 (반올림 X)
//		int num4 = (int)((Math.random()*100) + 1);
//		int comResult = (int)(Math.abs((num3 - num4)));
//		
//		System.out.println("user >>>");
//		System.out.println("첫번째 수 : " + num1);
//		System.out.println("두번째 수 : " + num2);
//		System.out.println("두 수의 차 : " + myResult);
//		System.out.println("\n\n");
//		System.out.println("computer >>>");
//		System.out.println("첫번째 수 : " + num3);
//		System.out.println("두번째 수 : " + num4);
//		System.out.println("두 수의 차 : " + comResult);
//		System.out.println("\n\n");
//		System.out.println("승부 결과 >>>");
//		System.out.println("user : " + myResult);
//		System.out.println("computer : " + comResult);
//		
//		if (myResult > comResult) {
//			System.out.println("승리");
//		} else if (myResult < comResult) {
//			System.out.println("패배");
//		} else {
//			System.out.println("무승부");
//		}
		
		
		// 요소 없는 배열 생성 : 데이터 타입[] 변수명 = {};
		int[] randomArr = new int[100];
		
		// 난수 방샐기를 사용해 배열에 값을 할당 : 반복문
		for (int i = 0; i < 100; i++) {
			randomArr[i] = (int)((Math.random()*100)) + 1;
		}
		
		// 이전 코드
		
		// 우승조건 체크 : 큰 수 에서 작은 수에 대한 뺄셈
		// 타입 지정: 1(사람), 2(컴퓨터)
		byte iType = 1;
		
		// 키보드 입력 개체 생성
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int num4;
		
		while (true) {
			System.out.println("---메뉴---");
			System.out.println("1. 우승조건(1) : 두 수의 합이 더 큰 경우");
			System.out.println("2. 우승조건(2) : 두 수의 차가 더 작은 경우");
			System.out.println("99. 종료");
			System.out.println("\n");
			System.out.println("메뉴 번호 입력 >>>");
			int iCondition = sc.nextInt();

			// 종료여부 확인
			if (iCondition == 99) {
				System.out.println("정말로 종료하시겠습니까? y or n");
				char answer = sc.next().charAt(0);
				if ((answer == 'y') || (answer == 'Y')) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				} else if (answer == 'n' || answer == 'N') {
					continue; // 다시 반복문 시작
					
					
					

				} else {
					System.out.println("잘못된 입력입니다.");
				}
			} else if (iCondition == 1) {
				
			} else if (iCondition == 2) {
				
			} else {
				System.out.println("잘못된 입력입니다.");
			}
			// 두 개의 숫자 키보드 입력
			
			// 두 수 대소 비교
			
			// 두 난수 생성
		}
		
	}
	
	public static void scan(Scanner sc, int num1, int num2) {
		System.out.println("첫 번째 수 입력 >>>");
		num1 = sc.nextInt();
		System.out.println("두 번째 수 입력 >>>");
		num2 = sc.nextInt();
	}
	public static void random(int num3, int num4) {
		// 0.0 ≤  (Math.random()의 반환값) < 1.0
		num3 = (int)((Math.random()*100) + 1); // int형으로 변환해서 해서 소수점 삭제 (반올림 X)
		num4 = (int)((Math.random()*100) + 1);
	}
	public static void compare1(int num1, int num2, int num3, int num4) {
		int myResult = num1 + num2;
		int comResult = num3 + num4;
	}
	public static void compare2(int num1, int num2, int num3, int num4) {
		int myResult = (int)(Math.abs((num1 - num2)));
		int comResult = (int)(Math.abs((num3 - num4)));
		
	}
}
