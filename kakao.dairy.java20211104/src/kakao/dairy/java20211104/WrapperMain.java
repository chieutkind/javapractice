package kakao.dairy.java20211104;

public class WrapperMain {

	public static void main(String[] args) {
		//�Ǽ� 32.4�� �ν��Ͻ��� ����
		Double d=32.4;
		
		//Wrapper Type�� �⺻������ ����
		double x = d;
		
		//���ڿ��� ���ڷ� ��ȯ - ������ ���� ������ NumberFormatException �߻�
		//"123"�� ���� 123���� ��ȯ
		int y=Integer.parseInt("123");
		
		//�߰��� ������ �־ NumberFormatException �߻�
		//y=Integer.parseInt("12 3");
		
		//���ڸ� ���ڿ��� ��ȯ
		//java������ Wrapper Class�� toString �޼��带 �̿��ص� �ǰ�
		//""�� +���൵ �˴ϴ�.
		
		String s = 123 + "";
		
		Integer i = 123;
		s = i.toString();
		
		//Object Ŭ������ �ν��Ͻ��� �⺻�� �����Ͱ� ����ִ� ���
		//�⺻������ ����ȯ�� �ȵ˴ϴ�.
		//Wrapper Type���� ����ȯ�ؼ� �����ؾ� ��.
		Object o = 123;
		//int k = (int)o; //���� ���������� ���� - Web Programming���� ����
		int k = (Integer)o;
	}

}
