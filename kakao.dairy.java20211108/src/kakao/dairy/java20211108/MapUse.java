package kakao.dairy.java20211108;

import java.util.HashMap;
import java.util.Set;

public class MapUse {

	public static void main(String[] args) {
		//Key는 String으로 하고 Value는 Object로 하는 HashMap을 생성
		//Value를 Object로 하는 이유는 Object에는 모든 종류의 데이털르 대입할 수 있지만
		//대신에 Object로 된 데이터는 출력을 할 때를 제외하고는 강제 형 변환을 통해서
		//원래의 자료형응로 되돌려서 사용해야 함
		
		//1.HashMap 생성
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		//2.데이터 저장
		map.put("name", "adam");
		map.put("age", 50);
		map.put("age", 44); //age에 데이터를 저장했는데 다시 저장하면 수정
		
		//3.데이터 꺼내기
		String name = (String)map.get("name");
		int age = (Integer)map.get("age");
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		
		//4. 데이터 추가
		map.put("song", "세상엔 없는 사랑");
		String [] albums = {"제네시스", "엑소더스"};
		map.put("album", albums);
		
		//5. toString 메서드: 각 요소의 toString 메서드를 호출한 결과
		System.out.println(map);
		
		//6. 없는 key를 사용함녀 null 리턴
		System.out.println(map.get("hobby"));
		
		//7. 데이터 삭제
		//map.remove("album");
		map.put("album", null);
		//get으로 꺼내면 null이기 때문에 지운것으로 간주
		System.out.println(map);
		
		//8. 전체 데이터 순회
		Set<String> keys = map.keySet(); //모든 key를 가져옴
		for(String key : keys) {
			System.out.println(key+":"+map.get(key));
		}
	}

}
