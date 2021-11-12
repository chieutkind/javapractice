package kakao.dairy.java20211109;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatClass {

	public static void main(String[] args) {
		Date date=new Date();
		double number = 123456000;
		
		//��¥ �� �ð���
		//�⵵ 4�ڸ� �� 2�ڸ� �� 2�ڸ�
		//���� ���� �ð� 2�ڸ� �� 2�ڸ� �� 2�ڸ��� ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� EEE a hh�� mm�� ss��");
		String result = sdf.format(date);
		System.out.println(result);
		
		//���ڿ� ��ȭ��ȣ�� õ���� ���� ��ȣ�� ����
		DecimalFormat df = new DecimalFormat("\u00A4 #,###");
		result = df.format(number);
		System.out.println(result);

	}

}
