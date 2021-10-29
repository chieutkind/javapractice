package kakao.dairy.java20211029;

public class DescriptiveStatistic {

	public static void main(String[] args) {
		// 샘플 데이터 생성
		int [] data = {95, 80, 70, 87, 93};
		
		//1. 데이터의 합계 구하기
		//합계를 저장할 변수를 생성하고 합계를 구하기 이전의 값으로 초기화
		//데이터를 순회하면서 데이터를 합계를 저장할 변수에 추가
		
		int data_sum = 0;
		for(int imsi : data) {
			data_sum=data_sum+imsi;
		}
		System.out.println("합계: "+data_sum);

		//2. 평균, 중앙값, 최빈값 - 데이터를 대표하는 값
		//평균을 계산할 때 주의할 점
		//나누는 수가 0인지 확인 - 정수를 0으로 나누면 에러
		//실수를 0을 나누면 Infinity나 NaN같은 값이 나옵니다.
		
		//정수/정수=정수라는 것을 기억
		//평균을 소수 첫째자리까지 구하기
		if(data.length==0) {
			System.out.println("데이터가 없음");
		}else {
			//데이터 중 1개를 실수로 변환해야만 실수로 결과를 만들 수 있음
			double mean = data_sum / (double)data.length;
			System.out.println("평균: "+mean);
		}
		
		//이후에 최대값과 최소값 구하는 것을 하고 나면 최대값과 최소값을
		//제외한 데이터의 평균을 구해보세요 - 절사 평균
		
		//최대값을 구할 때는 최대값을 저장할 변수를 만들어서
		//데이터의 가질 수 있는 범위 중 가장 작은 값이나
		//첫번째 데이터의 값으로 초기화를 합니다.
		
		//모든 데이터를 순회하면서 최대값보다 큰 데이터가 있으면 최대값을
		//그 값으로 변경합니다.
		
		//데이터는 0~100의 범위를 갖는다고 가정
		int max_data = 0;
		//모든 데이터 순회
		for(int imsi : data) {
			//데이터와 최대값을 비교해서 데이터가 더 크면 최대값을 변경
			if(max_data < imsi) {
				max_data = imsi;
			}
		}
		System.out.println("가장 큰 데이터: "+max_data);
		
		
		
		//최소값
		
		int min_data = 100;
		int min_idx = -1;
		int len = data.length;
		//모든 데이터 순회
		for(int i=0; i<len; i=i+1) {
			//데이터와 최대값을 비교해서 데이터가 더 크면 최대값을 변경
			if(min_data > data[i]) {
				min_data = data[i];
				min_idx=i;
			}
		}
		System.out.println("가장 작은 데이터: "+min_data);
		System.out.println("가장 작은 데이터의 위치:"+min_idx);
		
		//조건에 맞는 데이터의 개수 찾기
		//데이터 개수를 저장할 변수를 만들어서 개수를 세기 이전의 값으로
		//초기화 - 대부분 0으로 초기화
		
		//모든 데이터를 순회하면서 데이터가 조건에 맞는지 확인해서 조건에 맞으면
		//개수를 1 증가시켜주면 됩니다.
		
		//90이 넘는 데이터의 개수 찾기
		int cnt = 0;
		
		for(int temp : data) {
			if(temp>90) {
				cnt = cnt+1; //cnt++;
			}
		}
		System.out.println("90이 넘는 데이터 개수: "+cnt);
	}

}
