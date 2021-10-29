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
			if(input<1 || input>45) {
				System.out.println("�߸��� �����Դϴ�.");
				i=i-1;
				continue;
			}
			boolean flag=true;
			for(int imsi:lotto) {
				if(input==imsi) {
					System.out.println("�ߺ��� �����Դϴ�.");
					flag=false;
					break;
				}
			}
			if(flag==false) {
				i=i-1;
				continue;
			}
			

			//�ߺ� üũ
			//�̹� ����� ���ڸ� �Է��ϴ� ��쿡�� ��ȿ
			//���� �Է¹��� ���ڰ� �迭�� �ִ��� ����
			//��ȿ������ �˰����� �迭�� ��� �����Ϳ� ���ϴ� ��
			//���� �迭�� �ִ� ��� �����Ϳ� �Է¹��� �����Ͱ� ������ Ȯ��



			//�����Ͱ� ���Ŀ� �´��� �˻� - Validation Check (��ȿ�� �˻�)
			//1���� 45 ������ ���ڰ� �ƴϸ� ����� �߻���Ű�� �ٽ� �Է��ϵ��� �ϱ�
			//input�� 1���� 45���̰� �ƴ϶�� 

			//input�� �Էµ� ������ �迭�� ������� ����
			lotto[i] = input;
		}
		
		//������ ����
		


		//����� ����Ǹ� sc.close();
		sc.close();

		
		for(int i=0; i<len-1; i=i+1) {
			for(int j=i+1;j<len;j=j+1) {
				if(lotto[i]>lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}

		//lotto �迭�� ����� �����͸� �� �ٷ� ���� ���
		for(int num : lotto ) {
			System.out.print(num+"\t");
		}
		System.out.println("");
	}

}
