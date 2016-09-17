package chap02.objectOrientedPrinciple;

import java.util.ArrayList;

/**
 * ĸ��ȭ (üũ����Ʈ p.66)
 *    : p.64�� ArrayStack Ŭ������ ArrayList �̿��ϵ��� ����
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P066_ArrayListStack {
	public int stackSize;
	public ArrayList<Integer> items;
	
	public P066_ArrayListStack(int stackSize) {
		this.stackSize = stackSize;
		this.items = new ArrayList<Integer>(this.stackSize);
	}
	
	/**
	 * ������ ����ִ��� �˻�
	 * @return
	 */
	public boolean isEmpty() {
		return this.items.isEmpty();
	}
	
	/**
	 * ������ �� ���ִ��� �˻�
	 * @return
	 */
	public boolean isFull() {
		return (this.items.size() >= this.stackSize);
	}
	
	/**
	 * ���ÿ� ������ �߰�
	 * @param item
	 */
	public void push(int item) {
		if (isFull()) {
			System.out.println("Inserting fail!");
		} else {
			//this.items.add(item);
			this.items.add(new Integer(item));
			System.out.println("Inserted Item : " + item);
		}
	}
	
	/**
	 * ������ top�� �ִ� ������ ��ȯ (����)
	 * @return
	 */
	public int pop() {
		if (isEmpty()) {
			System.out.println("Deleting fail!");
			return -1;
		} else {
			return this.items.remove(this.items.size()-1);
		}
	}
	
	/**
	 * ������ top�� �ִ� ������ ��ȯ (�������� ����)
	 * @return
	 */
	public int peek() {
		if (isEmpty()) {
			System.out.println("Peeking fail!");
			return -1;
		} else {
			return this.items.get(this.items.size()-1);
		}
	}
}
