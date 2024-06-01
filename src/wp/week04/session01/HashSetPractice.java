package wp.week04.session01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {

	public static void main(String[] args) {
	
		Set<Integer> numbers = new HashSet<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		System.out.println(numbers);
		
		Set<Integer> numbers1 = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		numbers.addAll(numbers1);
		
		System.out.println(numbers);
		
		// Accessing Set elements using iterator() method
		
		Iterator<Integer> iterator = numbers.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(", ");
		}
		System.out.println("");
		
		// Accessing Set elements using forEach loop
		
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
		System.out.println("Total elements in the Set: "+numbers.size());
		
		Set<Integer> numbers3 = new HashSet<Integer>();
		numbers3.add(1);
		numbers3.add(2);
		numbers3.add(3);
		numbers3.add(4);
		numbers3.add(5);
		numbers3.add(6);
		
		System.out.println(numbers3);
		
		numbers3.remove(4);
		
		System.out.println(numbers3);
		
		numbers3.removeAll(numbers3);
		
		System.out.println(numbers3);
		
		System.out.println(numbers.contains(10));
		

	}

}
