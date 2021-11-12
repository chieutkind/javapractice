package kakao.dairy.java20211109;

import java.util.HashMap;
import java.util.Map;

public class Matrix {

	public static void main(String[] args) {
		//여배선수 명단 팀별로 저장
		//여러개의  팀이 존재하고 각 팀에는 여러 명의 선수가 존재
		
		//각 팀 선수 명단
		String [] hipass = {"배유나", "문정원", "박정아"};
		String [] kixx = {"강소휘", "안혜진","한수지"};
		String [] kgc = {"엄혜선", "이소영","한송이"};


		//2개의 배열을 하나의 배열로 생성 - 동일한 성격을 갖는 데이터는 하나로 관리
		String [][] volleyballs = {hipass, kixx, kgc};
		
		//데이터 출력 - 팀 선수 명단을 줄단위로 출력
		//배열은 인덱스로 데이터를 찾아감
		for(int i=0; i<volleyballs.length; i=i+1) {
			String [] players = volleyballs[i];
			
			if(i==0) {
				System.out.print("도로공사:"+"\t");
			}else if(i==1) {
				System.out.print("GS:"+"\t");
			}else{
				System.out.print("인삼공사:"+"\t");
			}
			
			for(String player:players) {
				System.out.print(player+"\t");
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		//변할 가능성이 있는 데이터를 2차원 배열로 만드는 것은 바람직하지 못함
		//1차원 배열과 배열의 특징을 나타내는 속성을 Map으로 묶고
		//이 Map을 배열로 묶어주는 것을 권장합니다.
		
		Map<String,Object>map1=new HashMap<>();
		//팀이름을 나타내는 속성
		map1.put("name", "도로공사");
		//실제 데이터를 나타내는 속성
		map1.put("data", hipass);
		
		Map<String,Object>map2=new HashMap<>();
		//팀이름을 나타내는 속성
		map2.put("name", "GS");
		//실제 데이터를 나타내는 속성
		map2.put("data", kixx);

		Map<String,Object>map3=new HashMap<>();
		//팀이름을 나타내는 속성
		map3.put("name", "인삼공사");
		//실제 데이터를 나타내는 속성
		map3.put("data", kgc);
		
		//일차원 배열을 Map에 저장한 후 다시 배열을 만들기
		//Map 안에 데이터의 특징을 저장할 수 있기 때문에 
		//배열의 데이터가 변경이 되더라도 출력 부분을 수정할 필요가 없음.
		Map[]maps= {map1,map2,map3};
		
		for(Map map:maps) {
			System.out.print(map.get("name")+"\t");
			//배열 꺼내기
			String [] ar = (String[])map.get("data");
			//배열을 순회하면서 출력
			for(String player:ar) {
				System.out.print(player+"\t");
			}
			System.out.println();
		}

	}

}
