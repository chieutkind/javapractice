package kakao.dairy.java20211102;

import java.util.Arrays;

public class Student {
	//번호를 저장할 속성
	private int num;
	//이름을 저장할 속성
	private String name;
	//점수 3개를 저장할 속성
	private int [] scores;
	
	//매개변수가 없는 생성자 - 리턴이 없음
	public Student() {
		num = 1;
		name = "noname";
		scores = new int[3];
	}
	
	//매개변수가 있는 생성자
	//외부에서 주입받아서 초기화 시키기 위한 생성자
	//매개변수가 없는 생성자가 있어서 생성자가 2개이므로 Overloading
	public Student(int n, String irum, int [] ar) {
		num=1;
		name=irum;
		scores=ar;
	}
	
	
	//접근자 메소드
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
	
	//toString. 인스턴스를 문자열로 변환해주는 메소드
	//디버깅을 편리하게 하기 위한 메소드
	//출력하는 메소드에 인스턴스 이름을 대입하면 자동으로 호출됨
	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", scores=" + Arrays.toString(scores) + "]";
	}
	
	
}
