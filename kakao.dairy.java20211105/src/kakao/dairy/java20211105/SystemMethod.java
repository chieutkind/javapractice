package kakao.dairy.java20211105;

import java.io.IOException;
import java.lang.Runtime;

public class SystemMethod {

	public static void main(String[] args) {


		long start = System.nanoTime(); 
		for(long i=0;i<100000000;i++){}
		long end = System.nanoTime();
		System.out.println("i++ 걸린 시간:"+(end-start));
		start=System.nanoTime();
		for(long i=0;i<100000000;i=i+1) {}
		end=System.nanoTime();
		System.out.println("i=i+1 걸린 시간:"+(end-start));

		Runtime r = Runtime.getRuntime();
		try {
			r.exec("mspaint.exe");
		}catch(IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
