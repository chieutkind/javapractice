package kakao.dairy.java20211102;

import java.util.Arrays;

public class Student {
	//��ȣ�� ������ �Ӽ�
	private int num;
	//�̸��� ������ �Ӽ�
	private String name;
	//���� 3���� ������ �Ӽ�
	private int [] scores;
	
	//�Ű������� ���� ������ - ������ ����
	public Student() {
		num = 1;
		name = "noname";
		scores = new int[3];
	}
	
	//�Ű������� �ִ� ������
	//�ܺο��� ���Թ޾Ƽ� �ʱ�ȭ ��Ű�� ���� ������
	//�Ű������� ���� �����ڰ� �־ �����ڰ� 2���̹Ƿ� Overloading
	public Student(int n, String irum, int [] ar) {
		num=1;
		name=irum;
		scores=ar;
	}
	
	
	//������ �޼ҵ�
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	//toString. �ν��Ͻ��� ���ڿ��� ��ȯ���ִ� �޼ҵ�
	//������� ���ϰ� �ϱ� ���� �޼ҵ�
	//����ϴ� �޼ҵ忡 �ν��Ͻ� �̸��� �����ϸ� �ڵ����� ȣ���
	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", scores=" + Arrays.toString(scores) + "]";
	}
	
	
}
