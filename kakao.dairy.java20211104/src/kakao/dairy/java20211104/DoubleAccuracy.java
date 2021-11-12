package kakao.dairy.java20211104;

import java.math.BigDecimal;

public class DoubleAccuracy {
	public static void main(String[] args) {
		double d1 = 1.60000000000000000000;
		double d2 = 0.10000000000000000000;
		//결과 - 1.7000000000000002
		//이런 결과가 나온 이유는 소수의 정리도 문제 때문
		System.out.println(d1+d2);
		
		//숫자로 저장하지 않고 문자열로 가지고 있다가 계산을 할 때 숫자로 변경해서
		//계산하기 때무넹 정밀도와 상관없이 정확한 계산을 함 -> 대신 속도가 느림
		BigDecimal bd1 = new BigDecimal("1.60000000000000000000");
		BigDecimal bd2 = new BigDecimal("0.10000000000000000000");
		
		System.out.println(bd1.add(bd2));

	}
}
