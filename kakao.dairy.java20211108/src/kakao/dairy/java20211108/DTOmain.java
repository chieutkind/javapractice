package kakao.dairy.java20211108;

import java.util.Arrays;
import java.util.Comparator;

public class DTOmain {

	public static void main(String[] args) {
		// DTO Ŭ������ �ν��Ͻ� 4���� ������ �� �ִ� �迭�� ����

		DTO [] ar = new DTO;
		
		ar[0] = new DTO();
		ar[0].setName("�ϳ�");
		ar[0].setAge(20);
		
		//System.out.println(Arrays.toString(ar));
		for(DTO dto : ar) {
			System.out.println(dto);
		}
		
		//�迭�� ������ ������ Arrays./sort �޼��忡
		//�迭�� �����ϰ� Comparator �������̽��� �̿��ؼ� ���ϴ� �� �޼��带
		//�����ϸ� �迭�� �����Ͱ� ������ ��.
		Arrays.sort(ar, new Comparator<DTO>() {

			@Override
			public int compare(DTO o1, DTO o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - 02.getAge();
			}
			
			
		});

	}

}
