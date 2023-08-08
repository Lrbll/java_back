package com.acorn;

import java.util.Scanner;

public class study02 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("국어 점수>>>");
//		int nlpoint = sc.nextInt();
//		System.out.println("수학 점수>>>");
//		int mapoint = sc.nextInt();
//		System.out.println("영어 점수>>>");
//		int enpoint = sc.nextInt();
//		
//		System.out.println("전체 점수의 합 : " + (nlpoint + mapoint + enpoint));
//		
//		sc.close();
		
		int score1 = 0;
		int score2 = 0;
		int score3 = 0;
		int score4 = 0;
		int score5 = 0;
		int avg = 0;
		
		Scanner sc = new Scanner(System.in);
		int menu = 1;
		while (true) {
			System.out.println("계속 : 1 / 종료 : 0");
			menu = sc.nextInt();
			
			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if (menu == 1) {
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("1과목 점수 입력 : ");
				score1 = sc.nextInt();
				System.out.println("2과목 점수 입력 : ");
				score2 = sc.nextInt();
				System.out.println("3과목 점수 입력 : ");
				score3 = sc.nextInt();
				System.out.println("4과목 점수 입력 : ");
				score4 = sc.nextInt();
				System.out.println("5과목 점수 입력 : ");
				score5 = sc.nextInt();
				
				avg = (score1 + score2 + score3 + score4 + score5) / 5; // 몫 구하려면 /
				if (avg >= 60) {
					if (score1 >= 50 && score2 >= 40 && score3 >=60 && score4 >=60 && score5 >=60) {
//						System.out.println("당신의 점수 [1과목 : " + score1 + "] [2과목 : " + score2 + "] [3과목 : " + score3 + "]");				System.out.println("세 과목 평균 : " + avg);
						System.out.println("축하합니다 합격입니다.");
					} else {
						if (score1 < 50) {
							System.out.println("1과목 과락");
						}
						if (score2 < 40) {
							System.out.println("2과목 과락");
						}
						if (score3 < 60) {
							System.out.println("3과목 과락");
						}
						if (score4 < 60) {
							System.out.println("4과목 과락");
						}
						if (score5 < 60) {
							System.out.println("5과목 과락");
						}
						System.out.println("당신의 점수 [1과목 : " + score1 + "] [2과목 : " + score2 + "] [3과목 : " + score3 + "]");
						System.out.println("다섯 과목 평균 : " + avg);
						System.out.println("과락이 존재하는 경우 평균 60점 이상이어도 불합격 입니다.");
					}
				} else {
					System.out.println("평균 60점 미만으로 불합격입니다.");
				}
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
	public static void passAvg(int avg) {
		if (avg >= 70) {
			System.out.println("합격");
		} else {
			System.out.println("뜨거운합격");
		}
	}
}
