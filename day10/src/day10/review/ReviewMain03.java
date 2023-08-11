package day10.review;

import java.util.Arrays;
import java.util.Scanner;

public class ReviewMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드에서 생성하고자 하는
		// 배열 사이즈를 받아 배열 생성 - 정수
		
		// 배열의 가운데 위치에 키보드 입력받은 값을 저장
		// 입력한 값 출력
		
		Scanner sc = new Scanner(System.in);
		int odd = 0;
		int[] centerArr = new int[odd];
		
		System.out.println("배열 길이 입력 >>>");
		odd = sc.nextInt();
		centerArr = new int[odd];
		if (odd > 1 && ((odd%2 - 1) == 0)) {
			System.out.println("배열의 길이가 " + odd + " 로 설정되었습니다");
			System.out.println(" ");
			for (int i = 0; i < odd; i++) {
				centerArr[i] = 0;
			}
			System.out.println("정수 입력 >>>");
			int num1 = sc.nextInt();
			centerArr[(odd - 1)/2] = num1;
			
			System.out.println(Arrays.toString(centerArr));
		} else {
			System.out.println("1보다 큰 홀수로 입력해주세요");
		}
	}

}
