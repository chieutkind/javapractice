package kakao.dairy.java20211111;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;

public class BufferedStream {

	public static void main(String[] args) {
		PrintStream ps = null;
		try {
			ps = new PrintStream("./버퍼스트림.txt");
			String str = "버퍼를 이용한 바이트 스트림";
			ps.println(str);
		}catch(Exception e) {
			System.out.println("파일의 경로를 확인하세요!!!");
		}finally {
			ps.close();
		}
		
		
		//파일에서 바이트 단위로 버퍼를 사용해서 읽기 - 절대 경로를 사용
		BufferedInputStream bis = null;
		try {
			FileInputStream fis = new FileInputStream("E:\\2021soeun\\repository\\javapractice\\kakao.dairy.java20211111\\버퍼스트림.txt");
			bis = new BufferedInputStream(fis);
			byte [] b = new byte[fis.available()];
			int len = bis.read(b);
			String result = new String(b,0,len);
			
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("파일의 경로를 확인하세요!!!");
		}finally {
			
		}
	}

}
