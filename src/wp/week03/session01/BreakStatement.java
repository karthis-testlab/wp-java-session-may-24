package wp.week03.session01;

public class BreakStatement {

	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
			if(i == 10) {				
				break;
			}
		}
		
		System.out.println("We break the loop.");

	}

}
