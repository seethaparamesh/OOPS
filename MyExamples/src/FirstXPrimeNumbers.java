import java.util.Scanner;

public class FirstXPrimeNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter any number to check if its prime or not:");
		Scanner in = new Scanner(System.in);// constructor to accept user input
		int checkNumber = in.nextInt();

		int i = 2;
		boolean isPrime = true;

		do {
			int result = checkNumber % i;
			if (result == 0) {

				System.out.println("The number is not prime");
				isPrime = false;
				break;
			} else {
				i++;
			}

		} while (i < checkNumber);
		if (isPrime)
			System.out.println("The number is prime");
		/*
		 * for(int i=2;i<checkNumber;i++){ int result=checkNumber%i;
		 * if(result==0){ //System.out.println(checkNumber +"is not prime");
		 * i++; } else System.out.println(checkNumber + "is prime"); }
		 */
	}

}
