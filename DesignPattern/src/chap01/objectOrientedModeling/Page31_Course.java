package chap01.objectOrientedModeling;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 연관클래스 추가 (체크포인트 p.31)

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
	 * 한 과목을 수강한 모든 학생 조회
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
