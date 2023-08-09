package com.singleton;

public class SingleTonTest {
	private static SingleTonTest instance = null;

	private String name;
	
	private SingleTonTest() {} // 현재 생성자가 private
	// >> 외부에서 직접 접근 불가능 
	// >> 같은 클래스의 static 메소드를 만들어 static의 특성을 이용해 호출하자
	
	private SingleTonTest(String name) {
		this.name = name;
	}
	
	public static SingleTonTest getInstance(String name) {
		
		if (instance == null) { // 객체가 선언만 되고 생성되지 않음
			instance = new SingleTonTest(name);
			System.out.println(name + "객체가 생성되었습니다.");
		} else {
			System.out.println("이미 생성된 " + name + "객체를 리턴합니다.");
		}
		return instance; // 객체는 return 값을 null로
	}
}
