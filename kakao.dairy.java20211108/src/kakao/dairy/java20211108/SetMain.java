package kakao.dairy.java20211108;

import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		TreeSet<String> songs = new TreeSet<>();
		songs.add("����� ���� ������");
		songs.add("����� ���� ������");
		songs.add("�� �ٶ��� �Ҹ�");
		songs.add("������ ����� �� ���");
		for(String song : songs) {
			System.out.println(song);
		}
	}

}
