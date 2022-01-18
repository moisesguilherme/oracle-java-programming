package serializing.serialDeserial;

public class Course implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String type;
	private String courseCode;
	private int passingScore;
	
	public Course(String name, String type, String courseCode, int passingScore) {
		this.name = name;
		this.type = type;
		this.courseCode = courseCode;
		this.passingScore = passingScore;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}

	String getCourseCode() {
		return courseCode;
	}

	void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	int getPassingScore() {
		return passingScore;
	}

	void setPassingScore(int passingScore) {
		this.passingScore = passingScore;
	}

	public String toString() {
		return "Name        : " + this.name
			 + "\nType      : " + this.type
			 + "\nCode      : " + this.courseCode
			 + "\nPass Score: " + this.passingScore;
	}
	
	
}
