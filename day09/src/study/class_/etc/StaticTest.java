package study.class_.etc;

public class StaticTest {
	private static int iNationPhoneNum = 82;
	// >> static을 안 걸어주면
	// main() 메소드 안에서 객체가 생성되기 전까지 iNation~은 Heap에 저장되지 않음
	// 따라서 아무것도 실행되지 않았을 때 오류가 남
	
	// >> static을 걸어주면 main 메소드가 실행될 때
	// 이 클래스를 읽으면서 static 변수, 메소드를 static에 저장해줌
	// 따라서 main이 실행되면 iNation~이 static에 저장되어 사용할 수 있음 
	
	public static void main(String[] args) {
		String nationName = "KOREA";
		System.out.println(nationName);
		System.out.println(iNationPhoneNum);
	}
}
