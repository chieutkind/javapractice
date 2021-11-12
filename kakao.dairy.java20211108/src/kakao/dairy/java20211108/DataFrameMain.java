package kakao.dairy.java20211108;

import java.util.ArrayList;
import java.util.Comparator;

public class DataFrameMain {
	public static void main(String[] args) {
		//1.DataFrame �����
		//boolean, byte, short, char, int, long, float, double, String
		//DTO Class - ����
		//�迭, ArrayList, LinkedList - ����

		ArrayList<DTO> ar = new ArrayList<>();

		//2.������ �߰�
		DTO dto = new DTO();
		dto.setName("�ϳ�");
		dto.setAge(30);
		//�������� ������ �߰�
		ar.add(dto);

		//���ο� �����͸� ���� dto�� ����
		dto = new DTO();
		dto.setName("�θ�");
		dto.setAge(28);
		//�������� ������ �߰�
		ar.add(dto);

		dto = new DTO();
		dto.setName("����");
		dto.setAge(24);
		//�������� ������ �߰�
		ar.add(dto);

		dto = new DTO();
		dto.setName("��Ƽ");
		dto.setAge(22);
		//2���� ������ �����ֱ�
		ar.add(2, dto);

		//��� ������ Ȯ���ϱ�
		//List�� toString�� ������ �Ǿ� �־ ��� �������� toString�� �ϳ���
		//���ڿ��� ���ļ� ������ - �����͸� Ȯ�θ� �ϰ��� �� �� ���
		System.out.println(ar);

		for(DTO temp:ar) {
			System.out.println(temp);
		}

		System.out.println("-----------------------");
		//������ ���� - size()
		//������ 1���� �������� ���� get(int index)
		int len = ar.size();
		for(int i=0; i<len; i=i+1) {
			System.out.println(ar.get(i));
		}

		//������ ����
		//set(int index, Data data)
		//������ ���̸� 22�� ����
		dto = new DTO();
		dto.setName("�پƽ�");
		dto.setAge(33);
		ar.set(3, dto);

		System.out.println("---------------------");
		for(DTO temp : ar) {
			System.out.println(temp);
		}

		//5. ������ ����
		//remove(int index)
		ar.remove(0);
		System.out.println("---------------------");
		for(DTO temp : ar) {
			System.out.println(temp);
		}
		
		//6.������ ����
		//sort( Comparator comparator)
		
		ar.sort(new Comparator<DTO>() {

			@Override
			public int compare(DTO arg0, DTO arg1) {
				// TODO Auto-generated method stub
				return arg0.getName().compareTo(arg1.getName());
			}
			
		});
		
		System.out.println("---------------------");
		for(DTO temp : ar) {
			System.out.println(temp);
		}
		
		

	}
}
