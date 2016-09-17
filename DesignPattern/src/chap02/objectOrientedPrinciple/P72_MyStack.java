package chap02.objectOrientedPrinciple;

import java.util.ArrayList;

/**
 * 일반화 관계와 위임 (체크포인트 p.72)
 *   : 스택 조건에 위배되게 만들기 (ArrayList를 상속받았기 때문에 pop()이 아닌 ArrayList의 set() 사용 가능)
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P72_MyStack<String> extends ArrayList<String> {

	/** */
	private static final long serialVersionUID = -8661830893729782846L;
	
	public void push(String element) {
		add(element);
	}
	
	public String pop() {
		return remove(size()-1);
	}
}
