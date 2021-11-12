package kakao.dairy.java20211108;

import java.util.Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		//배열을 생성
		String [] soccers = {"반바스텐", "굴리트", "리카르도"};
		//데이터 확인 - 디버깅
		//배열은 바로 toString을 호추함녀 요소의 클래스 이름과 해시코드가 리턴
		System.out.println(soccers);
		//Arrays 클래스의 toString을 이용하면 배열 각 요소의 toString 호출
		System.out.println(Arrays.toString(soccers));
		
		//soccers 배열을 복사해서 새로운 배열을 생성
		//java.util.Arrays 클래스의 copyOf라는 메서드를 이용할 수 있음
		
		String [] soccerscopy = Arrays.copyOf(soccers, soccers.length);
		System.out.println(Arrays.toString(soccerscopy));
		
		
		soccerscopy[2] = "응애";
		System.out.println(Arrays.toString(soccerscopy));
		System.out.println(Arrays.toString(soccers));

		//soccers의 데이터 정렬
		Arrays.sort(soccers);
		System.out.println(Arrays.toString(soccers));
	}

}


