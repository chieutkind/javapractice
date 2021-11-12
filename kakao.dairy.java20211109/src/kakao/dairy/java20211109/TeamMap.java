package kakao.dairy.java20211109;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TeamMap {

	public static void main(String[] args) {
		//Map�� �̿��ؼ� �ϳ��� ���� ǥ���ϸ� DTO Ŭ������ �ʿ����
		//���⼭ ������ ���� key�� ���ڿ��� �ۼ��ϱ� ������ key �̸��� ��Ȯ�ϰ� ����ؾ� ��
		//get�� �̿��ؼ� ������ �� ����� �� ���� �� ��ȯ�� ���־�� ��
		List<Map<String, Object>> list=
				new ArrayList<>();
		
		//1���� �����͸� �����ؼ� �߰��ϱ�
		Map<String, Object> map = new HashMap<>();
		map.put("team", "FC����");
		map.put("score",16);
		list.add(map);
		
		map = new HashMap<>();
		map.put("team", "FCǪ��");
		map.put("score",9);
		list.add(map);
		
		map = new HashMap<>();
		map.put("team", "FC����");
		map.put("score",10);
		list.add(map);
		
		map = new HashMap<>();
		map.put("team", "FC���̳���");
		map.put("score",22);
		list.add(map);
		
		//��ü ������ ����ϱ�
		for(Map<String, Object>temp:list) {
			System.out.println(temp.get("team")+":"+temp.get("score"));
		}

		
		//�Ϻκ��� ������ ����ϱ�
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(true) {
			int size = i + 2;
			for(; i<size; i=i+1) {
				if(i==list.size()) {
					break;
				}
				System.out.println(list.get(i));
			}
			//���� �ݺ��� ����
			if(i==list.size()) {
				break;
			}
			//���� ������ �Է¹ޱ�
			System.out.println("���� ������ �����ʹ� ENTER�� ������ �������ϴ�.");
			sc.nextLine();
		}
		//���� �ݺ��� ����
		
		System.out.println("===============");
		System.out.println("������ 1�� ��������");
		System.out.println(list.get(1));
		
		System.out.println("===============");
		System.out.println("������ �����ϱ�");
		
		//map �ȿ� �ִ� �����͸� �������� ����
		list.sort(new Comparator<Map<String, Object>>(){
			
			@Override
			public int compare(Map<String, Object> o1, Map<String,Object>o2) {
				String front = (String)o1.get("team");
				String back = (String)o2.get("team");
				return front.compareTo(back);

				
			}
		});
		for(Map<String, Object>temp:list) {
			System.out.println(temp.get("team"));
		}
	}

}
