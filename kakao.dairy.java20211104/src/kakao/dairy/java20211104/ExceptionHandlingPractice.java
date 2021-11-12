package kakao.dairy.java20211104;

public class ExceptionHandlingPractice {

	public static void main(String[] args) {
		try {
			//예외가 발생할만한 코드를 작성
			int x=10;
			int n=0;
			
			int result = x/n;
			System.out.println("result:" + result);
		}catch(ArithmeticException e) {
			//AritmeticException이 발생했을 때 처리할 내용
			System.out.println("산술예외:"+e.getLocalizedMessage());
		}finally {
			//무조건 수행할 내용
			System.out.println("무조건 수행할 내용");
			System.out.println("주로 외부 자원 연결 해제 코드를 작성");
		}
		

	}

}
