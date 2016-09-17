package chap02.objectOrientedPrinciple;

/**
 * �Ϲ�ȭ ����� ���� (üũ����Ʈ p.72)
 *   : ���� ���ǿ� ����ǰ� �����
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P072_Main {
	public static void main(String[] args) {
		P072_MyStack<String> st = new P072_MyStack<String>();
		
		st.push("one");
		st.push("two");
		st.set(0, "three");	// ���Ǿ�� �ȵ�.
		
		System.out.println(st.pop());	// two
		System.out.println(st.pop());	// three
	}
}
