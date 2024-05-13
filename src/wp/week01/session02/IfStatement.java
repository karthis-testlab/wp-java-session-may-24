package wp.week01.session02;

public class IfStatement {

	public static void main(String[] args) {
		
		int age = 18;
		
		if(age >= 18) {
			System.out.println("Your aligible to vote.");
		}
		
		System.out.println("Your age is: "+age);
		
		int num = 32;
		
		if(num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}		 
		
		int mark = 90;
		
		if (mark > 90) {
			System.out.println("A+");
		} else if (mark > 70) {
			System.out.println("Pass");
		} else {
			System.out.println("fail");
		}
		
		int number = 21;
		
		String result = (number % 2 == 0) ? "Even" : "Odd";
		
		/*if(number % 2 == 0) {
			result = "Even";
		} else {
			result = "Odd";
		}*/
		
		
		
		System.out.println(result);

	}

}
