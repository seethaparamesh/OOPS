import java.util.Scanner;
import java.lang.Math;

public class armstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to be checked for Armstrong:");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		System.out.println("Enter the number of digits in the given number:");
		int cnt = in.nextInt();
		System.out.println("enter the input number in array form one below the other:");
		int[] inputArray = new int[cnt]; // declaring an array for the input
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = in.nextInt(); // initialize the array with values
											// from the user
		}
		double sum = checkIfArmstrong(inputArray);
		if (sum == number) {
			System.out.println("the given number " + number + "is an Armstrong number");
		} else {
			System.out.println("the given number " + number + "is not an Armstrong number");
		}

		System.out.print("Following are A numbers : ");
		for (int i = 0; i < number; i++) {
			if (checkIfArmstrong(i))
				System.out.print(i + ", ");
		}
		System.out.println("");
	}

	public static double checkIfArmstrong(int[] inputArray) {

		double sum = 0.0;
		int number = 0;
		for (int j = 0; j < inputArray.length; j++) {
			number = inputArray[j];
			System.out.print(number);
		}
		for (int i = 0; i < inputArray.length; i++) {
			sum += Math.pow(inputArray[i], inputArray.length);
		}
		System.out.println("the Armstrong sum of the given number is " + sum);

		return sum;
	}

	public static boolean checkIfArmstrong(int number) {

		int length = (number + "").length();
		int tempNumber = number;
		double sum = 0.0;
		for (int position = 0; position < length; position++) {
			int units = tempNumber % 10;
			tempNumber /= 10;
			sum += Math.pow(units, length);
		}

		return (number == sum);
	}

}
