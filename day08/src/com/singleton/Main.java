package com.singleton;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		// 객체는 heap에 생성된다 (heap : 메모리를 구성하는 하나의 영역, 주소값으로 표현된다.)
//		SingleTonTest singleTonTest1 = new SingleTonTest();
//		SingleTonTest singleTonTest2 = new SingleTonTest();
//		SingleTonTest singleTonTest3 = new SingleTonTest();
//		
//		System.out.println(singleTonTest1);
//		System.out.println(singleTonTest2);
//		System.out.println(singleTonTest3);
		// 3개의 서로 다른 레퍼런스가 출력된다
		// >> 한명의 사용자 당 하나의 객체가 연결된 꼴
		// >> 비용이 많이든다
		// 또한 매번 객체가 초기화됨
		
		SingleTonTest st = SingleTonTest.getInstance("bibi");
		System.out.println(st);
		
		SingleTonTest st2 = SingleTonTest.getInstance("bibi");
		System.out.println(st2);
		// 출력 시, 같은 레퍼런스 임을 확인할 수 있다.
		
		
		
	}

}
