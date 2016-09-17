package chap02.objectOrientedPrinciple;

import java.util.LinkedList;

/**
 * LinkedList�� �̿��Ͽ� ť ���� (��������7 p.102)
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
		return queue.poll();		// ť���� ���� ���� �߰��� element ����
	}
	
	public String peekQueue() {
		return queue.peek();		//  ť���� ���� ���� �߰��� element ��ȯ (������ ����0
	}
}
