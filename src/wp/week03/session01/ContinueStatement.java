package wp.week03.session01;

public class ContinueStatement {

	public static void main(String[] args) {
		
		int a = 1, b = 20;
		
		while(a <= b) {
			if(a%2 == 0) {
				a++;
				continue;
			} else {				
				System.out.println(a);
			}		
			a++;			
		}

	}

}
