package kakao.dairy.java20211108;

import java.util.HashMap;
import java.util.Set;

public class MapUse {

	public static void main(String[] args) {
		//Key�� String���� �ϰ� Value�� Object�� �ϴ� HashMap�� ����
		//Value�� Object�� �ϴ� ������ Object���� ��� ������ �����и� ������ �� ������
		//��ſ� Object�� �� �����ʹ� ����� �� ���� �����ϰ�� ���� �� ��ȯ�� ���ؼ�
		//������ �ڷ������� �ǵ����� ����ؾ� ��
		
		//1.HashMap ����
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		//2.������ ����
		map.put("name", "adam");
		map.put("age", 50);
		map.put("age", 44); //age�� �����͸� �����ߴµ� �ٽ� �����ϸ� ����
		
		//3.������ ������
		String name = (String)map.get("name");
		int age = (Integer)map.get("age");
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
		
		//4. ������ �߰�
		map.put("song", "���� ���� ���");
		String [] albums = {"���׽ý�", "���Ҵ���"};
		map.put("album", albums);
		
		//5. toString �޼���: �� ����� toString �޼��带 ȣ���� ���
		System.out.println(map);
		
		//6. ���� key�� ����Գ� null ����
		System.out.println(map.get("hobby"));
		
		//7. ������ ����
		//map.remove("album");
		map.put("album", null);
		//get���� ������ null�̱� ������ ��������� ����
		System.out.println(map);
		
		//8. ��ü ������ ��ȸ
		Set<String> keys = map.keySet(); //��� key�� ������
		for(String key : keys) {
			System.out.println(key+":"+map.get(key));
		}
	}

}
