import java.util.Scanner;

public class Persistence {

	public static void main(String[] args) {
		System.out.println("Enter the number whose persistence number  has to be found:");
		Scanner in = new Scanner(System.in);
		int numberToBeConverted = in.nextInt();
		int persistence = findPersistenceNumber(numberToBeConverted);
		System.out.println("the persistence of the number is:" + persistence);
	}

	private static int findPersistenceNumber(int numberToBeConverted) {

		int persistence = 0;

		while (numberToBeConverted >= 10) {
			numberToBeConverted = productOfDigits(numberToBeConverted);
			persistence++;
		}
		return persistence;
	}

	private static int productOfDigits(int numberToBeConverted) {
		int var = 1;

		String number = String.valueOf(numberToBeConverted);
		for (int i = 0; i < number.length(); i++) {
			int j = Character.digit(number.charAt(i), 10);
			System.out.println("digit: " + j);
			var = j * var;
			System.out.println("the product of the digits of " + "numberToBeConverted" + "is" + var);
		}
		return var;
	}

}
