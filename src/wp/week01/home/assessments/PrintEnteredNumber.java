package wp.week01.home.assessments;

import java.util.Scanner;

public class PrintEnteredNumber {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number to print: ");
		
		int number = reader.nextInt();
		
		System.out.println("You entered: "+ number);		
		reader.close();

	}

}