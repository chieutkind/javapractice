package kakao.dairy.java20211108;

import java.util.PriorityQueue;
import java.util.Stack;

public class StackQueueMain {

	public static void main(String[] args) {
		//문자열 저장하는 Stack 생성
		Stack<String> stack = new Stack<>();
		//데이터 추가 
		stack.push("하나");
		stack.push("둘");
		stack.push("셋");
		stack.push("넷");
		
		//데이터를 삭제하면서 꺼내기
		//더 이상 데이터가 없는데 pop을 하면 Underflow가 생김
		String name = stack.pop();
		System.out.println(name);

		//일반 큐는 ArryList를 만들고 remove(0(을 하면 됩니다.
		//우선순위 큐는 데이터를 크기 순서대로 꺼내주는 큐입니다.
		//순서대로 저장되는 것이 아닙니다
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
