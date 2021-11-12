package kakao.dairy.java20211104;

import java.util.Random;

public class Practice {

	public static void main(String[] args) {


		double d = java.lang.Math.random();
		System.out.println("d:" + d);

		Random r = new Random();
		int s = r.nextInt();
		System.out.println("s:"+s);

		try {
			System.out.println("start sleep");

			java.lang.Thread.sleep(3000);
		} catch(Exception e) {
			System.out.println("예외 발생");
		}
		
		Runtime runtime = new Runtime();
	}

}
