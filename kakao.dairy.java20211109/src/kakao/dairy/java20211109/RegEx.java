package kakao.dairy.java20211109;

public class RegEx {

	public static void main(String[] args) {
		//���� �ҹ��ڷ� �����ϴ��� 3���ڸ� Ȯ��
		
		//Ȯ���ϱ� ���� ���ڿ�
		String [] ar = {"abc", "acc", "addd", "Ads", "��aa", "1sf"};

		//��ȸ�� ���� ����
		//�ҹ��ڷ� �����ϴ� 3����
		String pattern = "^[a-z]..";
		
		for(String str : ar) {
			System.out.println(str.matches(pattern));
		}
	}

}
