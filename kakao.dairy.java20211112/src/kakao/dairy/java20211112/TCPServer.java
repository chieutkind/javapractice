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
			System.out.println("���� ��� ��....");
			while(true) {
				socket = ss.accept();
				System.out.println("Ŭ���̾�Ʈ ����:"+ socket.toString());
				
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String msg =br.readLine();
				System.out.println("������ �޽���:"+msg);
				
				br.close();
				socket.close();
			}
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			
		}

	}

}
