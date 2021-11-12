package kakao.dairy.java20211112;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {

	public static void main(String[] args) {

		try {
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost);
			
			InetAddress[]naver=InetAddress.getAllByName("www.naver.com");
			for(InetAddress n: naver) {
				System.out.println("naver:"+n.toString());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
