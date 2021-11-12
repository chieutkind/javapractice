package kakao.dairy.java20211109;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyMain {

	public static void main(String[] args) {
		//속성과 값을 문자열로 저장하는 인스턴스를 생성
		Properties prop = new Properties();
		
		//값을 저장
		prop.setProperty("name", "adam");
		prop.setProperty("age", "44");

		//값 읽기
		System.out.println(prop.getProperty("name"));
		//자바에서는 없는 속성을 읽으면 null
		//속성과 값을 저장하는 자료구조에서는 없는 속성의 값을 대입해봐야 함
		//null이 리턴되는지 아니면 예외가 발생하는지 확인해봐야 함
		System.out.println(prop.getProperty("job"));
		
		//파일에 저장
		try {
			//출력할 파일스트림을 생성
			FileOutputStream fos = new FileOutputStream("./data.properties");
			prop.store(fos, "주석");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			//출력할 파일스트림을 생성
			FileOutputStream fos = new FileOutputStream("./data.txt");
			prop.store(fos, "주석");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			//출력할 파일스트림을 생성
			FileOutputStream fos = new FileOutputStream("./data.xml");
			prop.store(fos, "주석");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
