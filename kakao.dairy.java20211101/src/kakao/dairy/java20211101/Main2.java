package kakao.dairy.java20211101;

public class Main2 {

	public static void main(String[] args) {
		//������ �̸��� ���� - static
		//static ������ Ŭ���� �̸����� ��� ����
		Menu.resName = "���кн�";
		
		//������ �޴� ����
		Menu menu1 = new Menu();
		menu1.foodName = "���";
		menu1.price = 3000;

		Menu menu2 = new Menu();
		menu2.foodName = "���";
		menu2.price = 2000;
		
		//���
		//�н��� �̸�
		System.out.println(Menu.resName);
		
		System.out.println(menu1.foodName + ":" + menu1.price + "��");
		System.out.println(menu2.foodName + ":" + menu2.price + "��");

		
	}

}
