package membermanagement;

public class MemberServiceImpl implements MemberService{

	@Override
	public boolean memberregister(Member member) {
		System.out.println("ȸ������ ��������");
		return false;
	}

	@Override
	public boolean memberout(String password) {
		System.out.println("ȸ��Ż��");
		return false;
	}

	@Override
	public Member memberinfo(String id, String password) {
		System.out.println("ȸ������ ��������");
		return null;
	}

	@Override
	public boolean memberupdate(Member member) {
		System.out.println("ȸ������ ����");
		return false;
	}

	@Override
	public boolean memberlogin(String id, String password) {
		System.out.println("�α���");
		return false;
	}

	@Override
	public void memberlogout() {
		System.out.println("�α׾ƿ�");
		
	}

}
