package polymorphism;

public class Main {
	public static void main(String[] args) {
		//�տ��� ���� �޼��� 3���� ���� ȣ��
		//star.attack()�̶�� ������ �ڵ�� ���� �ٸ� Ŭ������ �ִ� �޼��带 ȣ��
		//�̰��� �������Դϴ�.
		Starcraft star = new Protoss();
		star.attack();
		
		Starcraft star = new Terran();
		star.attack();
		
		Starcraft star = new Zerg();
		star.attack();
	}
}
