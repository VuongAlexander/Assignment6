/*Define and implement class Person. This class should contain the following fields:
 *  first name, last name, and age. Age should be an integer value.
 *   This class should contain getters and setters for all its attributes. 
 *   This class also needs at least one constructor. 
 *   Save this class and its definition into a file named Person.java.
 */
public class Person {
	
	String firstName;
	String lastName;
	int age;
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}

