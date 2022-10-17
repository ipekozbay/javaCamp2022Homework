package entities;

public class Course {

	private int id;
	private String name;
	private int price;
	private String courseInstructorName;

	public Course(int id, String name, int price, String courseInstructorName) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.courseInstructorName = courseInstructorName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCourseInstructorName() {
		return courseInstructorName;
	}

	public void setCourseInstructorName(String courseInstructorName) {
		this.courseInstructorName = courseInstructorName;
	}
}
