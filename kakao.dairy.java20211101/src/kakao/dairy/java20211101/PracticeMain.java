package kakao.dairy.java20211101;

public class PracticeMain {

	public static void main(String[] args) {
		//�޼��� ���
		//static�� �ִ��� ������ Ȯ�� : �ν��Ͻ��� ������ �ϴ��� �׷��� ������
		//( )  �ȿ� �Ű������� �ִ��� Ȯ�� : ������ �´� �����͸� �־��־�� ��
		//���� Ÿ���� void���� �ƴ��� : void�� �ƴϸ� ����� ������ �����ϰ� ���
		
		//1. Practice Ŭ������ staticMethod ȣ��
		Practice.staticMethod();
		
		//2. Practice Ŭ������ disp ȣ��
		//static�� ������ �ν��Ͻ��� ���� ȣ��
		Practice practice = new Practice();
		practice.disp();
		
		//3. Practice Ŭ������ sum �޼��带 �̿��ؼ� 1���� 100������ �հ� ���
		practice.sum(100);
		
		//4. Practice Ŭ������ prime �޼��带 ȣ���ؼ� 2���� 1000 ������ �Ҽ� ���� ���
		int result = practice.prime();
		System.out.println(result);
	}

}
