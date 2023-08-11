package study.main;

import study.class_.etc.Book2;

public class Main2 {
// 정적필드(속성), 정적메소드 : 클래스명.필드, 클래스명.메소드명
// (동적)필드, (동적)메소드 : 클래스명 객체명 = new 클래스명();
// String name;
// if (name != null) {System.out.println(name);}
// >> 객체가 존재할 때만 출력될 수 있도록 처리
	public static void main(String[] args) {
		Book2 book = Book2.builder().title("책 제목").author("저자").description("소개").build();
		// title(), author(), description() 메소드가
		// 마지막에 BookBuilder를 반환하기 때문에 이어쓸 수 있다.
	System.out.println(book);
	}

}
