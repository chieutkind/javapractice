package membermanagement;

import java.util.Scanner;

public class MemberController {

	public static void main(String[] args) {
		//�ַܼκ��� �Է¹޴� ��ü �����
		Scanner sc = new Scanner(System.in);

		//1���� ������ ȸ������
		//2���� ������ ȸ��Ż��
		//3���� ������ ������ȸ
		//4���� ������ ��������
		//5���� ������ �α���
		//6���� ������ �α׾ƿ�
		//7���� ������ ����
		//�������� �߸��Է��ߴٰ� �޽����� ���
		
		//final�� ������ ���� �������� ���Ϻ��.
		//�̸��� ���� ���� ��� �빮�ڷ� �ۼ�
		final String REGISTER = "1";
		final String OUT = "2";
		final String INFO = "3";
		final String UPDATE = "4";
		final String LOGIN = "5";
		final String LOGOUT = "6";
		final String EXIT = "7";
		

		//�۾��� ���� �ν��Ͻ� ����
		//MemberServiceImpl�� MemberService�� implements �����Ƿ�
		//�Ʒ�ó�� �ۼ��ص� ��
		MemberService memberService = new MemberServiceImpl();

		//���ѹݺ�
		while(true) {
			System.out.print("�޴� �Է�:");
			//Ű����κ��� ���ڿ� �Է¹ޱ�
			String menu = sc.nextLine();
			//�б�
			switch(menu) {
			case REGISTER:
				memberService.memberregister(null);
				break;
			case OUT:
				memberService.memberout(null);
				break;
			case INFO:
				memberService.memberinfo(null, null);
				break;
			case UPDATE:
				memberService.memberupdate(null);
				break;
			case LOGIN:
				memberService.memberlogin(null, null);
				break;
			case LOGOUT:
				memberService.memberlogout();
				break;
			case EXIT:
				System.out.println("����");
				break;
			default:
				System.out.println("�߸��� �޴� ����");
				break;
			}
			if(menu.equals("7")) {
				break;
			}
		}

		//��ĳ�� �ݱ�
		sc.close();

	}

}
