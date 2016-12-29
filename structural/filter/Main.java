package filter;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert", "Male"));
		persons.add(new Person("Laura", "Female"));
		persons.add(new Person("Diana", "Female"));

		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();

		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));

		System.out.println("\nFemales: ");
		printPersons(female.meetCriteria(persons));
	}

	public static void printPersons(List<Person> persons) {

		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + "]");
		}
	}
}