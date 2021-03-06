package chap02.objectOrientedPrinciple;

/**
 * LinkedList클래스를 이용하여 큐 구현 (연습문제6 p.101)
 *    : 이렇게 하게 되면 add(index, element) 메서드를 이용해 큐의 FIFO 특성 만족못함.
 *    : 해결하기 위해선 위임을 이용해 LinkedList 클래스에서 큐에 필요한 연산만 제공해야함. (P102_Queue에서 해결)
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P101_Main {
	public static void main(String[] args) {
		P101_Queue<String> queue = new P101_Queue<String>();
		
		queue.addQueue("one");
		queue.addQueue("two");
		queue.add(0, "three");		// 사용되면 안됨.
	}
}
