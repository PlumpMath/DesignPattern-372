package chap02.objectOrientedPrinciple;

/**
 * 캡슐화 (체크포인트 p.66)
 *    : p.64의 ArrayStack 클래스를 ArrayList 이용하도록 변경
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P66_StackClient {
	public static void main(String[] args) {
		P66_ArrayListStack st = new P66_ArrayListStack(10);
		st.items.add(20);
		System.out.println(st.items.get(st.items.size()-1));
	}
}
