package day10.review;

import java.util.Arrays;
import java.util.Scanner;

public class ReviewMain02 {

	public static void main(String[] args) {
		// 입력된 네 개의 수가 있다
		// 두 개는 실수, 두 개는 정수
		// 세 수를 검사해서 5보다 큰 수를 출력
//		int iNum1;
//		int iNum2;
		int iNum1, iNum2; // 데이터타입이 같을 때 여러개 한 번에 선언
		double dNum1;
		double dNum2;
		
		Scanner sc = new Scanner(System.in);
//		함수명(값1, 값2); // 메소드 호츨할 때 파라메터 데이터타입, 갯수 같게
		
		// 1. test()
//		System.out.println("첫 번째 정수 입력 >>>");
//		iNum1 = sc.nextInt();
//		System.out.println("두 번째 정수 입력 >>>");
//		iNum2 = sc.nextInt();
//		System.out.println("첫 번째 실수 입력 >>>");
//		dNum1 = sc.nextDouble();
//		System.out.println("두 번째 실수 입력 >>>");
//		dNum2 = sc.nextDouble();
		
//		test(sc, iNum1, iNum2, dNum1, dNum2);
		
		// 2. test1()
//		test1(5, 6);
		
		// 3. keyInputProcess()
//		System.out.println("입력 가능한 수는 최대 10개까지 입니다.");
//		int[] iRetNumArr = keyInputProcess(sc, 10);
//		System.out.println(Arrays.toString(iRetNumArr));
		
		// 4. Object[] 반환 메소드
//		System.out.println(Arrays.toString(printObjectArr(sc)));
		
		// 5. keyInputProcess()와 compareNum()
		int value1 = keyInputProcess(sc);
		int value2 = keyInputProcess(sc);
		
		compareNum(value1, value2);
		
		// 키 입력 처리 함수
//		public static 리턴타입 함수명(파라메터1, 파라메터2, ,,,,,,)
//		// 변수 선언 == 파라메터 지정방법 => int a
//		
//		{
//			명령문;
//		}
	}
	// void는 return 값을 반환할 필요가 없을 때 사용한다.
	// 메소드 내의 값을 메소드가 완료된 이후에도 활용해야 한다면 return으로 그 값을 돌려주어야하지만
	// 그렇지 않다면 메소드명 앞에 void를 써주면 된다
	public static void test(Scanner sc, int Num1, int Num2, double Num3, double Num4) { // 함수 선언
		// 함수 정의
		if (Num1 <= 5 && Num2 <= 5 && Num3 <= 5 && Num4 <= 5) {
			System.out.println("1번째 정수 : " + Num1);
			System.out.println("2번째 정수 : " + Num2);
			System.out.println("1번째 실수 : " + Num3);
			System.out.println("2번째 실수 : " + Num4);
			System.out.println("5보다 큰 수는 존재하지 않습니다.");
		}
		else {
			// else if 로 넣으면 첫번째로 만족하는 조건문만 실행하고 끝남
			if (Num1 > 5) {System.out.println("첫 번째 정수는 5보다 큽니다.");}
			if (Num2 > 5) {System.out.println("두 번째 정수는 5보다 큽니다.");}
			if (Num3 > 5) {System.out.println("첫 번째 실수는 5보다 큽니다.");}
			if (Num4 > 5) {System.out.println("두 번째 실수는 5보다 큽니다.");}
		}
	}
	
	public static void test1(int x, int y) { // 수학에서는 f(x) = x에 관한식, f(3) => x에 3대입
		System.out.println(x);
		System.out.println(y);
		int result = x + y;
		System.out.println(x + " + " + y + " = " + result);
	}
	
	// return type = int[] >> 메소드 선언할 떄, 메소드 명 앞에 적기
	public static int[] keyInputProcess(Scanner sc, int iInputCnt) {
		int[] iArr = new int[iInputCnt];
		
		int iInputValue;
		for (int i = 0; i < iArr.length; i++) {
			System.out.println("정수 >>>");
			iInputValue = sc.nextInt();
			if (iInputValue == 9999) break;
			else iArr[i] = iInputValue; 
		}
		return iArr; // int[]
	}
	
	//Object[] 배열의 사용 (객체의 배열)
	// 정수 실수가 Object[]에 들어갈 때, (int, double은 객체 아님)
	// int => Integer 형식으로 바뀜 (객체로 바꿔주는 것)
	// double => Double
	public static Object[] printObjectArr(Scanner sc) {
		Object[] allArr = new Object[5];
		for (int i = 0; i < allArr.length; i++) {
			if (i < 3) {
				System.out.println((i+1) + "번째 " + "정수 입력 >>>");
				int x = sc.nextInt();
				allArr[i] = x;
			} else if (i >= 3 && i <5) {
				System.out.println((i+1) + "번째 " + "실수 입력 >>>");
				double y = sc.nextDouble();
				allArr[i] = y;
			} else {
				break;
			}
		}
		return allArr;
	}
	
	// 키 입력 함수
	public static int keyInputProcess(Scanner sc) {
		int iInputValue;
		System.out.println("정수 입력 >>>");
		iInputValue = sc.nextInt();
		
		return iInputValue;
	}
	
	// 비교 처리 함수
	public static void compareNum(int iRetNum01, int iRetNum02) {
		if (iRetNum01 < 5) {
			System.out.println(iRetNum01 + "은 5보다 작습니다");
			if (iRetNum02 < 5) {
				System.out.println(iRetNum02 + "은 5보다 작습니다");
			} else if (iRetNum02 == 5) {
				System.out.println(iRetNum02 + "은 5와 같습니다");
			}
		} else if (iRetNum01 == 5) {
			System.out.println(iRetNum01 + "은 5와 같습니다");
			if (iRetNum02 < 5) {
				System.out.println(iRetNum02 + "은 5보다 작습니다");
			} else if (iRetNum02 == 5) {
				System.out.println(iRetNum02 + "은 5와 같습니다");
			}
		}
	}
}


