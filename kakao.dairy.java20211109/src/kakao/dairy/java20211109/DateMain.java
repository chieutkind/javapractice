package kakao.dairy.java20211109;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain {

	public static void main(String[] args) {
		//���ú��� 1986�� 5�� 5�ϱ��� ������ ��¥ ���
		
		//1986�� 5�� 5���� Calendar ��ü�� ����
		Calendar meetday = new GregorianCalendar(1986,4,5);
		//���� ��¥ �����
		Calendar today = Calendar.getInstance();
		

		//epoch time���� ��ȯ�ؼ� ����
		long cha = today.getTimeInMillis() - meetday.getTimeInMillis();
		
		//�� ����
		long second = cha / 1000;
		
		//�� ����
		long minute = second/60;
		
		//�ð� ����
		long hour = minute/60;
	
		//��¥
		long day = hour/24;
		System.out.println("����ī�� ������ "+day+" ���� �������ϴ�.");
		
		//Calendar�� Date�� ��ȯ
		Date date = new Date(today.getTimeInMillis());
		System.out.println(date);
		
		//Date ��ü�� ������ Calendar�� ��ȯ
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println(cal);
	}

}
