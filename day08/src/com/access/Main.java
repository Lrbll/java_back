package com.access;

// 클래스 멤버 접근 수식(Access modifier)
// private, package(생략되어있는 경우), protected, public
// 1. 기능 : 클래스 멤버에 대한 접근 권한 설정
// 2. 의미
// 1) private : 선언된 하나의 클래스 안에서만 직접-접근 가능
// 2) (package) : 같은 패키지의 클래스들에서 직접-접근 가능
// 3) protected : 같은 패키지에 있거나 상속하는 클래스에서 직접-접근 가능
// 4) public : 어디서라도 직접-접근 가능

public class Main {
	
	public static void main(String[] args) {
		// 같은 패키지 안의 클래스 이용
		AccessTest accessTest = new AccessTest();
		accessTest.b = 2;
		accessTest.c = 3;
		accessTest.d = 4;
		System.out.println(accessTest.b);
		System.out.println(accessTest.c);
		System.out.println(accessTest.d);
		
		System.out.println(prv(prvA));
		
	}
	// 하나의 클래스
	public static void prv(int prvA) {
		private int prvA = 10;
	}

}
