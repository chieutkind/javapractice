package kakao.dairy.java20211110;

public class DaemonThread {
	
	public static void main(String[] args) {
		Thread th = new Thread() {
			public void run() {
				while(true){
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("자동저장");
				}
			}
		};
		
		th.start();
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
		
		th.setDaemon(true);
		th.start();

		
		Thread th1 = new Thread() {
			public void run() {
				try {
					Thread.sleep(20000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(getName() + "종료");
			}
		};
		th1.start();
	}

}
