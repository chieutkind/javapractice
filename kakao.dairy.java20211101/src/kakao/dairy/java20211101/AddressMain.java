package kakao.dairy.java20211101;

public class AddressMain {
	public static void main(String[] args) {
		AddressInfo p1 = new AddressInfo();
		p1.setId(0001);
		p1.setName("ȫ�浿");
		p1.setPhone("010-1234-1234");
		p1.setAddress("����� ����� �߾ӷ�1�� 11 101�� 101ȣ");
		
		AddressInfo p2 = new AddressInfo();
		p2.setId(0002);
		p2.setName("��浿");
		p2.setPhone("010-4321-4321");
		p2.setAddress("����� �߶��� �߽ɷ�2�� 22 102�� 201ȣ");
		
		System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getPhone()+" "+p1.getAddress());
		System.out.println(p2.getId()+" "+p2.getName()+" "+p2.getPhone()+" "+p2.getAddress());
		
		//toString
		System.out.println(p1);
		System.out.println(p2);
		
		//������ ����� �����͸� ���� �� ����ϰ��� �� ���� �迭�̳� list�� �����ؾ� ��.
		//�迭(ũ�Ⱑ ����)�̳� List(ũ�⸦ �����ų �� ����)�� ����
		
		AddressInfo [] contacts = new AddressInfo[3];
		
		for(int i=0; i<contacts.length; i=i+1) {
			contacts[i] = new AddressInfo();
		}
		
		contacts[0].setId(1);
		contacts[0].setName("ȫ�浿");
		contacts[0].setPhone("010-1234-1234");
		contacts[0].setAddress("����� ����� �߾ӷ�1�� 11");
		
		contacts[1].setId(2);
		contacts[1].setName("��浿");
		contacts[1].setPhone("010-4321-4321");
		contacts[1].setAddress("����� �߶��� �߽ɷ�2�� 22");
		
		contacts[2].setId(3);
		contacts[2].setName("��ö��");
		contacts[2].setPhone("010-5678-5678");
		contacts[2].setAddress("����� ���ϱ� ������3�� 33");
		
		for(AddressInfo person : contacts) {
			System.out.println(person);
		}
		
	}
}
