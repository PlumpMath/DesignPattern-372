package chap02.objectOrientedPrinciple;

/**
 * 일반화 관계와 위임 (체크포인트 p.72)
 *   : 스택 조건에 위배되게 만들기
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P72_Main {
	public static void main(String[] args) {
		P72_MyStack<String> st = new P72_MyStack<String>();
		
		st.push("one");
		st.push("two");
		st.set(0, "three");	// 허용되어서는 안됨.
		
		System.out.println(st.pop());	// two
		System.out.println(st.pop());	// three
	}
}
