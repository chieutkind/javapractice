package kakao.dairy.java20211101;

public class Practice {
	//static �޼���
	public static void staticMethod() {
		System.out.println("static �޼���");
	}
	
	//member �޼���
	public void disp() {
		System.out.println("�Ű������� ���� ����Ÿ�Ե� ���� member �޼ҵ�");
	}
	
	//�Ű������� �ִ� �޼���
	public void sum(int n) {
		int tot = 0;
		for(int i=1; i<n+1; i=i+1) {
			tot = tot + i;
		}
		System.out.println("1���� n������ ��:" + tot);
	}
	
	//2���� 1000������ �Ҽ��� ����
	public int prime() {
		int cnt = 0;
		for(int i=2; i<=1000; i=i+1) {
			boolean flag = true;
			for(int j=2; j< i/2 + 1; j=j+1) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				cnt = cnt + 1;
			}
		}
		return cnt;
	}
}
