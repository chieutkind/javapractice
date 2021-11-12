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
	
	//������ ���
	private List<String> players;
	
	//������ - �ʱ�ȭ �۾�
	//�޸� �Ҵ��� �ؾ� �ϴ� �Ӽ����� �޸� �Ҵ��� �����ڿ���
	//�̸� ���ָ� �ܺο��� �޸� �Ҵ��� ���� �ʾƼ� �߻��ϴ�
	//NullPointException�� ���� �� ����
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
		//�Ļ� �Ӽ��� �������� ���� ���
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
		//�Ļ� �Ӽ��� �������� ���� ���
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
	
	
	