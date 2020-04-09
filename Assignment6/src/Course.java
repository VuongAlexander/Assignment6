
public class Course {
	/*
	 * Define and implement class Course. 
	 * This class should contain the following fields: course name, course description,
	 * department, time the course starts, weekday the course is
	 * held on (for simplicity, let us assume the course only meets once a week). 
	 * This class should contain getters and setters for all its attributes.
	 * This class also needs at least one constructor. 
	 * Save this class and its definition into a file named Course.java.
	 */
	String name;
	String description;
	String department;
	String time;
	String weekday;
	
	public Course(String name, String description, String department, String time, String weekday) {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getWeekday() {
		return weekday;
	}
	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}	
}