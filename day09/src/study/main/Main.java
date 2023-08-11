package study.main;

import study.class_.etc.Book;

public class Main {
// 정적필드(속성), 정적메소드 : 클래스명.필드, 클래스명.메소드명
// (동적)필드, (동적)메소드 : 클래스명 객체명 = new 클래스명();
// String name;
// if (name != null) {System.out.println(name);}
// >> 객체가 존재할 때만 출력될 수 있도록 처리
	public static void main(String[] args) {
		
		Book book = new Book("부의 추월차선", "엠제이 드마코", "부자들이 말해 주지 않는 진정한 부를 얻는 방법");
		System.out.println(book.toString());
		System.out.println(book);
	}

}
