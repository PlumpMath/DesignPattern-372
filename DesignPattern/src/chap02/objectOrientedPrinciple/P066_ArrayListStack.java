package chap02.objectOrientedPrinciple;

import java.util.ArrayList;

/**
 * 캡슐화 (체크포인트 p.66)
 *    : p.64의 ArrayStack 클래스를 ArrayList 이용하도록 변경
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
	 * 스택이 비어있는지 검사
	 * @return
	 */
	public boolean isEmpty() {
		return this.items.isEmpty();
	}
	
	/**
	 * 스택이 꽉 차있는지 검사
	 * @return
	 */
	public boolean isFull() {
		return (this.items.size() >= this.stackSize);
	}
	
	/**
	 * 스택에 아이템 추가
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
	 * 스택의 top에 있는 아이템 반환 (삭제)
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
	 * 스택의 top에 있는 아이템 반환 (삭제하지 않음)
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
