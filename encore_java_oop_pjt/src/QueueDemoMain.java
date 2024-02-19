
/*
 * 먼저 들어간 데이터가 먼저 나오는 FIFO 구조 (Enqueue, Dequeue)
 */

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoMain {
	
	public static void main(String [] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		System.out.println("peek " + queue.peek()); // 가장 먼저 out 될 값 리턴
		System.out.println("poll " + queue.poll()); //poll->데이터가 없으면 null 리턴 / pop과 동일한 기능 (remove the head of this queue)
		System.out.println("size " + queue.size());
		System.out.println("remove " + queue.remove()); // head 삭제 및 리턴 (poll과 동일)
		System.out.println("size " + queue.size());
		System.out.println("clear ");
		queue.clear();
		System.out.println("size " + queue.size());
	}
}
