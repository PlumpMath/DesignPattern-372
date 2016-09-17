package chap02.objectOrientedPrinciple;

import java.util.ArrayList;

/**
 * �Ϲ�ȭ ����� ���� (üũ����Ʈ p.72)
 *   : ���� ���ǿ� ����ǰ� ����� (ArrayList�� ��ӹ޾ұ� ������ pop()�� �ƴ� ArrayList�� set() ��� ����)
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
