package kakao.dairy.java20211110;

public class ThreadProcessDifference {

	public static void main(String[] args) {
		//1초마다 Hello Process를 10번 출력하는 문장
		for(int i = 0;i<10;i=i+1) {
			try {
				Thread.sleep(1000);
				System.out.println("Hello Process");
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		} //for 종료
		
		//10번 반복
		//1초 대기 - Thread.sleep 이용
		
		//1초마다 Hello Thread를 10번 출력하는 문장
		int i=0;
		while(i<10) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Hello Thread");
				i=i+1;
		}
		
		//앞 2개의 블럭은 process 형태로 실행됨.
		
		//스레드를 생성해서 시작 - anonymous 클래스
		
		new Thread() {
			public void run() {
				for(int i=0;i<10;i=i+1) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Thread1");
				}
			}
		}.start();
	
		
		
		new Thread() {
			public void run() {
				for(int i=0;i<10;i=i+1) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Thread2");
				}
			}
		}.start();

	}

}
