package chap02.objectOrientedPrinciple;

/**
 * ���� �ڵ��� ��� ��Ģ (üũ����Ʈ p.97)
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P97_Person {
	private P97_Role role;
	
	public void setRole(P97_Role r) {
		this.role = r;
	}
	
	public P97_Role getRole() {
		return this.role;
	}
	
	public void doIt() {
		role.doIt();
	}
}
