package kakao.dairy.java20211101;

//Ŭ������ �ν��Ͻ� �����
public class Main1 {

	public static void main(String[] args) {
		//�ν��Ͻ� ����
		Students student1 = new Students();
		System.out.println(student1);
		
		//���ο� �ν��Ͻ� ����
		Students student2 = new Students();
		System.out.println(student2);
		
		//���� �ν��Ͻ��� �ٸ� �̸����� �����  �� �ֵ��� �ϱ�
		//new�� ȣ���ؾ� ���ο� �ν��Ͻ��� ��������ϴ�.	
		Students student3 = student2;
		System.out.println(student3);

		//static�� ���� �Ͱ� �׷��� ���� ����� ����
		//static�� ���� ������ �ν��Ͻ��� ��� ����
		//static�� ���� ���� ��� ������ �ν��Ͻ��� ������ �޸� �Ҵ��� �޾Ƽ� ���
		student1.num=1;
		student2.num=2;
		System.out.println(student1.num);
		System.out.println(student2.num);
		//�Ʒ� ������ ����. static�� ������ Ŭ�����δ� ���� ����.
		//System.out.println(Students.num);
		
		//Static�� Java������ Ŭ���� �̸��� �ν��Ͻ� �̸����� ���� ����
		//Static�� �ϳ��� ���� ��� �ν��Ͻ��� �����մϴ�.
		//Static ������ ������ �����Դϴ�.
		//������� �� ��ſ� ����̶�� �ϱ⵵ �մϴ�.
		Students.school = "����ܰ�";
		student1.school = "�������б�";
		System.out.println(student1.school);
		System.out.println(student2.school);
		System.out.println(Students.school);
		
		//private�� ������ �� ����
		//student1.name = "�ڹ���";
		
	}

}
