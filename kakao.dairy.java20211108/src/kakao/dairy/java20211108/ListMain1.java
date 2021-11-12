package kakao.dairy.java20211108;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		//ArrayList�� LinkedList �ӵ� ��
		
		//ArrayList�� LinkedList ����
		ArrayList <Integer>al = new ArrayList<>();
		LinkedList <Integer>ll = new LinkedList<>();

		//���� �����͸� 2���� ����
		al.add(1);
		al.add(3);
		
		ll.add(1);
		ll.add(3);
		
		long start = System.nanoTime();
		//1000000���� �����͸� 2��°�� ����
		for(int i=0; i<100000; i=i+1) {
			al.add(1, 2);
		}
		long end = System.nanoTime();
		System.out.println("ArrayList �߰��ð�:"+(end-start));
		
		
		start = System.nanoTime();
		//1000000���� �����͸� 2��°�� ����
		for(int i=0; i<100000; i=i+1) {
			ll.add(1, 2);
		}
		end = System.nanoTime();
		System.out.println("LinkedList �߰��ð�:"+(end-start));
		
		start = System.nanoTime();
		for(int i=0; i<100000; i=i+1)  {
			al.get(1);
		}
		end = System.nanoTime();
		System.out.println("ArrayList �б� �ð�:"+(end-start));
		
		for(int i=0; i<100000; i=i+1)  {
			ll.get(1);
		}
		end = System.nanoTime();
		System.out.println("LinkedList �б� �ð�:"+(end-start));
	}

}
