package genericsExamples;

import classes.animal.Animal;
import classes.animal.Cat;
import classes.animal.Tiger;

public class PolymorphismInArrays {
	
	public static void main(String[] args) {
		
		//An array of objects of type Animal or of its subclasses.
		Animal[] animals = {new Tiger(), new Cat(), new Animal()};
		
		print(animals); //"Tiger Cat Animal" is printed.
		
		System.out.println("==============");
		
		//An array of objects of type Cat or of its subclasses.
		Cat[] cats = {new Tiger(), new Cat()};
		
		//Prints "Tiger Cat" and then throws an ArrayStoreException. This is due
		//to the attempt to add an Animal type object to an array of Cat type
		//objects in the print() method.
		print(cats);
		
	}
	
	//Receives an Array of objects of type Animal OR OF ITS SUBCLASSES.
	public static void print(Animal[] animals) {
		//Iterates over all of the Animal type objects (or subclasses) in the array.
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
		
		//Adding an Animal type object to an Animal type array, that could also be
		//an array of subclasses of Animal (ie. Cat). Thus, in the second 
		//of print() from main, where an array of Cats is received, this will cause
		//an ArrayStoreException, since Animal is not a Cat.
		animals[0] = new Animal();
	}

}
