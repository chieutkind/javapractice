package kakao.dairy.java20211112;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTMLDownload {

	public static void main(String[] args) {
		try{
			URL url = new URL("https://sports.news.naver.com/news?oid=382&aid=0000944659");
			
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
			con.setConnectTimeout(30000);
			con.setUseCaches(false);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String html = "";
			StringBuilder sb = new StringBuilder();
			while(true) {
				String line = br.readLine();
				if(line ==null) {
					break;
				}
				sb.append(line);
				sb.append("\n");
			}
			html = sb.toString();
			System.out.println(html);
		}catch(Exception e) {
			
		}finally {
			
		}

	}

}
