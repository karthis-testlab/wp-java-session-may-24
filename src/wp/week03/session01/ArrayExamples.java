package wp.week03.session01;

public class ArrayExamples {

	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		System.out.println(numbers.length);
		
		numbers[0] = 100;
		numbers[1] = 1;
		numbers[2] = 3;
		numbers[3] = 3;
		numbers[4] = 3;
		numbers[5] = 3;
		numbers[6] = 3;
		numbers[7] = 3;
		numbers[8] = 3;
		numbers[9] = 3;
		
		
		int[] nums = {1, 2, 3, 4, 5};
		int[] copyNums = nums;
		System.out.println(nums.length);
		System.out.println(copyNums.length);
		System.out.println(copyNums[1]);
		
		System.out.println(numbers[0]);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		for (int i : nums) {
			System.out.println(i);
		}
		
		int[][] tables = new int[3][4];
		
		tables[0][0] = 10;
		tables[0][1] = 11;
		tables[0][2] = 13;
		tables[0][3] = 100;
		
		System.out.println(tables[0][1]);		
		
		/*for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(tables[i][j]);
			}
		}*/
		
		int[][] a = {
				{1, 2, 3},
				{2, 4, 6, 5, 7},
				{3}
		};
		
		System.out.println(a[0].length);

	}

}