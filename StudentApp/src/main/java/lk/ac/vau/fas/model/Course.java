package lk.ac.vau.fas.model;

public class Course {

	private String name;
	private String code;
	private int duration;
	private String lecturer;
	
	public Course(String name, String code, int duration, String lecturer) {
		super();
		this.name = name;
		this.code = code;
		this.duration = duration;
		this.lecturer = lecturer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
	
	
}