package kakao.dairy.java20211108;

public class DTO {

	//�̸��� ����
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "DTO [name=" + name + ", age=" + age + "]";
	}

}
