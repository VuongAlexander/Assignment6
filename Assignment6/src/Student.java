import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Student{

	String firstName;
	String lastName;
	float gpa;
	String major;
	String department;
	int age;

	LinkedList<Course> course = new LinkedList<Course>();
	
	
	public Student(String firstName, String lastName, float gpa, String major, String department, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}	

	public float getGpa() {
		return gpa;
	}
	

	public String getMajor() {
		return major;
	}	

	public String getDepartment() {
		return department;
	}

	public int getAge() {
		return age;
	}
	
	public void addCourse(Course obj) {	
		course.add(obj);
	}
	
	public void removeCourse() {
		course.remove();
	}

	public void sortCourse(Boolean ascending) {
		if(ascending.equals(true)) {
			Collections.sort(course, new Comparator<Course>(){
				public int compare(Course o1, Course o2) {
					return o1.name.compareTo(o2.name);
				}
			});
		}
		else {
			Collections.reverse(course);
		}
	}
}
