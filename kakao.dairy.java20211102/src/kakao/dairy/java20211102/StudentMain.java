package kakao.dairy.java20211102;

public class StudentMain {

	public static void main(String[] args) {
		//��������(�޼��� �ȿ��� ���� ����)�� �ڵ����� �ʱ�ȭ���� ����.
		//int a;
		//System.out.println(a); ����.
		
		//�ν��Ͻ� ����
		Student student1 = new Student();
		//��� ������ �ڵ����� �ʱ�ȭ��
		//���ڴ� 0, boolean�� false, �� �ܴ̿� null�� �ʱ�ȭ.
		System.out.println(student1.getNum());
		System.out.println(student1.getName());
		System.out.println(student1.getScores());

		//setter�� �̿��ؼ� �����͸� ����(Dependency Injection)
		//student1.setName("john");
		//int [] ar = new int[3];
		//student1.setScores(ar);
		
		
		System.out.println(student1.getName().toUpperCase());
		System.out.println(student1.getScores()[0]);

		//�Ű������� 3���� �����ڸ� ȣ��
		Student student2 = new Student(2, "rusia", new int [3]);
		System.out.println(student2.getName().toUpperCase());
		System.out.println(student2.getScores()[0]);
		
	}

}
