package membermanagement;

//ȸ�� ���� �۾��� ���� �������̽�
public interface MemberService {
	//ȸ�������� ���� ó��
	public boolean memberregister(Member member);
	//ȸ�� Ż�� ���� ó��
	public boolean memberout(String password);
	//ȸ������ ��ȸ�� ���� ó��
	public Member memberinfo(String id, String password);
	///ȸ�� ���� ������ ���� ó��
	public boolean memberupdate(Member member);
	//�α����� ���� ó��
	public boolean memberlogin(String id, String password);
	//�α׾ƿ��� ���� ó��
	public void memberlogout();
	
}
