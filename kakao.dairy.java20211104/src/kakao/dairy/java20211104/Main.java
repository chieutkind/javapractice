package kakao.dairy.java20211104;

public class Main {

	public static void main(String[] args) {
		//DTO 인스턴스 2개 생성
		DTO obj1 = new DTO();
		obj1.setNum(1);;
		obj1.setName("adam");
		
		DTO obj2 = new DTO();
		obj2.setNum(1);;
		obj2.setName("adam");
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		//각각 new를 이용해서 생성자를 호출했기 때문에 별도의 메모리 영역을
		//차지하고 있어서 false
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
		
		int x = 100;
		int y = x;
		//x를 복사한 것이 아니고 x가 가진 데이터인 100을 y가 가리키도록 한 것
		y = 200;//y 값을 변경
		System.out.println("x:"+x);
		//x는 100을 복사해준 것이무로 영향이 없음
		//call by value
		System.out.println("y:"+y);
		
		int [] ar = {100, 200, 300};
		int [] br = ar;
		//ar이 가리키고 있는 100, 200, 300의 대표 
		br[0] = 123;
		
		System.out.println("ar[0]:"+ar[0]);
		System.out.println("br[0]:"+br[0]);
		
		DTO adam = new DTO();
		adam.setNum(1);
		adam.setName("adam");
		
		DTO hunt = adam; //참조를 복사
		//adam의 것도 같이 변경되는 것처럼 보입니다.
		//adam과 hunt는 동일한 인스턴스입니다.
		hunt.setNum(2);
		
		System.out.println(adam);
		System.out.println(hunt);
		
		//복제
		DTO jessica = adam.clone();
		jessica.setNum(12);
		
		System.out.println(adam);
		System.out.println(jessica);

		
	}

}
