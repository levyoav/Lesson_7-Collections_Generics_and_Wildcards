package genericsExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorGenerics {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Moshe");
		names.add("David");
		names.add("Lea");
		names.add("Haman");
		names.add("Sarah");

		System.out.println(names);

		String name = names.get(0);
		System.out.println(name);

		//If instead of this would be: Iterator it = names.iterator();
		//there will be a warning since the ArrayList is defined as
		//List<String> instead of simply List<>.
		Iterator<String> it = names.iterator();

		while(it.hasNext()) {
			String curr = it.next();
			System.out.println(curr);

			//Compares the handled String object to a string without case sensitivity.
			if(curr.equalsIgnoreCase("haman")) {
				it.remove();
			}
		}

		System.out.println(names);
	}

}
