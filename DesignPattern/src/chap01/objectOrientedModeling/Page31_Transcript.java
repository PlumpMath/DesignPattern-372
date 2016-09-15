package chap01.objectOrientedModeling;


/**
 * ����Ŭ���� �߰� (üũ����Ʈ p.31)
 *
 * @author assu
 * @date 2016. 9. 15.
 */
public class Page31_Transcript {
	private Page31_Student student;
	private Page31_Course course;
	private String date;
	private String grade;
	
	public Page31_Transcript(Page31_Student stu, Page31_Course co) {
		this.student = stu;
		this.course = co;
		
		this.student.addTranscript(this);
		this.course.addTrascript(this);
	}

	public Page31_Student getStudent() {
		return student;
	}

	public Page31_Course getCourse() {
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
