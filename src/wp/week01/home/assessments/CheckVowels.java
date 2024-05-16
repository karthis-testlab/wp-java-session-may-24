package wp.week01.home.assessments;

public class CheckVowels {

	public static void main(String[] args) {

		char one = 'i';

		if (one == 'a' || one == 'e' || one == 'i' || one == 'o' || one == 'u')
			System.out.println(one + " is vowel.");
		else
			System.out.println(one + " is constant.");

		char two = 'p';

		switch (two) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(two + " is vowel.");
			break;
		default:
			System.out.println(two + " is consonant.");
		}

	}

}