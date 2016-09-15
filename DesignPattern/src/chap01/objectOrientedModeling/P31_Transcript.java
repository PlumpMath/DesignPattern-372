package chap01.objectOrientedModeling;


/**
 * 연관클래스 추가 (체크포인트 p.31)
 *
 * @author assu
 * @date 2016. 9. 15.
 */
public class P31_Transcript {
	private P31_Student student;
	private P31_Course course;
	private String date;
	private String grade;
	
	public P31_Transcript(P31_Student stu, P31_Course co) {
		this.student = stu;
		this.course = co;
		
		this.student.addTranscript(this);
		this.course.addTrascript(this);
	}

	public P31_Student getStudent() {
		return student;
	}

	public P31_Course getCourse() {
		return course;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
