package assignement1;

class Students {
	private String studentId;
	private String name;
	private int age;
	private char grade;

	public Students() {
		super();
	}

	public Students(String studentId, String name, int age, char grade) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String toString() {
		return " studentId=" + studentId + ", name=" + name + ", age=" + age + ", grade=" + grade;
	}

}

public class Program8 {

	public static void main(String[] args) {
		Students s1 = new Students();
		s1.setStudentId("1da20ec405");
		s1.setName("Dharshan");
		s1.setAge(24);
		s1.setGrade('A');
		Students s2 = new Students();
		s2.setStudentId("1da20ec404");
		s2.setName("basavaraju");
		s2.setAge(23);
		s2.setGrade('B');

		System.out.println(s1);
		System.out.println(s2);
		Students s3 = new Students("R15", "Ram", 23, 'A');
		System.out.println(s3);
	}

}
