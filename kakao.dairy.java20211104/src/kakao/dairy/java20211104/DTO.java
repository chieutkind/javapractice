package kakao.dairy.java20211104;

public class DTO {
	private int num;
	private String name;

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

	@Override
	public String toString() {
		return "DTO [num=" + num + ", name=" + name + "]";
	}

	//�ν��Ͻ��� ������ ������ ���ϴ� �޼���
	public boolean equals(DTO other) {
		if(num == other.num && name.equals(other.name)) {
			return true;
		}
		return false;
	}
	
	public DTO clone() {
		DTO other = new DTO();
		
		//���� �ν��Ͻ��� ������ ���� ������ �ν��Ͻ��� ����
		other.num = num;
		other.name = new String(name);
		
		return other;
	}

}