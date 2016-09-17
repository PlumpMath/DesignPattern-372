package chap02.objectOrientedPrinciple;

/**
 * LinkedList를 이용하여 큐 구현 (연습문제7 p.102)
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P102_Main {
	public static void main(String[] args) {
		P102_Queue queue = new P102_Queue();
		
		queue.addQueue("one");
		queue.addQueue("two");
		// queue.add("three");		// 사용할 수 없음(오류)
	}
}
