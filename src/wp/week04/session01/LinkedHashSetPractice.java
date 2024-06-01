package wp.week04.session01;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPractice {

	public static void main(String[] args) {
		
		Set<Integer> numbers = new LinkedHashSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println(numbers.add(5));
		
		for (Integer integer : numbers) {
			System.out.println(integer);
		}

	}

}