package kakao.dairy.java20211101;

public class MethodClass {
	//�Ű������� ���� �޼ҵ�
	public void method() {
		System.out.println("Hello Java");
	}

	//static: �ν��Ͻ� �������� Ŭ���� �̸����� ȣ�Ⱑ���ϵ��� ����
	public static void noArgDisp() {
		//�ݺ����� 3�� ���
		for(int i=0; i<3; i=i+1) {
			System.out.println("�Ű������� ���� �Լ�");
		}
	}
	public static void ArgDisp(int n) {
		for(int i=0; i<n; i=i+1)
			System.out.println("�Ű������� �ִ� �Լ�");
	}

	//�Ű������� 2���� �޼ҵ�
	//���ڿ� 1���� ���� 1���� �Ű������� ������ �޼ҵ�
	public static void twoArgDisp(String str, int n) {
		for(int i=0; i<3; i=i+1) {
			System.out.println(str);
		}
	}

	//������ ���� 2���� ������ ���ؼ�  ����ϴ� �޼ҵ�
	public void noReturnAdd(int n1, int n2) {
		System.out.println(n1+n2);
	}

	//2���� ������ �޾Ƽ� ���� �� ����� �����ϴ� �޼���
	public int returnAdd(int n1, int n2) {
		return n1+n2;
	}
}
