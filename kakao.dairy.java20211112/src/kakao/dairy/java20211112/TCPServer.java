package kakao.dairy.java20211112;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {


		ServerSocket ss = null;
		Socket socket = null;
		try {
			ss = new ServerSocket(9000);
			System.out.println("서버 대기 중....");
			while(true) {
				socket = ss.accept();
				System.out.println("클라이언트 정보:"+ socket.toString());
				
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String msg =br.readLine();
				System.out.println("보내온 메시지:"+msg);
				
				br.close();
				socket.close();
			}
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			
		}

	}

}
