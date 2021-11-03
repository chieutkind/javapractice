package kakao.dairy.java20211102;

public class ThisMain {

	public static void main(String[] args) {
		//ThisClass에 있는 method()를 호출
		//1. static이 붙은 메서드인지 확인
		
		//2. static이 붙지 않은 메서드라면 인스턴스를 생성
		//생성자를 확인하고 생성자가 없음녀 static으로 자기 자신을 리턴하는 메서드 확인
		ThisClass obj = new ThisClass();
		
		//3. 필요한 메서드 호출
		obj.method();
	}

}
