import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonTest {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("Joe", "Smith", 40));
		list.add(new Person("Amy", "Gold", 32));
		list.add(new Person("Tony", "Stork", 21));
		list.add(new Person("Sean", "Irish", 24));
		list.add(new Person("Tina", "Brock", 28));
		list.add(new Person("Lenny", "Hep", 18));
		
		System.out.println("-----------Regular List----------------");
		
		for(Person person: list) {
			System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge());
		}
		
		System.out.println("-----------Ascending Sort(age)----------------");
		
		Collections.sort(list, new Comparator<Person>(){
			public int compare(Person o1, Person o2) {
				return Integer.valueOf(o1.age).compareTo(o2.age);
			}
		});
		
		for(Person person: list) {
			System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge());
		}
		
		System.out.println("-----------Descending Sort(age)----------------");
		
		Collections.reverse(list);
		
		for(Person person: list) {
			System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge());
		}
		
		System.out.println("-----------Ascending Sort(first name)----------------");
		Collections.sort(list, new Comparator<Person>(){
			public int compare(Person o1, Person o2) {
				return o1.firstName.compareTo(o2.firstName);
			}
		});
		for(Person person: list) {
			System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge());
		}
		
		System.out.println("-----------Descending Sort(first name)----------------");
		
		Collections.reverse(list);
		
		for(Person person: list) {
			System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge());
		}
		
		
		System.out.println("-----------Ascending Sort(last name length)----------------");
		Collections.sort(list, new Comparator<Person>(){
			public int compare(Person o1, Person o2) {
				return Integer.valueOf(o1.lastName.length()).compareTo(o2.lastName.length());
			}
		});
		for(Person person: list) {
			System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge());
		}
		
		System.out.println("-----------Descending Sort(last name length)----------------");
		
		Collections.reverse(list);
		
		for(Person person: list) {
			System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge());
		}
	}
}
