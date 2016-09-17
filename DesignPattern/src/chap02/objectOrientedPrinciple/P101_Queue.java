package chap02.objectOrientedPrinciple;

import java.util.LinkedList;

/**
 * LinkedListŬ������ �̿��Ͽ� ť ���� (��������6 p.101)
 *    : �̷��� �ϰ� �Ǹ� add(index, element) �޼��带 �̿��� ť�� FIFO Ư�� ��������.
 *    : �ذ��ϱ� ���ؼ� ������ �̿��� LinkedList Ŭ�������� ť�� �ʿ��� ���길 �����ؾ���. (P102_Queue���� �ذ�)
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
		return this.poll();		// ť���� ���� ���� �߰��� element ����
	}
	
	public String peekQueue() {
		return this.peek();		// ť���� ���� ���� �߰��� element ��ȯ (������ ����)
	}
}
