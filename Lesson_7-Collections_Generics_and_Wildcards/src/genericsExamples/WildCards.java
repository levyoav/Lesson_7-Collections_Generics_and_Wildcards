package genericsExamples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import classes.animal.Animal;
import classes.animal.Cat;
import classes.animal.Tiger;

public class WildCards {

	public static void main(String[] args) {

		List<Cat> list1 = new ArrayList<Cat>();
		list1.add(new Cat()); //Can add any Cat
		Cat c = list1.get(0);
		System.out.println(c); //"Cat" is printed.

		//Using the ? wildcards states that the collection could be of any type.
		//It is good only for read only.
		List<?> list2 = new ArrayList<Date>();
		List<?> list3 = new ArrayList<Animal>();
		List<?> list4 = new ArrayList<String>();
		List<?> list5 = new ArrayList<Tiger>();

		list2.add(null); //Only null values can be added.
		Object o = list2.get(0); //Getting a null value.
		System.out.println(o); //"null" is printed.

		print(list2); //"[null]" is printed.
		print(list3); //"[]" is printed.
		print(list4); //"[]" is printed.
		print(list5); //"[]" is printed.

		//Creating a List object that contains object that extend or of the type Cat.
		List<? extends Cat> list6 = new ArrayList<Cat>();
		List<? extends Cat> list7 = new ArrayList<Tiger>();

		//Same as before. Only null values can be added.
		list6.add(null);
		Cat c2 = list6.get(0); //Getting a null value.
		System.out.println(c2); //"null" is printed.


	}

	//All of the lists contain different type of objects. Using wildcards in the method's 
	//parameter list allows to invoke a common method (same signature) to all of them.
	public static void print(List<?> list) {
		//Invoking the toString method for each type of objects (Date, Animal etc.)
		//in the different lists.
		System.out.println(list.toString());
	}

}
