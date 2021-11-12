package kakao.dairy.java20211109;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import kakao.dairy.java20211109.DTO;

public class TeamMain {

	public static void main(String[] args) {
		List<DTO> list= new ArrayList<>();

		DTO team = new DTO();
		team.setTeam("FC응가");
		team.setWin(5);
		team.setTie(1);
		team.setLose(2);
		team.getPlayers().add("하나");
		team.getPlayers().add("두리");
		//마지막에 데이터 추가
		list.add(team);

		team = new DTO();
		team.setTeam("FC푸피");
		team.setWin(2);
		team.setTie(3);
		team.setLose(3);
		team.getPlayers().add("세리");
		team.getPlayers().add("네티");
		//마지막에 데이터 추가
		list.add(team);

		team = new DTO();
		team.setTeam("FC위위");
		team.setWin(1);
		team.setTie(7);
		team.setLose(1);
		team.getPlayers().add("다아시");
		team.getPlayers().add("여섯");
		//마지막에 데이터 추가
		list.add(team);

		team = new DTO();
		team.setTeam("FC네이네이");
		team.setWin(7);
		team.setTie(1);
		team.setLose(0);
		team.getPlayers().add("세븐");
		team.getPlayers().add("여덟");
		//마지막에 데이터 추가
		list.add(team);


		//데이터 전체 읽어오기
		//빠른 열거 사용
		for(DTO t:list) {
			System.out.print(t.getTeam()+"\t");
			System.out.print(t.getScore()+"\t");
			for(String player:t.getPlayers()) {
				System.out.print(player+" ");
			}
			System.out.println();

		}

		System.out.println("=================");

		//데이터 1개 가져오기
		System.out.println(list.get(2));

		System.out.println("=================");


		//데이터 일부분 출력하기
		int i = 0;
		for(i=0; i<2; i=i+1) {
			System.out.println(list.get(i));
		}

		System.out.println("=================");

		System.out.println("데이터 정렬하기");
		//배열은 Arrays.sort 
		//List는 sort 메서드를 이용해서 정렬
		//Comparator 인터페이스를 구현해서 compare 메서드를 재정의해야 함
		//이 경우에는 누구를 가지고 정렬할 것인지 결정을 내려야 함.
		//스캐너를 이용해서 문자열을 입력받아서 1번을 누르면 팀이름 오름차순
		//2를 누름녀 승점의 내림차순으로 정렬해서 팀 이름만 출력

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.이름 오름차순 2. 승점 내림차순 3. 종료");
			String menu = sc.nextLine();
			if(menu.equals("1")) {
				list.sort(new Comparator<DTO>() {
					@Override
					public int compare(DTO o1, DTO o2) {
						return o1.getTeam().compareTo(o2.getTeam());

					}
				});
			}else if(menu.equals("2")) {
				list.sort(new Comparator<DTO>() {
					@Override
					public int compare(DTO o1, DTO o2) {
						return o2.getScore()-o1.getScore();
						
					}
				});	
			}else if(menu.equals("3")) {
				System.out.println("종료");
				break;

			}else {
				System.out.println("잘못된 메뉴 선택");
			}
			//전체 데이터를 출력
			for(DTO t:list) {
				System.out.println(t.getTeam());
			}
		}
		//무한 반복문 종료
		
	}

}
