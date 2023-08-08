package com.acorn;

import java.util.*;

public class study01 {

	public static void main(String[] args) {
		// 중간점수(20%), 기말점수(30%), 과제점수(30%), 출석횟수(20%) >> PASS FAIL
		// 강의횟수 20회 >> 70점 이상 PASS 미만이거나 출석률 30미만 FAIL
		
		// 배열로도 저장해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("중간고사 점수 : ");
		int middleScore = sc.nextInt();
		
		System.out.println("기말고사 점수 : ");
		int finalScore = sc.nextInt();
		
		System.out.println("과제 점수 : ");
		int homeworkScore = sc.nextInt();
		
		System.out.println("출석 횟수 : ");
		int participation = sc.nextInt();
		
		float middleTransform = (float)(middleScore * 0.2);
		float finalTransform = (float)(finalScore * 0.3);
		float homeworkTransform = (float)(homeworkScore * 0.3);
		float total = middleTransform + finalTransform + homeworkTransform  + participation;
		System.out.println(middleTransform);
		System.out.println(finalTransform);
		System.out.println(homeworkTransform);
		System.out.println(participation);
		if (participation > 14) {
			if (total >= 70) {
				System.out.println(total + "점, 전체 합산 70점 이상으로 PASS 입니다.");
			} else {
				System.out.println(total + "점, 점수 미달로 FAIL 입니다.");
			}
		} else {
			System.out.println("30% 이상 결석, 6회 이상 결석으로 FAIL 입니다.");
		}
		
		

	}

}
