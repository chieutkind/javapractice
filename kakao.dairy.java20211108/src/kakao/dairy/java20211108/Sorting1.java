package kakao.dairy.java20211108;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting1 {

	public static void main(String[] args) {
		String [] ar = {"���̸�","����","����","����","����"};
		//���ڿ� �������� ���� - Arrays.sort �޼��� �̿�
		//Comparator�� ������ Ŭ���� �����
		class Temp implements Comparator<String>{
			//���ڿ��� �������� �ϱ� ���ؼ� ������ �����ؼ� ��
			//������� ���� ����� -1�� ���ص� ��
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
				//return o1.compareTo(o2)*-1;
			}

		}

		Arrays.sort(ar, new Temp());
		System.out.println(Arrays.toString(ar));

		Integer[] xr = {30,20,19,24,65,27};
		//������ �������� ����
		Arrays.sort(xr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		System.out.println(Arrays.toString(xr));}
}


