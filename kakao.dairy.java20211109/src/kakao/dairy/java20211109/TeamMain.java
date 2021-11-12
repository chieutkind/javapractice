package kakao.dairy.java20211109;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import kakao.dairy.java20211109.DTO;

public class TeamMain {

	public static void main(String[] args) {
		List<DTO> list= new ArrayList<>();

		DTO team = new DTO();
		team.setTeam("FC����");
		team.setWin(5);
		team.setTie(1);
		team.setLose(2);
		team.getPlayers().add("�ϳ�");
		team.getPlayers().add("�θ�");
		//�������� ������ �߰�
		list.add(team);

		team = new DTO();
		team.setTeam("FCǪ��");
		team.setWin(2);
		team.setTie(3);
		team.setLose(3);
		team.getPlayers().add("����");
		team.getPlayers().add("��Ƽ");
		//�������� ������ �߰�
		list.add(team);

		team = new DTO();
		team.setTeam("FC����");
		team.setWin(1);
		team.setTie(7);
		team.setLose(1);
		team.getPlayers().add("�پƽ�");
		team.getPlayers().add("����");
		//�������� ������ �߰�
		list.add(team);

		team = new DTO();
		team.setTeam("FC���̳���");
		team.setWin(7);
		team.setTie(1);
		team.setLose(0);
		team.getPlayers().add("����");
		team.getPlayers().add("����");
		//�������� ������ �߰�
		list.add(team);


		//������ ��ü �о����
		//���� ���� ���
		for(DTO t:list) {
			System.out.print(t.getTeam()+"\t");
			System.out.print(t.getScore()+"\t");
			for(String player:t.getPlayers()) {
				System.out.print(player+" ");
			}
			System.out.println();

		}

		System.out.println("=================");

		//������ 1�� ��������
		System.out.println(list.get(2));

		System.out.println("=================");


		//������ �Ϻκ� ����ϱ�
		int i = 0;
		for(i=0; i<2; i=i+1) {
			System.out.println(list.get(i));
		}

		System.out.println("=================");

		System.out.println("������ �����ϱ�");
		//�迭�� Arrays.sort 
		//List�� sort �޼��带 �̿��ؼ� ����
		//Comparator �������̽��� �����ؼ� compare �޼��带 �������ؾ� ��
		//�� ��쿡�� ������ ������ ������ ������ ������ ������ ��.
		//��ĳ�ʸ� �̿��ؼ� ���ڿ��� �Է¹޾Ƽ� 1���� ������ ���̸� ��������
		//2�� ������ ������ ������������ �����ؼ� �� �̸��� ���

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.�̸� �������� 2. ���� �������� 3. ����");
			String menu = sc.nextLine();
			if(menu.equals("1")) {
				list.sort(new Comparator<DTO>() {
					@Override
					public int compare(DTO o1, DTO o2) {
						return o1.getTeam().compareTo(o2.getTeam());

					}
				});
			}else if(menu.equals("2")) {
				list.sort(new Comparator<DTO>() {
					@Override
					public int compare(DTO o1, DTO o2) {
						return o2.getScore()-o1.getScore();
						
					}
				});	
			}else if(menu.equals("3")) {
				System.out.println("����");
				break;

			}else {
				System.out.println("�߸��� �޴� ����");
			}
			//��ü �����͸� ���
			for(DTO t:list) {
				System.out.println(t.getTeam());
			}
		}
		//���� �ݺ��� ����
		
	}

}
