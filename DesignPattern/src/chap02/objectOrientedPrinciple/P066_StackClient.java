package chap02.objectOrientedPrinciple;

/**
 * ĸ��ȭ (üũ����Ʈ p.66)
 *    : p.64�� ArrayStack Ŭ������ ArrayList �̿��ϵ��� ����
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P066_StackClient {
	public static void main(String[] args) {
		P066_ArrayListStack st = new P066_ArrayListStack(10);
		st.items.add(20);
		System.out.println(st.items.get(st.items.size()-1));
	}
}
