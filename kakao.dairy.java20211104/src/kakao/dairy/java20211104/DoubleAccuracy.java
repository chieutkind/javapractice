package kakao.dairy.java20211104;

import java.math.BigDecimal;

public class DoubleAccuracy {
	public static void main(String[] args) {
		double d1 = 1.60000000000000000000;
		double d2 = 0.10000000000000000000;
		//��� - 1.7000000000000002
		//�̷� ����� ���� ������ �Ҽ��� ������ ���� ����
		System.out.println(d1+d2);
		
		//���ڷ� �������� �ʰ� ���ڿ��� ������ �ִٰ� ����� �� �� ���ڷ� �����ؼ�
		//����ϱ� ������ ���е��� ������� ��Ȯ�� ����� �� -> ��� �ӵ��� ����
		BigDecimal bd1 = new BigDecimal("1.60000000000000000000");
		BigDecimal bd2 = new BigDecimal("0.10000000000000000000");
		
		System.out.println(bd1.add(bd2));

	}
}
