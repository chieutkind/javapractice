package kakao.dairy.java20211110;

public class ThreadTerminate {
	public static void main(String[] args) {
		Thread th = new Thread() {
			public void run() {
				for(int i=0; i<10; i=i+1) {
					try {
						Thread.sleep(1000);
					} 
					//InterruptedException�� �߻����� ��
					//return�� ���ָ� �ܺο��� interrupt()�� ȣ���ؼ�
					//�����带 ������ ������ �� ����
					catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("������ ������ ����");
						return;
					}
					System.out.println(i);
				}
			}
		};
		
		th.start();
		
		//������ ���� ����
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//th���� InterruptedException�� �߻���Ŵ.
		th.interrupt();
	}
}
