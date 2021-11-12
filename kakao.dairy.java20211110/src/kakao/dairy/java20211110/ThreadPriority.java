package kakao.dairy.java20211110;

public class ThreadPriority {

	public static void main(String[] args) {
		Thread th1=new Thread() {
			public void run() {
				for (int i=0; i<10; i=i+1) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("������1");
				}
			}
		};
		th1.start();
		
		Thread th2=new Thread() {
			public void run() {
				for (int i=0; i<10; i=i+1) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("������2");
				}
			}
		};
		th2.setPriority(Thread.MAX_PRIORITY);
		th2.start();

	}

}
