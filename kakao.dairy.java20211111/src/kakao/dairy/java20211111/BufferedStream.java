package kakao.dairy.java20211111;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;

public class BufferedStream {

	public static void main(String[] args) {
		PrintStream ps = null;
		try {
			ps = new PrintStream("./���۽�Ʈ��.txt");
			String str = "���۸� �̿��� ����Ʈ ��Ʈ��";
			ps.println(str);
		}catch(Exception e) {
			System.out.println("������ ��θ� Ȯ���ϼ���!!!");
		}finally {
			ps.close();
		}
		
		
		//���Ͽ��� ����Ʈ ������ ���۸� ����ؼ� �б� - ���� ��θ� ���
		BufferedInputStream bis = null;
		try {
			FileInputStream fis = new FileInputStream("E:\\2021soeun\\repository\\javapractice\\kakao.dairy.java20211111\\���۽�Ʈ��.txt");
			bis = new BufferedInputStream(fis);
			byte [] b = new byte[fis.available()];
			int len = bis.read(b);
			String result = new String(b,0,len);
			
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("������ ��θ� Ȯ���ϼ���!!!");
		}finally {
			
		}
	}

}
