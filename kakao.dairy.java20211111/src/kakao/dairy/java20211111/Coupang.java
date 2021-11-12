package kakao.dairy.java20211111;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Coupang {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br=new BufferedReader(new InputStreamReader(new FileInputStream("./log.txt")));
			
			String data = "";
			StringBuilder sb = new StringBuilder();
			int cnt = 0;
			
			
			Set<String> ipSet = new HashSet<>();
			int trafficSum = 0;
			
			while(true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				sb.append(line);
				sb.append("\n");
				
				cnt = cnt + 1;
				
				String[]ar=line.split(" ");
				//System.out.println(ar[0]+":"+ar[9]);
				
				ipSet.add(ar[0]);
				
				if(ar[9].equals("-") || ar[9].equals("\"-\"")) {
					ar[9]="0";
				}
				trafficSum = trafficSum + Integer.parseInt(ar[9]);

			}
			
			data = sb.toString();
			System.out.println(data);
			System.out.println(ipSet.size());
			System.out.println(cnt);
			
		}catch (Exception e) {
			System.out.println("파일의 경로를 확인");
		}finally {
			try{
				br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
