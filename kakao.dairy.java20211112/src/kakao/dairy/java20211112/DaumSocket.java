package kakao.dairy.java20211112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class DaumSocket {

	public static void main(String[] args) {
		Socket socket = null;
		InetAddress address = null;
		
		PrintWriter out = null;
		BufferedReader in = null;
		
		try {
			address = InetAddress.getByName("www.daum.net");
			socket = new Socket(address, 80);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			
			out .println("GET http://www.daum.net");
			out.flush();
			
			while(true) {
				String line = in.readLine();
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			try {
				out.close();
				in.close();
				socket.close();
			} catch (IOException e) {}
		}

	}

}
