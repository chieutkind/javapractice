package kakao.dairy.java20211101;

public class AddressMain {
	public static void main(String[] args) {
		AddressInfo p1 = new AddressInfo();
		p1.setId(0001);
		p1.setName("홍길동");
		p1.setPhone("010-1234-1234");
		p1.setAddress("서울시 노원구 중앙로1길 11 101동 101호");
		
		AddressInfo p2 = new AddressInfo();
		p2.setId(0002);
		p2.setName("고길동");
		p2.setPhone("010-4321-4321");
		p2.setAddress("서울시 중랑구 중심로2길 22 102동 201호");
		
		System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getPhone()+" "+p1.getAddress());
		System.out.println(p2.getId()+" "+p2.getName()+" "+p2.getPhone()+" "+p2.getAddress());
		
		//toString
		System.out.println(p1);
		System.out.println(p2);
		
		//동일한 모양의 데이터를 여러 개 사용하고자 할 때는 배열이나 list를 생각해야 함.
		//배열(크기가 고정)이나 List(크기를 변경시킬 수 있음)을 생각
		
		AddressInfo [] contacts = new AddressInfo[3];
		
		for(int i=0; i<contacts.length; i=i+1) {
			contacts[i] = new AddressInfo();
		}
		
		contacts[0].setId(1);
		contacts[0].setName("홍길동");
		contacts[0].setPhone("010-1234-1234");
		contacts[0].setAddress("서울시 노원구 중앙로1길 11");
		
		contacts[1].setId(2);
		contacts[1].setName("고길동");
		contacts[1].setPhone("010-4321-4321");
		contacts[1].setAddress("서울시 중랑구 중심로2길 22");
		
		contacts[2].setId(3);
		contacts[2].setName("김철수");
		contacts[2].setPhone("010-5678-5678");
		contacts[2].setAddress("서울시 강북구 중점로3길 33");
		
		for(AddressInfo person : contacts) {
			System.out.println(person);
		}
		
	}
}
