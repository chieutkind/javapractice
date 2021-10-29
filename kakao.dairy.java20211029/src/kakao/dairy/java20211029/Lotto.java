package kakao.dairy.java20211029;

public class Lotto {

	public static void main(String[] args) {
		//1~45까지 6개의 숫자를 중복없이 저장하고 작은것부터 큰 것 순으로 출력
		//6개의 숫자는 키보드로부터 입력을 받음.
		
		//데이터: 1~45 사이의 숫자 6개, 아직 숫자의 값은 결정되지 않음
		//1. 1부터 45까지의 숫자 6개를 저장할 수 있는 공간을 먼저 생성 - 배열로 생성
		int [] lotto = new int[6];
		
		//키보드로부터 입력받기
		java.util.Scanner sc = new java.util.Scanner(System.in);
		//입력받기
		//변수 = sc.next자료형();
		//정수는 Int, 실수는 Double, boolean은 Boolean, 문자열은 Line이라고 자료형을 설정하면 됨.

		//배열의 크기만큼 정수를 입력받아서 배열에 저장
		//입력받은 내용을 임시변수에 저장한 후 배열로 옮기는 것이 좋습니다.
		int len = lotto.length;
		
		//인덱스를 이용해서 배열의 모든 데이터를 접근
		for(int i=0; i<len; i=i+1) {
			//정수를 입력받아서 input에 저장
			System.out.print("1~45의 숫자 입력: ");
			int input = sc.nextInt();
			
			//input에 입력된 내용을 배열에 순서대로 저장
			lotto[i] = input;
		}
		
		
		//사용이 종료되면 sc.close();
		sc.close();
		
		
		//lotto 배열에 저장된 데이터를 한 줄로 전부 출력
		for(int num : lotto ) {
			System.out.print(num+"\t");
		}
		System.out.println("");
	}

}
