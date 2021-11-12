package kakao.dairy.java20211104;

public class Main {

	public static void main(String[] args) {
		//DTO �ν��Ͻ� 2�� ����
		DTO obj1 = new DTO();
		obj1.setNum(1);;
		obj1.setName("adam");
		
		DTO obj2 = new DTO();
		obj2.setNum(1);;
		obj2.setName("adam");
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		//���� new�� �̿��ؼ� �����ڸ� ȣ���߱� ������ ������ �޸� ������
		//�����ϰ� �־ false
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
		
		int x = 100;
		int y = x;
		//x�� ������ ���� �ƴϰ� x�� ���� �������� 100�� y�� ����Ű���� �� ��
		y = 200;//y ���� ����
		System.out.println("x:"+x);
		//x�� 100�� �������� ���̹��� ������ ����
		//call by value
		System.out.println("y:"+y);
		
		int [] ar = {100, 200, 300};
		int [] br = ar;
		//ar�� ����Ű�� �ִ� 100, 200, 300�� ��ǥ 
		br[0] = 123;
		
		System.out.println("ar[0]:"+ar[0]);
		System.out.println("br[0]:"+br[0]);
		
		DTO adam = new DTO();
		adam.setNum(1);
		adam.setName("adam");
		
		DTO hunt = adam; //������ ����
		//adam�� �͵� ���� ����Ǵ� ��ó�� ���Դϴ�.
		//adam�� hunt�� ������ �ν��Ͻ��Դϴ�.
		hunt.setNum(2);
		
		System.out.println(adam);
		System.out.println(hunt);
		
		//����
		DTO jessica = adam.clone();
		jessica.setNum(12);
		
		System.out.println(adam);
		System.out.println(jessica);

		
	}

}
