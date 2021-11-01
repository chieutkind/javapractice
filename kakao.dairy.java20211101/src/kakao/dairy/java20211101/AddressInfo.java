package kakao.dairy.java20211101;

public class AddressInfo {
	//한 명의 사람 정보를 나타내기 위한 속성 - private로 생성
	private int id;
	private String name;
	private String phone;
	private String address;

	//접근자 메서드
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "AddressInfo [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}

	
	
	
}
