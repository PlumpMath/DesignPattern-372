package chap02.objectOrientedPrinciple;

/**
 * ĸ��ȭ (üũ����Ʈ p.68)
 *    : p.64�� ArrayStack Ŭ������ ArrayList �̿��ϵ��� ����
 *    : ���� ����
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P068_StackClient {
	public static void main(String[] args) {
		P068_ArrayListStack st = new P068_ArrayListStack(10);		
		st.push(20);
		System.out.println(st.peek());
	}
}
