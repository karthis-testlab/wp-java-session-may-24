package wp.week01.session02;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = input.nextInt();
		
		System.out.print("Enter second number: ");
		int b = input.nextInt();
		
		System.out.print("What math operation you need to perfrom it should one of the following operation(+, -, *, /, %): ");
		char operation = input.next().charAt(0);
		
		
		if(operation == '+') {
			System.out.print("Result: ");
			System.out.print(a + b);
		} else if(operation == '-') {
			System.out.println(a - b);
		} else if(operation == '*') {
			System.out.println(a * b);
		} else if(operation == '/') {
			System.out.println(a / b);
		} else if(operation == '%') {
			System.out.println(a % b);
		} else {
			System.out.println("Invalid operation");
		}

	}

}
