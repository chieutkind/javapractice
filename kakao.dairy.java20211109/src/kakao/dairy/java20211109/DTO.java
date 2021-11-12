package kakao.dairy.java20211109;

import java.util.ArrayList;
import java.util.List;

public class DTO {
	
	private String team;
	private int game;
	private int win;
	private int tie;
	private int lose;
	private int score;
	
	//데이터 목록
	private List<String> players;
	
	//생성자 - 초기화 작업
	//메모리 할당을 해야 하는 속성들의 메모리 할당을 생성자에서
	//미리 해주면 외부에서 메모리 할당을 하지 않아서 발생하는
	//NullPointException을 줄일 수 있음
	public DTO() {
		players = new ArrayList<String>();
	}
	
	
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getGame() {
		return game;
	}
	public void setGame(int game) {
		//파생 속성은 가져오기 전에 계산
		score = win + tie + lose;
		this.game = game;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getTie() {
		return tie;
	}
	public void setTie(int tie) {
		this.tie = tie;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getScore() {
		//파생 속성은 가져오기 전에 계산
		score = win * 3 + tie;
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public List<String> getPlayers() {
		return players;
	}
	public void setPlayers(List<String> players) {
		this.players = players;
	}
	
	@Override
	public String toString() {
		return "DTO [team=" + team + ", game=" + game + ", win=" + win + ", tie=" + tie + ", lose=" + lose + ", score="
				+ score + ", players=" + players + "]";
	}
}
	
	
	