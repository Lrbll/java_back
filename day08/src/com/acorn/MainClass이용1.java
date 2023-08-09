package com.acorn;
import java.util.Scanner;
public class MainClass이용1 {

	public static void main(String[] args) {
		// === 필드 영역 ===
		// 개체 부분
		Scanner sc = new Scanner(System.in);
		
		// 공통부분
		String str;
		String msg01 = "첫 번째 수 입력 >>>";
		String msg02 = "두 번째 수 입력 >>>";
		String msg03 = "결과값 : ";
//		Integer.parseInt(str);
		// 결과 저장 부분
		
		// 더하기 부분
//		int iAddResultValue = 0;
//		int iAddFirstNum;
//		int iAddSecondNum;
		
		// 빼기 부분
//		int iSubResultValue = 0;
//		int iSubFirstNum;
//		int iSubSecondNum;
		
		// 곱하기 부분
//		int iMulResultValue = 0; 
//		int iMulFirstNum;
//		int iMulSecondNum;
		
		// 나누기 부분
//		double iDivResultValue = 0;
//		double iDivFirstNum;
//		double iDivSecondNum;
		
		// === 오퍼레이션 부분 ===
		// 더하기 부분
		addOperation(sc, msg01, msg02, msg03);
		// > 연산 대상 값 할당 : 직접 or 키보드 입력
//		System.out.println("=== 덧셈 ===");
//		System.out.println(msg01);
//		iAddFirstNum = sc.nextInt();
//		System.out.println(msg02);
//		iAddSecondNum = sc.nextInt();
//		// 결과값 좌항 = 연산자 우항
//		iAddResultValue = iAddFirstNum + iAddSecondNum;
//		System.out.print(msg03);
//		System.out.println(iAddResultValue);
		
		// 빼기 부분
		subOperation(sc, msg01, msg02, msg03);
//		System.out.println("=== 뺄셈 ===");
//		System.out.println(msg01);
//		iSubFirstNum = sc.nextInt();
//		System.out.println(msg02);
//		iSubSecondNum = sc.nextInt();
//		iSubResultValue = iSubFirstNum - iSubSecondNum;
//		System.out.print(msg03);
//		System.out.println(iSubResultValue);
		
		// 곱하기 부분
		mulOperation(sc, msg01, msg02, msg03);
//		System.out.println("=== 곱셈 ===");
//		System.out.println(msg01);
//		iMulFirstNum = sc.nextInt();
//		System.out.println(msg02);
//		iMulSecondNum = sc.nextInt();
//		iMulResultValue = iMulFirstNum * iMulSecondNum;
//		System.out.print(msg03);
//		System.out.println(iMulResultValue);
		
		// 나누기 부분
		divOperation(sc, msg01, msg02, msg03);
//		System.out.println("=== 나눗셈 ===");
//		System.out.println(msg01);
//		iDivFirstNum = sc.nextInt();
//		System.out.println(msg02);
//		iDivSecondNum = sc.nextInt();
//		
//		// 제약조건 : 예외처리
//		if (iDivFirstNum == 0 ) {iDivResultValue = 0; System.out.println("분자가 '0'이므로 연산결과는 0 입니다.");}
//		else if (iDivSecondNum == 0 ) {iDivResultValue = 0; System.out.println("분모는 '0'이 아니어야 합니다.");}
//		// iDivResultValue = iDivFirstNum + iDivSecondNum;
//		{iDivResultValue = iDivFirstNum / iDivSecondNum;}
//		System.out.print(msg03);
//		System.out.println(iDivResultValue);
		
		sc.close();
	}
	
	public static void addOperation(Scanner sc, String msg01, String msg02, String msg03) {
		int iAddResultValue = 0;
		int iAddFirstNum;
		int iAddSecondNum;
		
		System.out.println("=== 덧셈 ===");
		System.out.println(msg01);
		iAddFirstNum = sc.nextInt();
		System.out.println(msg02);
		iAddSecondNum = sc.nextInt();
		// 결과값 좌항 = 연산자 우항
		iAddResultValue = iAddFirstNum + iAddSecondNum;
		System.out.print(msg03);
		System.out.println(iAddResultValue);
	}
	public static void subOperation(Scanner sc, String msg01, String msg02, String msg03) {
		int iSubResultValue = 0;
		int iSubFirstNum;
		int iSubSecondNum;
		
		System.out.println("=== 뺄셈 ===");
		System.out.println(msg01);
		iSubFirstNum = sc.nextInt();
		System.out.println(msg02);
		iSubSecondNum = sc.nextInt();
		iSubResultValue = iSubFirstNum - iSubSecondNum;
		System.out.print(msg03);
		System.out.println(iSubResultValue);
	}
	public static void mulOperation(Scanner sc, String msg01, String msg02, String msg03) {
		int iMulResultValue = 0; 
		int iMulFirstNum;
		int iMulSecondNum;
		
		System.out.println("=== 곱셈 ===");
		System.out.println(msg01);
		iMulFirstNum = sc.nextInt();
		System.out.println(msg02);
		iMulSecondNum = sc.nextInt();
		iMulResultValue = iMulFirstNum * iMulSecondNum;
		System.out.print(msg03);
		System.out.println(iMulResultValue);
	}
	public static void divOperation(Scanner sc, String msg01, String msg02, String msg03) {
		double iDivResultValue = 0;
		double iDivFirstNum;
		double iDivSecondNum;
		
		System.out.println("=== 나눗셈 ===");
		System.out.println(msg01);
		iDivFirstNum = sc.nextInt();
		System.out.println(msg02);
		iDivSecondNum = sc.nextInt();
		
		// 제약조건 : 예외처리
		if (iDivFirstNum == 0 ) {iDivResultValue = 0; System.out.println("분자가 '0'이므로 연산결과는 0 입니다.");}
		else if (iDivSecondNum == 0 ) {iDivResultValue = 0; System.out.println("분모는 '0'이 아니어야 합니다.");}
		// iDivResultValue = iDivFirstNum + iDivSecondNum;
		{iDivResultValue = iDivFirstNum / iDivSecondNum;}
		System.out.print(msg03);
		System.out.println(iDivResultValue);
	}
}
