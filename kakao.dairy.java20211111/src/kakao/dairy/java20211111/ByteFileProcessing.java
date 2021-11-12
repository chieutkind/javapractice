package kakao.dairy.java20211111;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileProcessing {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("./bytefile.txt");
			String str = "�ȳ��ϼ��� �ݰ����ϴ�.";
			try {
				fos.write(str.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ ��θ� Ȯ���غ�����!!!");
		}finally {
			try {
				fos.close();
			}catch (IOException e) {
				e. printStackTrace();
			}
		}
		
		FileInputStream fis = null;
		
	try {
		fis=new FileInputStream("./bytefile.txt");
		byte[] b = null;
		b = new byte[fis.available()];
		int len = fis.read(b);
		if(len <= 0) {
			System.out.println("���� �����Ͱ� ����");
		}else {
			String str = new String (b);
			System.out.println(str);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	}

}
