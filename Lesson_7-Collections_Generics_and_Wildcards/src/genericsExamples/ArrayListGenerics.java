package genericsExamples;

import java.util.ArrayList;
import java.util.List;

import classes.animal.Animal;
import classes.animal.Cat;
import classes.animal.Tiger;

public class ArrayListGenerics {

	public static void main(String[] args) {
		//An ArrayList of objects of type Animal or of its subclasses.
		List<Animal> animals = new ArrayList<>();
		animals.add(new Cat());
		animals.add(new Animal());
		animals.add(new Tiger());

		print(animals); //"Tiger Cat Animal" is printed.

		//"[Cat, Animal, Tiger]" is printed. This actually causes the
		//invocation of the toString() method of the ArrayList.
		System.out.println(animals);

		System.out.println("==============");

		//An ArrayList of objects of type Cat or of its subclasses.
		List<Cat> cats = new ArrayList<>();
		cats.add(new Tiger());
		cats.add(new Cat());

		print(cats); //"Tiger Cat" is printed.

	}

	//Receives List of objects of type Animal OR OF ITS SUBCLASSES.
	//? - stands for unknown type. This way is good only for READ ONLY.
	//Meaning, as parameters of a method (as described here), not for
	//creating a collection.
	public static void print(List<? extends Animal> animals) {
		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}

		//This would cause a compile time error since only null values can be 
		//assigned when using wildcards. Other than that, it is good only for
		//read only.
//		animals.add(new Animal());
	}

}
