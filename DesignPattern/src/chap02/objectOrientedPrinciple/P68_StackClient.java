package chap02.objectOrientedPrinciple;

/**
 * 캡슐화 (체크포인트 p.68)
 *    : p.64의 ArrayStack 클래스를 ArrayList 이용하도록 변경
 *    : 정보 은닉
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P68_StackClient {
	public static void main(String[] args) {
		P68_ArrayListStack st = new P68_ArrayListStack(10);		
		st.push(20);
		System.out.println(st.peek());
	}
}
