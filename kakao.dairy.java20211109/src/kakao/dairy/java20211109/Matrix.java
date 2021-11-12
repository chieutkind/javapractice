package kakao.dairy.java20211109;

import java.util.HashMap;
import java.util.Map;

public class Matrix {

	public static void main(String[] args) {
		//���輱�� ��� ������ ����
		//��������  ���� �����ϰ� �� ������ ���� ���� ������ ����
		
		//�� �� ���� ���
		String [] hipass = {"������", "������", "������"};
		String [] kixx = {"������", "������","�Ѽ���"};
		String [] kgc = {"������", "�̼ҿ�","�Ѽ���"};


		//2���� �迭�� �ϳ��� �迭�� ���� - ������ ������ ���� �����ʹ� �ϳ��� ����
		String [][] volleyballs = {hipass, kixx, kgc};
		
		//������ ��� - �� ���� ����� �ٴ����� ���
		//�迭�� �ε����� �����͸� ã�ư�
		for(int i=0; i<volleyballs.length; i=i+1) {
			String [] players = volleyballs[i];
			
			if(i==0) {
				System.out.print("���ΰ���:"+"\t");
			}else if(i==1) {
				System.out.print("GS:"+"\t");
			}else{
				System.out.print("�λ����:"+"\t");
			}
			
			for(String player:players) {
				System.out.print(player+"\t");
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		//���� ���ɼ��� �ִ� �����͸� 2���� �迭�� ����� ���� �ٶ������� ����
		//1���� �迭�� �迭�� Ư¡�� ��Ÿ���� �Ӽ��� Map���� ����
		//�� Map�� �迭�� �����ִ� ���� �����մϴ�.
		
		Map<String,Object>map1=new HashMap<>();
		//���̸��� ��Ÿ���� �Ӽ�
		map1.put("name", "���ΰ���");
		//���� �����͸� ��Ÿ���� �Ӽ�
		map1.put("data", hipass);
		
		Map<String,Object>map2=new HashMap<>();
		//���̸��� ��Ÿ���� �Ӽ�
		map2.put("name", "GS");
		//���� �����͸� ��Ÿ���� �Ӽ�
		map2.put("data", kixx);

		Map<String,Object>map3=new HashMap<>();
		//���̸��� ��Ÿ���� �Ӽ�
		map3.put("name", "�λ����");
		//���� �����͸� ��Ÿ���� �Ӽ�
		map3.put("data", kgc);
		
		//������ �迭�� Map�� ������ �� �ٽ� �迭�� �����
		//Map �ȿ� �������� Ư¡�� ������ �� �ֱ� ������ 
		//�迭�� �����Ͱ� ������ �Ǵ��� ��� �κ��� ������ �ʿ䰡 ����.
		Map[]maps= {map1,map2,map3};
		
		for(Map map:maps) {
			System.out.print(map.get("name")+"\t");
			//�迭 ������
			String [] ar = (String[])map.get("data");
			//�迭�� ��ȸ�ϸ鼭 ���
			for(String player:ar) {
				System.out.print(player+"\t");
			}
			System.out.println();
		}

	}

}
