package kakao.dairy.java20211101;

public class Main3 {

	public static void main(String[] args) {
		//�ν��Ͻ� �迭 �����
		Menu [] menus = new Menu[3];
		
		//menus�� �����͸� ������� �ϳ��� menu�� ����
		//�迭�� ����� �ν��Ͻ��� ������ ���� ���� ���Ÿ� ����ϸ� �ȵ�.
		//i�� 0���� menus.length���� 1�� �����ϸ� ����
		for(int i=0; i<menus.length; i=i+1) {
			//�ν��Ͻ� �����ϱ�
			//[0], [1], [2]�� �ν��Ͻ��� ����
			menus[i] = new Menu();
		}
		
		//������ �����ϱ�
		menus[0].foodName="�";
		menus[0].price=500;
		
		menus[1].foodName="������";
		menus[1].price=2500;

		menus[2].foodName="���";
		menus[2].price=2000;
		
		//���� ���
		for(Menu menu : menus) {
			System.out.println(
					menu.foodName+":"+menu.price+"��");
		}
	}

}
