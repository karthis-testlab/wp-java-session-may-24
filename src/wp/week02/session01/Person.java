package wp.week02.session01;

public class Person {

	// Data Members
	public String name;
	public int age;
	public String city;
	public char gender;
	
	
    // Methods 
	public void eat() {
		System.out.println(name + " is eating now.");
	}

	public void study() {
		System.out.println(name + " is studying now.");
	}

	public void sleep() {
		System.out.println(name + " is sleeping now.");
	}

	public void play() {
		System.out.println(name + " is playing now.");
	}
	
	public void updateName(String name) {
		this.name = name;
	}

}