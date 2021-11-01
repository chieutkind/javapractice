package kakao.dairy.java20211101;

public class MethodClass {
	//매개변수가 없는 메소드
	public void method() {
		System.out.println("Hello Java");
	}

	//static: 인스턴스 생성없이 클래스 이름으로 호출가능하도록 생성
	public static void noArgDisp() {
		//반복문을 3번 출력
		for(int i=0; i<3; i=i+1) {
			System.out.println("매개변수가 없는 함수");
		}
	}
	public static void ArgDisp(int n) {
		for(int i=0; i<n; i=i+1)
			System.out.println("매개변수가 있는 함수");
	}

	//매개변수가 2개인 메소드
	//문자열 1개와 정수 1개를 매개변수로 가지는 메소드
	public static void twoArgDisp(String str, int n) {
		for(int i=0; i<3; i=i+1) {
			System.out.println(str);
		}
	}

	//리턴이 없는 2개의 정수를 더해서  출력하는 메소드
	public void noReturnAdd(int n1, int n2) {
		System.out.println(n1+n2);
	}

	//2개의 정수를 받아서 더한 후 결과를 리턴하는 메서드
	public int returnAdd(int n1, int n2) {
		return n1+n2;
	}
}
