package com.acorn;
import java.util.Scanner;
public class study01 {

	public static void main(String[] args) {
		// 사용자에게 몇월인지 입력받고
		// 해당하는 달의 계절을 출력 switch  이용
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("몇 번째 달인지 입력 >>>");
			int month = sc.nextInt();
			
			switch (month) {
				case 1:
					System.out.println(month + "월");
					System.out.println("겨울");
					break;
				case 2:
					System.out.println(month + "월");
					System.out.println("겨울");
					break;
				case 3:
					System.out.println(month + "월");
					System.out.println("봄");
					break;
				case 4:
					System.out.println(month + "월");
					System.out.println("봄");
					break;
				case 5:
					System.out.println(month + "월");
					System.out.println("봄");
					break;
				case 6:
					System.out.println(month + "월");
					System.out.println("여름");
					break;
				case 7:
					System.out.println(month + "월");
					System.out.println("여름");
					break;
				case 8:
					System.out.println(month + "월");
					System.out.println("여름");
					break;
				case 9:
					System.out.println(month + "월");
					System.out.println("가을");
					break;
				case 10:
					System.out.println(month + "월");
					System.out.println("가을");
					break;
				case 11:
					System.out.println(month + "월");
					System.out.println("가을");
					break;
				case 12:
					System.out.println(month + "월");
					System.out.println("겨울");
					break;
				default :
					System.out.println("잘못된 입력");
		}

		}
	}

}
