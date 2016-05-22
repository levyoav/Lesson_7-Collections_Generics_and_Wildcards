package genericsExamples;

import java.util.ArrayList;
import java.util.List;

import classes.person.Person;

public class ListGenerics {

	public static void main(String[] args) {

		//Generic type in List instead of doing:
		//List<String> names = new ArrayList<String>();
		//This is good for automatic casting on run time and checking the 
		//type on compile time.
		List<String> names = new ArrayList<>();
		names.add("abc");

		System.out.println(names);

		//Generic type in List instead of doing:
		//List<Person> persons = new ArrayList<Person>();
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "aaa", 12));

		//Returns the element in the position with index 0.
		Person p = persons.get(0);

		System.out.println(p);
	}

}
