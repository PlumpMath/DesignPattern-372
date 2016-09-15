package chap01.objectOrientedModeling;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ����Ŭ���� �߰� (üũ����Ʈ p.31)

 * @author assu
 * @date 2016. 9. 15.
 */
public class Page31_Course {
	private ArrayList<Page31_Transcript> transcripts;
	private String coName;
	
	public Page31_Course(String coName) {
		this.transcripts = new ArrayList<Page31_Transcript>();
		this.coName = coName;
	}
	
	public void addTrascript(Page31_Transcript trans) {
		this.transcripts.add(trans);
	}
	
	public String getCoName() {
		return this.coName;
	}
	
	/**
	 * �� ������ ������ ��� �л� ��ȸ
	 * @return
	 */
	public ArrayList<Page31_Student> getStudents() {
		ArrayList<Page31_Student> students = new ArrayList<Page31_Student>();
		Iterator<Page31_Transcript> itor = transcripts.iterator();
		
		while (itor.hasNext()) {
			Page31_Transcript trc = itor.next();
			students.add(trc.getStudent());
		}
		return students;
	}
}
