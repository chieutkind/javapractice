package kakao.dairy.java20211111;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileProcessing_1 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos=new FileOutputStream("./파일이름.txt");
			String str = "기록할 내용을 생성";
			fos.write(str.getBytes());
		}catch(Exception e) {
			
		}finally {
			try {
				fos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
		FileInputStream fis = null;
		try {
			fis=new FileInputStream("./파일이름.txt");
			while(true) {
				byte [] b = new byte[12];
				int len = fis.read(b);
				if (len<=0) {
					break;
			}
				String str = new String(b, 0, len);
				System.out.println(str);
			}
		}catch(Exception e) {
			System.out.println("파일의 경로를 확인하세요!!!");
		}finally {
			try {
				fis.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
}
