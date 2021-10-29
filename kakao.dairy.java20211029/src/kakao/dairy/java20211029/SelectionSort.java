package kakao.dairy.java20211029;

public class SelectionSort {

	public static void main(String[] args) {
		//1. ���� 5���� �����ϴ� �迭�� ���� - �ʱⰪ�� ���Ƿ� �ο�
		//�� �κ��� Ű����κ��� �Է¹޴� �ڵ�� ����

		int [] x = {0, 0, 0, 0, 0};
		//array keyboard input
		java.util.Scanner sc = new java.util.Scanner(System.in);
		for (int i=0; i<5; i=i+1) {
			System.out.print("���� �Է�:");
			x[i] = sc.nextInt();
		}

		sc.close();

		//array print
		for (int num : x) {
			System.out.print(num+"\t");
		}
		System.out.println("");

		//��������
		//ù��° �ڸ����� ������ -1���� �����͸� ���
		//��ü�� �ʿ����� �ʰų� �ε����� �ʿ��� ���� ���� ���Ÿ� ����ϸ� �ȵ�.
		int len=x.length;
		
		//ù��° �ڸ����� ������ -1����
		for (int i=0; i<len-1; i=i+1) {
			//�ڿ� �ִ� ��� ��
			for(int j=i+1;j<len;j=j+1) {
				//�ڽ��� �����Ϳ� �ڿ� �ִ� �����͸� ���ؼ� �ڽ��� �� ũ��
				if(x[i]>x[j]){
					//�������� ��ġ�� ��ȯ - swap
					int temp=x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		for (int num : x) {
			System.out.print(num+"\t");
		}
		System.out.println("");
		
		
	}

}