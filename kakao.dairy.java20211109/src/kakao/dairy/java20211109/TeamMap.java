package kakao.dairy.java20211109;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TeamMap {

	public static void main(String[] args) {
		//Map을 이용해서 하나의 행을 표현하면 DTO 클래스가 필요없음
		//여기서 주의할 점은 key를 문자열로 작성하기 때문에 key 이름을 정확하게 기억해야 함
		//get을 이용해서 가져온 후 사용할 때 강제 형 변환을 해주어야 함
		List<Map<String, Object>> list=
				new ArrayList<>();
		
		//1개의 데이터를 생성해서 추가하기
		Map<String, Object> map = new HashMap<>();
		map.put("team", "FC응가");
		map.put("score",16);
		list.add(map);
		
		map = new HashMap<>();
		map.put("team", "FC푸피");
		map.put("score",9);
		list.add(map);
		
		map = new HashMap<>();
		map.put("team", "FC위위");
		map.put("score",10);
		list.add(map);
		
		map = new HashMap<>();
		map.put("team", "FC네이네이");
		map.put("score",22);
		list.add(map);
		
		//전체 데이터 출력하기
		for(Map<String, Object>temp:list) {
			System.out.println(temp.get("team")+":"+temp.get("score"));
		}

		
		//일부분의 데이터 출력하기
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(true) {
			int size = i + 2;
			for(; i<size; i=i+1) {
				if(i==list.size()) {
					break;
				}
				System.out.println(list.get(i));
			}
			//무한 반복문 종료
			if(i==list.size()) {
				break;
			}
			//다음 데이터 입력받기
			System.out.println("다음 페이지 데이터는 ENTER를 누르면 보여집니다.");
			sc.nextLine();
		}
		//무한 반복문 종료
		
		System.out.println("===============");
		System.out.println("데이터 1개 가져오기");
		System.out.println(list.get(1));
		
		System.out.println("===============");
		System.out.println("데이터 정렬하기");
		
		//map 안에 있는 데이터를 오름차순 정렬
		list.sort(new Comparator<Map<String, Object>>(){
			
			@Override
			public int compare(Map<String, Object> o1, Map<String,Object>o2) {
				String front = (String)o1.get("team");
				String back = (String)o2.get("team");
				return front.compareTo(back);

				
			}
		});
		for(Map<String, Object>temp:list) {
			System.out.println(temp.get("team"));
		}
	}

}
