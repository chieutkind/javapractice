package kakao.dairy.java20211029;

public class SelectionSort {

	public static void main(String[] args) {
		//1. 정수 5개를 저장하는 배열을 생성 - 초기값을 임의로 부여
		//이 부분을 키보드로부터 입력받는 코드로 변경

		int [] x = {0, 0, 0, 0, 0};
		//array keyboard input
		java.util.Scanner sc = new java.util.Scanner(System.in);
		for (int i=0; i<5; i=i+1) {
			System.out.print("정수 입력:");
			x[i] = sc.nextInt();
		}

		sc.close();

		//array print
		for (int num : x) {
			System.out.print(num+"\t");
		}
		System.out.println("");

		//선택정렬
		//첫번째 자리부터 마지막 -1까지 데이터를 출력
		//전체가 필요하지 않거나 인덱스가 필요할 때는 빠른 열거를 사용하면 안됨.
		int len=x.length;
		
		//첫번째 자리부터 마지막 -1까지
		for (int i=0; i<len-1; i=i+1) {
			//뒤에 있는 모든 것
			for(int j=i+1;j<len;j=j+1) {
				//자신의 데이터와 뒤에 있는 데이터를 비교해서 자신이 더 크면
				if(x[i]>x[j]){
					//데이터의 위치를 교환 - swap
					int temp=x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		for (int num : x) {
			System.out.print(num+"\t");
		}
		System.out.println("");
		
		
	}

}