package chap02.objectOrientedPrinciple;

import java.util.LinkedList;

/**
 * LinkedList를 이용하여 큐 구현 (연습문제7 p.102)
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P102_Queue {
	private LinkedList<String> queue = new LinkedList<String>();
	
	public boolean addQueue(String element) {
		return queue.offer(element);
	}
	
	public String removeQueue() {
		return queue.poll();		// 큐에서 가장 먼저 추가된 element 삭제
	}
	
	public String peekQueue() {
		return queue.peek();		//  큐에서 가장 먼저 추가된 element 반환 (삭제는 안함0
	}
}
