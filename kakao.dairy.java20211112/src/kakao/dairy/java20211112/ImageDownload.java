package kakao.dairy.java20211112;

import java.io.BufferedInputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageDownload {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://imgnews.pstatic.net/image/382/2021/11/12/0000944659_001_20211112153201674.jpg?type=w647");
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setConnectTimeout(30000);
			con.setUseCaches(false);
			
			BufferedInputStream bis = 
					new BufferedInputStream(con.getInputStream());
			PrintStream ps = new PrintStream("./test.jpg");
			
			while(true) {
				byte[]b=new byte[512];
				int len = bis.read(b);
				if(len<=0) {
					break;
				}
				ps.write(b,0,len);
			}
			ps.flush();
			ps.close();
			bis.close();
			con.disconnect();
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
