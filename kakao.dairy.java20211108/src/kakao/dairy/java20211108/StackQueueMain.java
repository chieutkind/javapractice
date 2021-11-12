package kakao.dairy.java20211108;

import java.util.PriorityQueue;
import java.util.Stack;

public class StackQueueMain {

	public static void main(String[] args) {
		//���ڿ� �����ϴ� Stack ����
		Stack<String> stack = new Stack<>();
		//������ �߰� 
		stack.push("�ϳ�");
		stack.push("��");
		stack.push("��");
		stack.push("��");
		
		//�����͸� �����ϸ鼭 ������
		//�� �̻� �����Ͱ� ���µ� pop�� �ϸ� Underflow�� ����
		String name = stack.pop();
		System.out.println(name);

		//�Ϲ� ť�� ArryList�� ����� remove(0(�� �ϸ� �˴ϴ�.
		//�켱���� ť�� �����͸� ũ�� ������� �����ִ� ť�Դϴ�.
		//������� ����Ǵ� ���� �ƴմϴ�
		PriorityQueue<String> queue = 
				new PriorityQueue<>();
		queue.offer("KOREA");
		queue.offer("CHINA");
		queue.offer("USA");
		queue.offer("NEWZEALAND");
		queue.offer("HOLLAND");
		queue.offer("MONGOLIA");
		
		System.out.println(queue.poll());
		
		
	}

}
