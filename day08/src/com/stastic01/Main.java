package com.stastic01;

public class Main {
	int iMainValue = 0;
	public static void main(String[] args) {
		// 객체를 생성하지 않았음에도
		// 같은 패키지, 다른 클래스에 작성된 static 변수는 호출 가능
		
		// Main 메서드가 실행될 때
		// Main은 자신에게 필요한 다른 클래스나 메소드를 읽어온다
		// 객체가 생성되지는 않았지만 StaticTest 클래스가 필요함을 인지.
		// 따라서 staticTest의 static 변수나
		// static 메소드를 static 영역에 저장하게 된다
		
		System.out.println(StaticTest.number1);
		StaticTest.number1 = 100;
		StaticTest.printInfo();
		
		StaticTest sTest = new StaticTest();
		sTest.printInfo2();
		
//		Main main = new Main();
//		int iTestValue = main.iMainValue;
	}

}
