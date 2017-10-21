import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		
		// Get two numbers from the user that needs to be swapped
		/*
		 * System.out.println("Enter the two numbers that need to be swapped:");
		 * Scanner in1 = new Scanner(System.in);// constructor to accept user
		 * input int number1 = in1.nextInt(); Scanner in2 = new
		 * Scanner(System.in);// constructor to accept user input int number2 =
		 * in2.nextInt();
		 * 
		 * in1.close(); in2.close();
		 */

		int number1 = 3, number2 = 2;
		System.out.println(" numbers are: " + number1 + " and " + number2);
		swapNumbers(number1, number2);
		System.out.println(" numbers are: " + number1 + " and " + number2);

		Integer i1 = 3;
		Integer i2 = 2;
		System.out.println(" numbers are: " + i1 + " and " + i2);
		swapNumbers(i1, i2);
		System.out.println(" numbers are: " + i1 + " and " + i2);

		String s1 = "3";
		String s2 = "2";
		System.out.println(" numbers are: " + s1 + " and " + s2);
		swapNumbers(s1, s2);
		System.out.println(" numbers are: " + s1 + " and " + s2);
	
		int[] numbers = {3,2};
		System.out.println(" numbers are: " + numbers[0] + " and " + numbers[1]);
		numbers = swapNumbers(numbers);
		System.out.println(" numbers are: " + numbers[0] + " and " + numbers[1]);
	}

	private static void swapNumbers(String s1, String s2) {
		String thirdVariable = s1;
		s1 = s2;
		s2 = thirdVariable;
		System.out.println("THe swapped numbers are: " + s1 + " and " + s2);
	}

	public static void swapNumbers(int number1, int number2) {
		int thirdVariable = number1;
		number1 = number2;
		number2 = thirdVariable;
		System.out.println("THe swapped numbers are: " + number1 + " and " + number2);

	}
	
	public static void swapNumbers(Integer number1, Integer number2) {
		Integer thirdVariable = number1;
		number1 = number2;
		number2 = thirdVariable;
		//System.out.println("THe swapped numbers are: " + number1 + " and " + number2);

	}
	
	public static int[] swapNumbers(int[] numbers) {
		int thirdVariable = numbers[0];
		numbers[0] = numbers[1];
		numbers[1] = thirdVariable;
		return numbers;
	}
	
}
