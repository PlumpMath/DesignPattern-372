package chap02.objectOrientedPrinciple;

import java.util.LinkedList;

/**
 * LinkedList클래스를 이용하여 큐 구현 (연습문제6 p.101)
 *    : 이렇게 하게 되면 add(index, element) 메서드를 이용해 큐의 FIFO 특성 만족못함.
 *    : 해결하기 위해선 위임을 이용해 LinkedList 클래스에서 큐에 필요한 연산만 제공해야함. (P102_Queue에서 해결)
 *
 * @author assu
 * @date 2016. 9. 17.
 */
@SuppressWarnings("hiding")
public class P101_Queue<String> extends LinkedList<String> {
	
	/**	 */
	private static final long serialVersionUID = -6338481604194508476L;

	public boolean addQueue(String element) {
		return this.offer(element);
	}
	
	public String removeQueue() {
		return this.poll();		// 큐에서 가장 먼저 추가된 element 삭제
	}
	
	public String peekQueue() {
		return this.peek();		// 큐에서 가장 먼저 추가된 element 반환 (삭제는 안함)
	}
}
