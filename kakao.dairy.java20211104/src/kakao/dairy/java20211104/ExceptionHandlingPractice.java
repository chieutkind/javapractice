package kakao.dairy.java20211104;

public class ExceptionHandlingPractice {

	public static void main(String[] args) {
		try {
			//���ܰ� �߻��Ҹ��� �ڵ带 �ۼ�
			int x=10;
			int n=0;
			
			int result = x/n;
			System.out.println("result:" + result);
		}catch(ArithmeticException e) {
			//AritmeticException�� �߻����� �� ó���� ����
			System.out.println("�������:"+e.getLocalizedMessage());
		}finally {
			//������ ������ ����
			System.out.println("������ ������ ����");
			System.out.println("�ַ� �ܺ� �ڿ� ���� ���� �ڵ带 �ۼ�");
		}
		

	}

}
