package kakao.dairy.java20211102;

public class ItemMain {

	public static void main(String[] args) {
		//Item Ŭ������ �ν��Ͻ� ����� ����� Ȯ���غ���
		//������ ������� �ν��Ͻ��� �����غ���
		Item item1 = new Item();
		Item item2 = new Item(
				1, "Orange", "��Ÿ�� C ǳ��", 3000, "orange.png");

		//������ �ν��Ͻ��� ���� ����غ���
		System.out.println(item1.getItemid());
		System.out.println(item1.toString());
		System.out.println(item2.toString());

	


	}

}
