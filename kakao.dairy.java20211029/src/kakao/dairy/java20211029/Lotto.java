package kakao.dairy.java20211029;

public class Lotto {

	public static void main(String[] args) {
		//1~45���� 6���� ���ڸ� �ߺ����� �����ϰ� �����ͺ��� ū �� ������ ���
		//6���� ���ڴ� Ű����κ��� �Է��� ����.
		
		//������: 1~45 ������ ���� 6��, ���� ������ ���� �������� ����
		//1. 1���� 45������ ���� 6���� ������ �� �ִ� ������ ���� ���� - �迭�� ����
		int [] lotto = new int[6];
		
		//Ű����κ��� �Է¹ޱ�
		java.util.Scanner sc = new java.util.Scanner(System.in);
		//�Է¹ޱ�
		//���� = sc.next�ڷ���();
		//������ Int, �Ǽ��� Double, boolean�� Boolean, ���ڿ��� Line�̶�� �ڷ����� �����ϸ� ��.

		//�迭�� ũ�⸸ŭ ������ �Է¹޾Ƽ� �迭�� ����
		//�Է¹��� ������ �ӽú����� ������ �� �迭�� �ű�� ���� �����ϴ�.
		int len = lotto.length;
		
		//�ε����� �̿��ؼ� �迭�� ��� �����͸� ����
		for(int i=0; i<len; i=i+1) {
			//������ �Է¹޾Ƽ� input�� ����
			System.out.print("1~45�� ���� �Է�: ");
			int input = sc.nextInt();
			
			//input�� �Էµ� ������ �迭�� ������� ����
			lotto[i] = input;
		}
		
		
		//����� ����Ǹ� sc.close();
		sc.close();
		
		
		//lotto �迭�� ����� �����͸� �� �ٷ� ���� ���
		for(int num : lotto ) {
			System.out.print(num+"\t");
		}
		System.out.println("");
	}

}
