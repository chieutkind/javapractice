package kakao.dairy.java20211101;

public class ParameterType {
	//�Ű������� �ڷ����� int(�⺻��)
	//�޼��� ������ �Ű������� ���� �����ص� ȣ���� �� ���Ե� �����ʹ� ������ ����
	public static void valueSwap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
	
	//�Ű������� �ڷ����� int [](�迭)
	//�޼��� ������ �Ű������� ���� �����ϸ� ȣ���� �� ���Ե� �����͵� ������ ����
	public static void refSwap(int []ar) {
		//���� ��ȯ
		int temp = ar[0];
		ar[0] = ar[1];
		ar[1] = temp;
		System.out.println("ar[0]:"+ar[0]);
		System.out.println("ar[1]:"+ar[1]);
	}

}
