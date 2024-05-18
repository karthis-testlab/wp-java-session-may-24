package wp.week02.session01;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {

		// syntax to create the list
		List<String> names = new ArrayList<String>();

		names.add("Karthikeyan");
		names.add("Kavitha");
		names.add("Karthikeyan");
		names.add("Kavitha");
		names.add(0, "Kumar");
		names.add(0, "Kavitha");
		names.add("John");
		
		// Getting first three data from the list
		for (int i = 0; i < 3; i++) {
			System.out.println(names.get(i));
		}

		System.out.println(names.size());

		// it retrive the particular value;
		System.out.println(names.get(0));
		System.out.println(names);

		// it update the existing data in the list
		names.set(3, "Ram");
		System.out.println(names.size());
		System.out.println(names);

		// Remove data from the List
		names.remove(5);
		System.out.println(names.size());
		System.out.println(names);

	}

}
