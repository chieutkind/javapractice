package kakao.dairy.java20211108;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int [] ar = {20,30,50,10,70,90,80};
		//정ㄹ려을 하지 않은 상태에서의 이분 검색
		System.out.println(Arrays.binarySearch(ar, 30));
		//정렬은 한 후 검색
		Arrays.sort(ar);
		//ar= {10,20,30,50,70,80,90};
		System.out.println(Arrays.binarySearch(ar, 30));
	}

}
