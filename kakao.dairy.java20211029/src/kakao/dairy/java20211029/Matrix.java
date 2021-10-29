package kakao.dairy.java20211029;

public class Matrix {

	public static void main(String[] args) {
		//각열은 3개이고 행은 2개인 행렬 생성
		int [][] scores = {{10, 20, 30}, {40, 50, 60}};
		
		//모든 데이터를 접근
		int rows = scores.length;
		int cols = scores[0].length;
		
		//행을 순회
		for(int i=0; i<rows; i=i+1) {
			//각 행의 열을 순회
			for(int j=0; j<cols; j=j+1) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println("");
		}
		
		//열을 먼저 순회
		
		
		
	}

}
