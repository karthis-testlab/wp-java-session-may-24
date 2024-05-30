package wp.week03.home.assessments;

public class ConvertPrimitiveTypeToString {

	public static void main(String[] args) {

		int number = 100;
		long l = 100000;
		float f = 3.19f;
		double d = 23.78D;
		char ch = 'K';
		boolean b = false;

		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(ch));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(f));
		System.out.println(String.valueOf(l));
		System.out.println(String.valueOf(number));

	}

}
