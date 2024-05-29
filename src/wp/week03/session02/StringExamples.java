package wp.week03.session02;

public class StringExamples {

	public static void main(String[] args) {
		
		// This is most common way to create String
		String firstName = "Karthikeyan";
		System.out.println(firstName);
		
		String lastName = new String("Rajendran");
		System.out.println(lastName);
		
		String welcome_message = "Welcome! to the \"String\" class";
		System.out.println(welcome_message);
		
		String fName = "Karthi";
		String fName1 = fName.toUpperCase();
		System.out.println(fName1);
		System.out.println(fName);
		System.out.println(fName1);
		
		System.out.println(firstName.length());
		System.out.println(firstName.concat(lastName));
		System.out.println(firstName+lastName);
		
		System.out.println(firstName+null);
		System.out.println(firstName+5);
		
		String a = "Java";
		String b = "Java";
		
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		String obj = new String("Java");
		obj = "Java";
		
		System.out.println(a == obj);
		System.out.println(a == b);

	}

}