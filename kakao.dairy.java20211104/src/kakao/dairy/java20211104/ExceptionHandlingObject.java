package kakao.dairy.java20211104;

public class ExceptionHandlingObject {

	public static void main(String[] args) {
		int n=10;
		int x=0;
		
		try {
			//���ܰ� �߻��ϴ� ����
			System.out.println("result="+(n/x));
		}catch(Exception e) {
			//����̳� ȭ�鿡 ����ϴ� �ڵ� �ۼ� - Logging
			System.out.println(e.getLocalizedMessage());
		}
		
		//����ó���� ���� ������ �տ��� ���ܰ� �߻��ϱ� �빮�� �� ������ ������� ����
		System.out.println("��� ������ ����");

	}

}
