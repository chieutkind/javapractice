package kakao.dairy.java20211108;

import java.util.Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		//�迭�� ����
		String [] soccers = {"�ݹٽ���", "����Ʈ", "��ī����"};
		//������ Ȯ�� - �����
		//�迭�� �ٷ� toString�� ȣ���Գ� ����� Ŭ���� �̸��� �ؽ��ڵ尡 ����
		System.out.println(soccers);
		//Arrays Ŭ������ toString�� �̿��ϸ� �迭 �� ����� toString ȣ��
		System.out.println(Arrays.toString(soccers));
		
		//soccers �迭�� �����ؼ� ���ο� �迭�� ����
		//java.util.Arrays Ŭ������ copyOf��� �޼��带 �̿��� �� ����
		
		String [] soccerscopy = Arrays.copyOf(soccers, soccers.length);
		System.out.println(Arrays.toString(soccerscopy));
		
		
		soccerscopy[2] = "����";
		System.out.println(Arrays.toString(soccerscopy));
		System.out.println(Arrays.toString(soccers));

		//soccers�� ������ ����
		Arrays.sort(soccers);
		System.out.println(Arrays.toString(soccers));
	}

}


