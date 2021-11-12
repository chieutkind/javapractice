package kakao.dairy.java20211111;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CharacterStream {

	public static void main(String[] args) {
		//문자 단위로 기록 - 버퍼 사용
		PrintWriter ps = null;
		try {
			ps = new PrintWriter("./character.txt");
			String msg = "안녕하세요\n반갑습니다\n문자스트림입니다.";
			ps.write(msg);
			ps.flush();
		}catch(Exception e) {
			System.out.println("파일의 경로를 확인하세요!!!");
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
