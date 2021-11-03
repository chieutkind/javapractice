package kakao.dairy.java20211102;

public class ThisClass {
	private int num; //기본값은 0
	
	public void method() {
		int num = 100;
		//num이 2개라서 가까이서 만든 num을 찾음
		System.out.println(num); //100
		System.out.println(this.num); 
		//this.을 붙이면 메소드 내부에서는	찾지 않고 메소드 외부에서부터 찾음.
	}
	
	static {
		System.out.println("맨 처음 한 번만 불러지는 코드");
	}
	
	{
		System.out.println("new를 호출할 때 마다 불러지는 코드");
	}

}
