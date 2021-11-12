package kakao.dairy.java20211109;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoCreate {

	public static void main(String[] args) {
		//랜덤한 1~45까지의 숫자 6개를 저장해서 순서대로 출력
		//6개의 중복되지 않은 데이터를 저장하기에 가장 알맞은 자료구조를 생성
		//배열, List, Set, Map중에 선택
		
		//배열이나 List는 데이터의 중복을 허용하기 때문에 중복되지 않은 데이터를 저장하려면 중복 검사를 직접 수행해서 저장 여부를 결정해야 함
		
		//Set은 데이터의 중복을 허용하지 않음.
		//HashSet(무작위로 저장됨), LinkedHashSet(순서대로 저장됨), TreeSet(크기를 기억)
		
		Set<Integer>lotto=new TreeSet<>();
		Random r = new Random(42);
		while(lotto.size()<6) {
			lotto.add(r.nextInt(45)+1);
		}
		for(Integer su:lotto) {
			System.out.println(su);
		}
	}

}
