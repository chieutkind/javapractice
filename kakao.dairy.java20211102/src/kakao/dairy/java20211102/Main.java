package kakao.dairy.java20211102;

public class Main {

	public static void main(String[] args) {
		//P Class�� method�� ���
		//�����Ǵ� �޼��带 ����� �� Ȯ���� ����
		//1. static�� �پ����� �� �پ����� Ȯ��
		//2. static�� ���� �ʾҴٸ� �ν��Ͻ� ������ ��� �ؾ� �ϴ���
		P obj = new P();
		//3. �Ű������� � �ڷ��� �� ������ Ȯ�� - ����
		//4. return type�� ��� �Ǵ��� - void
		obj.method();
		
		System.out.println("=======================");
		//P Ŭ������ method�� ����� �����ϴٰ� �ǴܵǸ�
		//P Ŭ������ ��ӹ޴� Ŭ������ ���� - C
		//C Ŭ������ ����� �����ϴٰ� �Ǵܵ� �޼ҵ带 ������
		
		C ins = new C();
		ins.method();
		
		//P�� ���� Ŭ���� C�� ���� Ŭ����
		P p = new P(); //Ŭ������ �ν��Ͻ� Ÿ���� ������ ������ ����
		p = new C(); //�ν��Ͻ��� Ÿ���� ������ Ŭ������ ���� Ŭ�����̸� ����
		
		C c = new C();
		//c = new P(); �� ������ ����
		//C�� P Ŭ������ ���� Ŭ�����̱� ������ ����

		//c = (C)(new P()); ������ ������ ���� �߻�
		
		c= (C)p; //���� �߻����� ���� - p���� C()�� ���ԵǾ� �־ ����.
		
	}

}