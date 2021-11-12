package kakao.dairy.java20211110;

public class ThreadProcessDifference {

	public static void main(String[] args) {
		//1�ʸ��� Hello Process�� 10�� ����ϴ� ����
		for(int i = 0;i<10;i=i+1) {
			try {
				Thread.sleep(1000);
				System.out.println("Hello Process");
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		} //for ����
		
		//10�� �ݺ�
		//1�� ��� - Thread.sleep �̿�
		
		//1�ʸ��� Hello Thread�� 10�� ����ϴ� ����
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
		
		//�� 2���� ���� process ���·� �����.
		
		//�����带 �����ؼ� ���� - anonymous Ŭ����
		
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
