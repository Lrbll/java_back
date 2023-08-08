package com.acorn;

public class study01 {

	// 메인 메서드는 static 영역 안에 있어야 함
	public static void main(String[] args) { // static 영역에 저장되는 static 함수
		// 코드 입력 파트 2
		// 일반 변수 선언(초기화)
//		byte bNumber = 0; System.out.println(bNumber); // =128~127
//		short sNumber = 0; System.out.println(sNumber);
//		int iNumber = 0; System.out.println(iNumber);
//		sNumber = (short)iNumber;
//		long lNumber = 0L; System.out.println(lNumber);
//		float fNumber = 0.0F; System.out.println(fNumber);
//		char cChar = 'c'; System.out.println(cChar);
//		String str = "str"; System.out.println(str);
//		
//		
//		// 특수 변수
//		byte[] bNumberArr = {1, 2, 3, 4, 5};
//		System.out.println(bNumberArr.length);
//		int size = bNumberArr.length;
//		System.out.println(bNumberArr[3]);
//		System.out.println(bNumberArr[size - 2]);
//		System.out.println(bNumberArr[bNumberArr.length - 2]);
		
		// 조건문 : if / switch-case
		// 1~10 하나씩 출력해서 짝수 홀수 어떤 수의 배수 인지 판단
//		int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int i = 0;
		
//		i++;
		
		// 반복문 : for (초기화; 조건식; 증감값) {}
		
		// 내 답
//		int n;
//		int m;
//		int[] even = {2, 4, 6, 8, 10};
//		int[] odd = {1, 3, 5, 7, 9};
//		for (n = 0; n < numArray.length; n++) {
//			if ((numArray[n] % 2) == 0 ) {
//				System.out.print(numArray[n] + "는 짝수 이면서, ");
//				for (m=4; m >= 0; m--) {
//					if ((numArray[n] % even[m]) == 0) {
//						System.out.println(even[m] + "의 배수입니다");
//						break;
//					}
//				}
//			} else {
//				System.out.print(numArray[n] + "는 홀수이면서, ");
//				for (m=4; m >= 0; m--) {
//					if ((numArray[n] % odd[m]) == 0) {
//						System.out.println(odd[m] + "의 배수입니다");
//						break;
//					}
//				}
//			}
//			i++;
//		}
		
		// 구구단
		
//		for (int w = 2; w <= 9; w++) {
//			System.out.println(w + "단");
//			for (int e = 1; e <= 9; e++) {
//				System.out.println(w + " X " + e + "= " + w*e);
//			}
//			System.out.println(" ");
//		}
//		System.out.println("출력이 종료되었습니다.");

//		for (int c = 1; c < 6; c++) {
//			if (c == 1) System.out.print(" ");
//			if (c == 2) System.out.print("  ");
//			if (c == 3) System.out.print("   ");
//			if (c == 4) System.out.print("    ");
//			if (c == 5) System.out.print("     ");
//			for (int j = 1; j <= c; j++) {
//				System.out.print("* ");
//			}
//			System.out.println(" ");
//		}
		
		// while문
		// while (조건식) {조건이 충족되는 동안 실행될 명령어}
		// int[] iEvenOddCountArr // 변수, 함수 명은 그 쓰임과 관련이 있고 목적이 명확하게 쓰는 것이 중요
		int[] iArray = {0, 0};
		int iValue = 1;
		while (iValue <= 30) {
			System.out.println(iValue);
			if ((iValue % 2) == 0) {
				System.out.println("짝수");
				iArray[0] += 1;
			} else {
				System.out.println("홀수");
				iArray[1] += 1;
			}
			System.out.println("현재 짝수 : " + iArray[0]);
			System.out.println("현재 홀수 : " + iArray[1]);
			iValue++;
		}
		
	// 💙 다른 static함수 호출?
//	int i = 0;
//	printVerifyNumber(i);// 함수 호출 > 글자가 누워있다
//	i++;
//	printVerifyNumber(i);
//	i++;
//	printVerifyNumber(i);
//	i++;
//	printVerifyNumber(i);
//	i++;
//	printVerifyNumber(i);
//	i++;
	}

	// 💙 다른 static함수 호출
	// meta, static, stack, heap에서 데이터는 각 영역 이동이 불가하다
	// 따라서 같은 영역 안에서만 데이터 공유 가능
	// 코드 입력 파트 3 (static함수는 static 영역에 저장되기 때문에 static함수 끼리만 데이터 공유가 가능하다)
	public static void printVerifyNumber(int i) { // 데이터 형과 이름이 같아야한다
		int[] iNumberArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		if ((iNumberArr[i] % 2) == 0) {
			System.out.println(iNumberArr[i] + "는 짝수 입니다");
		} else {
			System.out.println(iNumberArr[i] + "는 홀수 입니다");
		}
	}

}
