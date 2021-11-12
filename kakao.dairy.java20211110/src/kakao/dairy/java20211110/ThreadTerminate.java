package kakao.dairy.java20211110;

public class ThreadTerminate {
	public static void main(String[] args) {
		Thread th = new Thread() {
			public void run() {
				for(int i=0; i<10; i=i+1) {
					try {
						Thread.sleep(1000);
					} 
					//InterruptedException이 발생했을 때
					//return을 해주면 외부에서 interrupt()를 호출해서
					//스레드를 강제로 종료할 수 있음
					catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("강제로 스레드 종료");
						return;
					}
					System.out.println(i);
				}
			}
		};
		
		th.start();
		
		//스레드 겅제 종료
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//th에게 InterruptedException을 발생시킴.
		th.interrupt();
	}
}
