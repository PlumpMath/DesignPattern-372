package chap01.objectOrientedModeling;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 연관클래스 추가 (체크포인트 p.31)

 * @author assu
 * @date 2016. 9. 15.
 */
public class P31_Student {
	private ArrayList<P31_Transcript> transcripts;
	private String stuName;
	
	public P31_Student(String stuName) {
		this.transcripts = new ArrayList<P31_Transcript>();
		this.stuName = stuName;
	}
	
	public void addTranscript(P31_Transcript trans) {
		this.transcripts.add(trans);
	}
	
	public String getStuName() {
		return this.stuName;
	}
	
	/**
	 * 한 학생이 수강한 모든 과목 조회
	 * @return
	 */
	public ArrayList<P31_Course> getCourses() {
		ArrayList<P31_Course> courses = new ArrayList<P31_Course>();
		Iterator<P31_Transcript> itor = transcripts.iterator();
		
		while (itor.hasNext()) {
			P31_Transcript trc = itor.next();
			courses.add(trc.getCourse());
		}
		return courses;
	}
}
