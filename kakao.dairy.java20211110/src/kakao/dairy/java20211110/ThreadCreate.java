package kakao.dairy.java20211110;

//Thread�� ��ӹ޴� Ŭ����
class ThreadEx extends Thread{
	public void run() {
		//Thread.sleep�� ����ϴ� ������ delay�� ����� ���ؼ�
		for(int i=0;i<10;i=i+1) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("������1");
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
			System.out.println("������2");
			i=i+1;
		}
	}
}

public class ThreadCreate {

	public static void main(String[] args) {
		//Thread�� ��ӹ��� THreadEx Ŭ������ ������ �����鸣 �����ϰ� ����
		ThreadEx th1 = new ThreadEx();
		th1.start();
		//new ThreadEx().start()�� �ص� �˴ϴ�.

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
				System.out.println("������3");
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
			System.out.println("������4");
		}
	};

}