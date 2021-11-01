package kakao.dairy.java20211101;

public class Main3 {

	public static void main(String[] args) {
		//인스턴스 배열 만들기
		Menu [] menus = new Menu[3];
		
		//menus의 데이터를 순서대로 하나씩 menu에 대입
		//배열을 만들고 인스턴스를 대입할 때는 빠른 열거를 사용하면 안됨.
		//i는 0부터 menus.length까지 1씩 증가하면 수행
		for(int i=0; i<menus.length; i=i+1) {
			//인스턴스 대입하기
			//[0], [1], [2]에 인스턴스를 대입
			menus[i] = new Menu();
		}
		
		//데이터 저장하기
		menus[0].foodName="어묵";
		menus[0].price=500;
		
		menus[1].foodName="떡볶이";
		menus[1].price=2500;

		menus[2].foodName="김밥";
		menus[2].price=2000;
		
		//전부 출력
		for(Menu menu : menus) {
			System.out.println(
					menu.foodName+":"+menu.price+"원");
		}
	}

}
