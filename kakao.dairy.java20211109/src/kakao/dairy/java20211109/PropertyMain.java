package kakao.dairy.java20211109;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyMain {

	public static void main(String[] args) {
		//�Ӽ��� ���� ���ڿ��� �����ϴ� �ν��Ͻ��� ����
		Properties prop = new Properties();
		
		//���� ����
		prop.setProperty("name", "adam");
		prop.setProperty("age", "44");

		//�� �б�
		System.out.println(prop.getProperty("name"));
		//�ڹٿ����� ���� �Ӽ��� ������ null
		//�Ӽ��� ���� �����ϴ� �ڷᱸ�������� ���� �Ӽ��� ���� �����غ��� ��
		//null�� ���ϵǴ��� �ƴϸ� ���ܰ� �߻��ϴ��� Ȯ���غ��� ��
		System.out.println(prop.getProperty("job"));
		
		//���Ͽ� ����
		try {
			//����� ���Ͻ�Ʈ���� ����
			FileOutputStream fos = new FileOutputStream("./data.properties");
			prop.store(fos, "�ּ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			//����� ���Ͻ�Ʈ���� ����
			FileOutputStream fos = new FileOutputStream("./data.txt");
			prop.store(fos, "�ּ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			//����� ���Ͻ�Ʈ���� ����
			FileOutputStream fos = new FileOutputStream("./data.xml");
			prop.store(fos, "�ּ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
