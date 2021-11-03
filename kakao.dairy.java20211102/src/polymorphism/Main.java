package polymorphism;

public class Main {
	public static void main(String[] args) {
		//앞에서 만든 메서드 3개를 전부 호출
		//star.attack()이라는 동일한 코드로 서로 다른 클래스에 있는 메서드를 호출
		//이것이 다형성입니다.
		Starcraft star = new Protoss();
		star.attack();
		
		Starcraft star = new Terran();
		star.attack();
		
		Starcraft star = new Zerg();
		star.attack();
	}
}
