package kakao.dairy.java20211029;

public class Matrix {

	public static void main(String[] args) {
		//������ 3���̰� ���� 2���� ��� ����
		int [][] scores = {{10, 20, 30}, {40, 50, 60}};
		
		//��� �����͸� ����
		int rows = scores.length;
		int cols = scores[0].length;
		
		//���� ��ȸ
		for(int i=0; i<rows; i=i+1) {
			//�� ���� ���� ��ȸ
			for(int j=0; j<cols; j=j+1) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println("");
		}
		
		//���� ���� ��ȸ
		
		
		
	}

}
