package com.acorn;
import java.util.Scanner;
public class MainClass이용3 {

	public static void main(String[] args) {
		// === 필드 영역 ===
		// 개체부분
		Scanner sc = new Scanner(System.in);
		// 공통부분
		String msg01 = "첫 번째 수 입력 >>>";
		String msg02 = "두 번째 수 입력 >>>";
		String msg03 = "결과값 : ";
		
		// 덧셈 부분
		int iAddFirstNum;
		int iAddSecondNum;
		int iAddResultValue = 0;
		
		// 뺄셈 부분
		int iSubFirstNum;
		int iSubSecondNum;
		int iSubResultValue = 0;
		
		// 곱셈 부분
		int iMulFirstNum;
		int iMulSecondNum;
		int iMulResultValue = 0;
		
		// 나눗셈 부분
		double iDivFirstNum;
		double iDivSecondNum;
		double iDivResultValue = 0;
		
		// === 오퍼레이션 영역 ===
		// 덧셈
		System.out.println("=== 덧셈 ===");
		System.out.print("첫 번째 수 입력 >>> ");
        iAddFirstNum = sc.nextInt();
        System.out.print("두 번째 수 입력 >>> ");
        iAddSecondNum = sc.nextInt();
		iAddResultValue = Add.addOperation(iAddFirstNum, iAddSecondNum);
		System.out.println(iAddResultValue);
		
		// 빼기 부분
        System.out.println("=== 뺄셈 ===");
        System.out.print("첫 번째 수 입력 >>> ");
        iSubFirstNum = sc.nextInt();
        System.out.print("두 번째 수 입력 >>> ");
        iSubSecondNum = sc.nextInt();
		
		// 곱하기 부분
        System.out.println("=== 곱셈 ===");
        System.out.print("첫 번째 수 입력 >>> ");
        iMulFirstNum = sc.nextInt();
        System.out.print("두 번째 수 입력 >>> ");
        iMulSecondNum = sc.nextInt();
		
		// 나누기 부분
        System.out.println("=== 나눗셈 ===");
        System.out.print("첫 번째 수 입력 >>> ");
        iDivFirstNum = sc.nextDouble();
        System.out.print("두 번째 수 입력 >>> ");
        iDivSecondNum = sc.nextDouble();
		
		// === 오퍼레이션 부분 ===
		int iAddResultValue = addOperation(iAddFirstNum, iAddSecondNum); System.out.println(iAddResultValue);
		int iSubResultValue = subOperation(iSubFirstNum, iSubSecondNum); System.out.println(iSubResultValue);
		int iMulResultValue = mulOperation(iMulFirstNum, iMulSecondNum); System.out.println(iMulResultValue);
		double iDivResultValue = divOperation(iDivFirstNum, iDivSecondNum); System.out.println(iDivResultValue);
		sc.close();
	}
}
