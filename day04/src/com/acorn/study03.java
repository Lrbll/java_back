package com.acorn;
import java.util.*;
public class study03 {

	public static void main(String[] args) {
		// 4자리 비밀번호
		// 4자리 정수 입력받아 중복되는 값 없을 시 생성 가능
		// 중복값 있을 시 중복값 있음 출력
		// 자리 수 안맞으면 자리 수 안맞음 출력
		// 제일 앞자리는 0이 아니어야함
		while (true ) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("4자리를 입력해주세요 (XXXX) : ");
	
			String pw = sc.nextLine(); // 💖 string : 문자열
			int[] pwArr = new int[pw.length()];
			if (pw.length() != 4) {
				System.out.println("반드시 4자리로 입력해주세요.");
			} else {
				for (int i = 0; i < pw.length(); i++) {
					pwArr[i] = pw.charAt(i) - '0'; // '0' : 아스키코드 값 = 정수 48로 표현
					// 💖 charAt(i) : 문자로 추출
					// 💖 char > int 변환하면 아스키코드에서의 값으로 저장
					// 💖 아스키 코드에서 정수 1은 49로 이기 때문에
					//   아스키코드 값 48인 '0'을 빼준다
				}
				// Arrays.toString을 안쓰면 배열의 주소값이 출력된다\
				// Arrays 클래스의 toString() 이라는 static 메서드 호출
				System.out.println(Arrays.toString(pwArr));
				if (pwArr[0] == 0) {
					System.out.println("맨 앞자리는 0이 아닌 1~9 사이의 숫자로 입력해주세요.");
				} else {
					int check = 0;
					for (int j = 0; j < (pw.length() - 1); j++) {
						for (int p = (j+1); p < pw.length(); p++) {
							if (pwArr[j] == pwArr[p]) {
								check++;
							}
						}
					}
					if (check == 0) {
						System.out.println("성공적으로 비밀번호가 설정되었습니다");
						System.out.println("당신의 비밀번호 : " + Arrays.toString(pwArr));
					} else {
						System.out.println("중복된 값이 존재하고 있습니다.");
					}
				}
			}
		}
		
	}

}
