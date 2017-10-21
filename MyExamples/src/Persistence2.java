import java.util.Scanner;

public class Persistence2 {

	public static void main(String[] args) {
		System.out.println("Enter the number whose persistence number  has to be found:");
		Scanner in = new Scanner(System.in);
		int numberToBeConverted = in.nextInt();
		System.out.println("Persistence : " + findPersistenceNumber(numberToBeConverted));
	}

	private static int findPersistenceNumber(int numberToBeConverted) {
		int persistence = 0;
		while (numberToBeConverted > 9) {
			persistence++;
			numberToBeConverted = productOfTheDigits(numberToBeConverted);
		}
		return persistence;
	}

	private static int productOfTheDigits(int numberToBeConverted) {
		String number = String.valueOf(numberToBeConverted);
		int product = 1;
		for (int i = 0; i < number.length(); i++) {
			int j = Character.digit(number.charAt(i), 10);
			product *= j;
		}
		return product;
	}

}
