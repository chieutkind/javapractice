package kakao.dairy.java20211029;

public class ArrayDataUpdate {

	public static void main(String[] args) {
		//3���� ���ڿ��� �Է¹޾Ƽ� �迭�� ����

		//1.3���� ���ڿ��� ������ �� �ִ� �迭�� ����
		String [] myApps = new String[3]; //����� 3���� ������ ���� - �����ʹ� null
		int len = myApps.length;


		//2. �迭�� ������ŭ ���ڿ��� �Է¹޾Ƽ� �迭�� ����
		java.util.Scanner sc = new java.util.Scanner(System.in);

		for (int i=0; i<len; i=i+1) {
			System.out.print("�� �̸� �Է�:");
			//���ڿ��� �Է¹޾Ƽ� myApps�� ������� ����
			myApps[i] = sc.nextLine();
		}
		
		//3.myApps�� ��� �����͸� ���
		
		for (int i=0; i<len; i=i+1) {
			System.out.print(myApps[i]+" ");
		}

		//��ĳ�� ���� ����
		sc.close();
	}

}

