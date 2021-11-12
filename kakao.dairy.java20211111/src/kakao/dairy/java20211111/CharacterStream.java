package kakao.dairy.java20211111;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CharacterStream {

	public static void main(String[] args) {
		//���� ������ ��� - ���� ���
		PrintWriter ps = null;
		try {
			ps = new PrintWriter("./character.txt");
			String msg = "�ȳ��ϼ���\n�ݰ����ϴ�\n���ڽ�Ʈ���Դϴ�.";
			ps.write(msg);
			ps.flush();
		}catch(Exception e) {
			System.out.println("������ ��θ� Ȯ���ϼ���!!!");
		}finally {
			ps.close();
		}
		
		BufferedReader br = null;
		try {
			br= new BufferedReader(
				 new InputStreamReader(
						new FileInputStream("./character.txt")));
			while (true) {
				String result = br.readLine();
				if(result==null) {
					break;
				}
				System.out.println(result);
			}
		}catch(Exception e){
			
		}finally {
			
		}
		
		
	}

}
