package kakao.dairy.java20211101;

public class Main4 {

	public static void main(String[] args) {
		//MethodClass�� �ν��Ͻ��� ����
		MethodClass obj = new MethodClass();
		//�޼ҵ带 ȣ��
		obj.method();
		obj.method();
		
		//static �� ���� �޼ҵ�� �ݵ�� �ν��Ͻ��� �����ؼ� ȣ���ؾ� �մϴ�.
		//MethodClass.method();

		//static �޼ҵ� ȣ��
		MethodClass.noArgDisp();
		
		//�Ű������� ���� 1���� static �޼ҵ� ȣ��
		MethodClass.ArgDisp(5);
	
		//�Ű������� 2���� �޼ҵ� ȣ��
		MethodClass.twoArgDisp("�� ���� �ű��ϱ�", 3);
		
		//static�� ���� �޼���� �ν��Ͻ��� �̿��ؼ� ȣ���ؾߵ�
		MethodClass ins = new MethodClass();
		//return�� ���� �޼���� ȣ���ϰ� ��
		ins.noReturnAdd(100, 300);
		
		//return�� �ִ� ���� ����� �ٸ� ������ �����ؼ� ����ϴ� ���� �Ϲ���
		int result = ins.returnAdd(100,300);
		//����� ���
		System.out.println(result);
		//���� ����� ������ �ٽ� ���ϱ�
		result = ins.returnAdd(result, 300);
		System.out.println(result);
	}

}
