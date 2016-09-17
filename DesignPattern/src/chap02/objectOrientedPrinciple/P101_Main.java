package chap02.objectOrientedPrinciple;

/**
 * LinkedListŬ������ �̿��Ͽ� ť ���� (��������6 p.101)
 *    : �̷��� �ϰ� �Ǹ� add(index, element) �޼��带 �̿��� ť�� FIFO Ư�� ��������.
 *    : �ذ��ϱ� ���ؼ� ������ �̿��� LinkedList Ŭ�������� ť�� �ʿ��� ���길 �����ؾ���. (P102_Queue���� �ذ�)
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P101_Main {
	public static void main(String[] args) {
		P101_Queue<String> queue = new P101_Queue<String>();
		
		queue.addQueue("one");
		queue.addQueue("two");
		queue.add(0, "three");		// ���Ǹ� �ȵ�.
	}
}
