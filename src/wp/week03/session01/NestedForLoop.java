package wp.week03.session01;

public class NestedForLoop {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}