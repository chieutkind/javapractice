package kakao.dairy.java20211112;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("전송할 메시지:");
			String msg = sc.nextLine();
			
			InetAddress address = InetAddress.getByName("192.168.10.32");
			socket = new Socket(address, 9000);
			
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println(msg);
			pw.flush();
			pw.close();
			
			sc.close();
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			try {
				socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}	

}
