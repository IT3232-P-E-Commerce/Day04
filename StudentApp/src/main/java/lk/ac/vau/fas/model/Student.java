package lk.ac.vau.fas.model;

public class Student {
	
	private String name;
	private int age;
	private String regNo;
	private String course;
	private double gpa;

	public Student(String name, int age, String regNo, String course, double gpa) {
		super();
		this.name = name;
		this.age = age;
		this.regNo = regNo;
		this.course = course;
		this.gpa = gpa;
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

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	

}