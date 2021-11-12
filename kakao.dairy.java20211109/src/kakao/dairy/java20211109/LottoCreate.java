package kakao.dairy.java20211109;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoCreate {

	public static void main(String[] args) {
		//������ 1~45������ ���� 6���� �����ؼ� ������� ���
		//6���� �ߺ����� ���� �����͸� �����ϱ⿡ ���� �˸��� �ڷᱸ���� ����
		//�迭, List, Set, Map�߿� ����
		
		//�迭�̳� List�� �������� �ߺ��� ����ϱ� ������ �ߺ����� ���� �����͸� �����Ϸ��� �ߺ� �˻縦 ���� �����ؼ� ���� ���θ� �����ؾ� ��
		
		//Set�� �������� �ߺ��� ������� ����.
		//HashSet(�������� �����), LinkedHashSet(������� �����), TreeSet(ũ�⸦ ���)
		
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
