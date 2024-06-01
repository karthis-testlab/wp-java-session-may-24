package wp.week04.session01;

import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(10);
		numbers.add(200);
		numbers.add(5);
		numbers.add(600);
		numbers.add(1);
		
		System.out.println(numbers);
		
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
		System.out.println(numbers.first());
		System.out.println(numbers.last());
		
		int[] arrays = {60, 78, 9, 10};
		TreeSet<Integer> numSet = new TreeSet<Integer>();
		for (int integer : arrays) {
			numSet.add(integer);
		}
		System.out.println("Min value in int[] is: "+numSet.first());
		System.out.println("Max value in int[] is: "+numSet.last());
		
		System.out.println(numbers.ceiling(199));
		System.out.println(numbers.floor(2));
		
		// System.out.println(numbers.pollFirst());
		System.out.println(numbers);		
		System.out.println(numbers.headSet(10));
		System.out.println(numbers.tailSet(10));
		System.out.println(numbers.subSet(5, 600));

	}

}
