package wp.week02.session01;

public class App {

	public static void main(String[] args) {

		// men is the object for the Person class
		Person men = new Person();

		// Here I assinged value to the name data member in the Person class
		men.name = "Karthikeyan";

		// Here we're calling eat method from the Person class
		men.eat();

		Person women = new Person();

		women.name = "Kavitha";

		women.eat();

		CalculatorApp add = new CalculatorApp();

		add.a = 10;
		add.b = 5;

		add.addition();

		CalculatorApp sub = new CalculatorApp();

		sub.a = 15;
		sub.b = 10;

		sub.subraction();

	}

}