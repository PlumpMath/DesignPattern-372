package chap02.objectOrientedPrinciple;

import java.util.ArrayList;

/**
 * 일반화 관계와 위임 (체크포인트 p.75)
 *   : ArrayList 클래스를 사용(위임)하여 Stack 클래스 구현
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P075_ArrayListStack {
	private ArrayList<String> arList = new ArrayList<String>();
	
	public void push(String item) {
		arList.add(item);
	}
	
	public String pop() {
		return arList.remove(arList.size()-1);
	}
	
	public String peek() {
		return arList.get(arList.size()-1);
	}
	
	public boolean isEmpty() {
		return arList.isEmpty();
	}
}
