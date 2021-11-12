package membermanagement;

public class Member {
	//필요한 속성을 변수로 선언
	private String memberid;
	private String membername;
	private String memberpassword;
	private String membernickname;
	private int memberage;
	private String memberphone;
	
	
	//접근자 메서드
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getMemberpassword() {
		return memberpassword;
	}
	public void setMemberpassword(String memberpassword) {
		this.memberpassword = memberpassword;
	}
	public String getMembernickname() {
		return membernickname;
	}
	public void setMembernickname(String membernickname) {
		this.membernickname = membernickname;
	}
	public int getMemberage() {
		return memberage;
	}
	public void setMemberage(int memberage) {
		this.memberage = memberage;
	}
	public String getMemberphone() {
		return memberphone;
	}
	public void setMemberphone(String memberphone) {
		this.memberphone = memberphone;
	}
	@Override
	public String toString() {
		return "Member [memberid=" + memberid + ", membername=" + membername + ", memberpassword=" + memberpassword
				+ ", membernickname=" + membernickname + ", memberage=" + memberage + ", memberphone=" + memberphone
				+ "]";
	}
	
	
}
