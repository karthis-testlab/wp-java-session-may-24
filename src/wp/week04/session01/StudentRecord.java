package wp.week04.session01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentRecord {

	public static void main(String[] args) {
		
		Map<Integer, String> students = new HashMap<Integer, String>();
		students.put(1, "Karthi");
		students.put(2, "Swetha");
		students.put(3, "Sam");
		students.put(4, "Karthi");
		
		Set<Entry<Integer, String>> entrySet = students.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getValue());
		}
		
		System.out.println(students);
		System.out.println(students.get(3));
		
		System.out.println(students.keySet());
		System.out.println(students.values());
		System.out.println(students.entrySet());
		
		System.out.println(students.replace(4, "Jai"));
		System.out.println(students);
		
		System.out.println(students.remove(4));
		System.out.println(students);	

	}

}