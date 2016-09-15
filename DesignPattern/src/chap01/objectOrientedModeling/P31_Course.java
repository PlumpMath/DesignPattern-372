package chap01.objectOrientedModeling;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ����Ŭ���� �߰� (üũ����Ʈ p.31)

 * @author assu
 * @date 2016. 9. 15.
 */
public class P31_Course {
	private ArrayList<P31_Transcript> transcripts;
	private String coName;
	
	public P31_Course(String coName) {
		this.transcripts = new ArrayList<P31_Transcript>();
		this.coName = coName;
	}
	
	public void addTrascript(P31_Transcript trans) {
		this.transcripts.add(trans);
	}
	
	public String getCoName() {
		return this.coName;
	}
	
	/**
	 * �� ������ ������ ��� �л� ��ȸ
	 * @return
	 */
	public ArrayList<P31_Student> getStudents() {
		ArrayList<P31_Student> students = new ArrayList<P31_Student>();
		Iterator<P31_Transcript> itor = transcripts.iterator();
		
		while (itor.hasNext()) {
			P31_Transcript trc = itor.next();
			students.add(trc.getStudent());
		}
		return students;
	}
}
