package kakao.dairy.java20211102;

public class ThisClass {
	private int num; //�⺻���� 0
	
	public void method() {
		int num = 100;
		//num�� 2���� �����̼� ���� num�� ã��
		System.out.println(num); //100
		System.out.println(this.num); 
		//this.�� ���̸� �޼ҵ� ���ο�����	ã�� �ʰ� �޼ҵ� �ܺο������� ã��.
	}
	
	static {
		System.out.println("�� ó�� �� ���� �ҷ����� �ڵ�");
	}
	
	{
		System.out.println("new�� ȣ���� �� ���� �ҷ����� �ڵ�");
	}

}
