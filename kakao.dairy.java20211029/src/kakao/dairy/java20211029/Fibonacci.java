package kakao.dairy.java20211029;

public class Fibonacci {

	public static void main(String[] args) {
		int fibo;//12��° �Ǻ���ġ ������ ���� ������ ����
		
		//���� 2�� ���� ���� ������ ���� - �ʱⰪ
		int n_1=1;
		int n_2=1;
		
		//�Ǻ���ġ ������ ��Ģ�� 3��°���� ����˴ϴ�.
		for(int n=3; n<=12; n=n+1) {
			//���� 2�� ���� ���� ������ ����° ���� ���� ����
			fibo=n_1+n_2;
			//�ٷ� ���� ���� ���� �� ���� �׿� ����
			n_2=n_1;
			//���� ����� �����׿� ����
			n_1=fibo;
		}
		
		System.out.println(fibo);

	}

}
