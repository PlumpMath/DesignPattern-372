package chap02.objectOrientedPrinciple;

import java.util.ArrayList;

/**
 * �Ϲ�ȭ ����� ���� (üũ����Ʈ p.75)
 *   : ArrayList Ŭ������ ���(����)�Ͽ� Stack Ŭ���� ����
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
