package chap02.objectOrientedPrinciple;

/**
 * ���� �ڵ��� ��� ��Ģ (üũ����Ʈ p.97)
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P097_Person {
	private P097_Role role;
	
	public void setRole(P097_Role r) {
		this.role = r;
	}
	
	public P097_Role getRole() {
		return this.role;
	}
	
	public void doIt() {
		role.doIt();
	}
}
