package kakao.dairy.java20211108;

import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		TreeSet<String> songs = new TreeSet<>();
		songs.add("어디쯤 가고 있을까");
		songs.add("어디쯤 가고 있을까");
		songs.add("찬 바람이 불면");
		songs.add("가을이 남기고 간 사랑");
		for(String song : songs) {
			System.out.println(song);
		}
	}

}
