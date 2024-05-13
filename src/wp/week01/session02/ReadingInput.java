package wp.week01.session02;

import java.util.Scanner;

public class ReadingInput {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		//int a = input.nextInt();		
		
		//System.out.println(a);
		
		//String ans = input.next();
		
		//System.out.println(ans);
		
		//String ans1 = input.nextLine();
		
		//System.out.println(ans1);
		
		//char ch = input.next().charAt(0);
		//System.out.println(ch);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println(a + b);
		
		input.close();

	}

}
