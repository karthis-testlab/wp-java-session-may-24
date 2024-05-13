package wp.week01.session02;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int num = 51;
		
		System.out.println(num < 100 && num % 5 == 0);
		
		System.out.println(num < 100 || num % 5 == 0);
		
		System.out.println(!(num < 100 && num % 5 == 0));

	}

}
