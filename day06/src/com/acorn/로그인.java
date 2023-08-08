package com.acorn;
import java.util.Arrays;
import java.util.Scanner;
public class 로그인 {

	public static void main(String[] args) {
		String[] id = new String[100];
		String[] pw = new String[100];
		id[0] = "asd1234";
		id[1] = "apple777";
		pw[0] = "1234";
		pw[1] = "7777";
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("=== menu ===");
			System.out.println("1] 로그인");
			System.out.println("2] 비밀번호찾기");
			System.out.println("0] 종료");
			System.out.println("menu 번호를 입력해주세요");
			System.out.println("입력 >>>");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				login(sc, id, pw);
			}
			else if (menu == 2) {
				findPw(sc, id, pw);
			}
			else if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}
		}
	}
	public static void login(Scanner sc, String[] id, String[] pw) {
		String uid;
		String upw;
		System.out.println("아이디 입력 >>>");
		sc.nextLine();
		uid = sc.nextLine();
		if (Arrays.asList(id).contains(uid) == true) {
			for (int j = 0; j < id.length; j++) {
				// String 배열 안의 문자열 비교는 equals()를 이용해야한다
				// 배열의 인덱스를 비교하는 경우에는
				// 그값이 출력되는 것이 아니라 주소가 비교되기 때문
				if (uid.equals(id[j])) {
					System.out.println("비밀번호 입력 >>>");
					upw = sc.nextLine();
					if (upw.equals(pw[j])) {
						System.out.println("성공적으로 로그인하였습니다.");
						loginMenu(sc);
					} else {
						System.out.println("틀린 비밀번호입니다.");
					}
				}
			}
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		
	}
	public static void loginMenu(Scanner sc) {
		System.out.println("=== 로그인 시 보이는 menu ===");
		System.out.println("1] 비밀번호 변경");
		System.out.println("2] 회원계정 탈퇴");
		System.out.println("0] 로그아웃 (뒤로가기)");
		System.out.println("menu 번호를 입력해주세요.");
		System.out.println("입력 >>>");
		int loginMenu = sc.nextInt();
		
		if (loginMenu == 1) {
			
		}
		else if (loginMenu == 2) {
			
		}
		else if (loginMenu == 0) {
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
		}
	public static void findPw(Scanner sc, String[] id, String[] pw) {
		String uid;
		String upw;
		System.out.println("아이디 입력 >>>");
		sc.nextLine();
		uid = sc.nextLine();
		if (Arrays.asList(id).contains(uid) == true) {
			for (int j = 0; j < id.length; j++) {
				if (uid.equals(id[j])) {
					System.out.println("비밀번호는 " + pw[j] + " 입니다.");
				}
			}
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
}
