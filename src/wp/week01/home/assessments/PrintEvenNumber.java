package wp.week01.home.assessments;

public class PrintEvenNumber {

	public static void main(String[] args) {

		int maxNumber = 100;

		for (int i = 1; i <= maxNumber; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		// Another Approach
		for(int i = 2; i < maxNumber; i = i+2) {
			System.out.println(i);
		}

	}

}