package kakao.dairy.java20211101;

public class Main5 {

	public static void main(String[] args) {
		int n1=20;
		int n2=30;
		//n1�� n2�� �⺻�� �����Ͷ� �޼��带 ȣ���ص� ����� ������� ����.
		ParameterType.valueSwap(n1, n2);
		System.out.println("n1:"+n1);
		System.out.println("n2:"+n2);
		
		//�迭 - �⺻���� �ƴ�
		int [] xr = {100, 200, 300};
		//�⺻���� �ƴ� �����͸� �޼��忡 �����ϸ� ���� �����Ͱ� ����� ���� ����.
		ParameterType.refSwap(xr);
		System.out.println("xr[0]:"+xr[0]);
		System.out.println("xr[1]:"+xr[1]);


	}

}
