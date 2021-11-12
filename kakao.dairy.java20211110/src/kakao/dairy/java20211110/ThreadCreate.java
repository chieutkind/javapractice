package kakao.dairy.java20211110;

//Thread룰 상속받는 클래스
class ThreadEx extends Thread{
	public void run() {
		//Thread.sleep를 사용하는 이유는 delay를 만들기 위해서
		for(int i=0;i<10;i=i+1) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("스레드1");
		}
	}
}


class RunnableImpl implements Runnable {
	@Override
	public void run() {
		int i=0;
		while(i<10) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("스레드2");
			i=i+1;
		}
	}
}

public class ThreadCreate {

	public static void main(String[] args) {
		//Thread를 상속받은 THreadEx 클래스를 가지고 스레들르 생성하고 시작
		ThreadEx th1 = new ThreadEx();
		th1.start();
		//new ThreadEx().start()로 해도 됩니다.

		RunnableImpl runnable = new RunnableImpl();
		Thread th2 = new Thread(runnable);
		th2.start();

		Thread th3=new Thread() {
			public void run() {
				for(int i=0; i<10; i=i+1);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("스레드3");
			}

		};
		th3.start();
	}

	Runnable r = new Runnable() {
		@Override
		public void run() {
			for(int i=0; i<10; i=i+1);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("스레드4");
		}
	};

}