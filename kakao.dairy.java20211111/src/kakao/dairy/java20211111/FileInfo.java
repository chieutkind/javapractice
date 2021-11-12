package kakao.dairy.java20211111;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		File f = new File("E:\\2021soeun\\doodie.txt");
		if(f.exists()) {
			System.out.println("파일이 존재합니다.");
			long size = f.length();
			System.out.println(size+" bytes");
			
			f=new File("./");
			System.out.println(f.getAbsolutePath());
			
			f=new File("./doodie.txt");
			System.out.println(f.exists());
		}else {
			System.out.println("파일이 존재하지 않습니다.");
		}

	}

}
