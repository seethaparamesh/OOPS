import java.util.Scanner;

public class GeneratingPrimeNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter the maximum number until which prime numbers need to be generated:");
		Scanner in = new Scanner(System.in);// constructor to accept user input
		int maxNumber = in.nextInt();// the accepted number is initialised to
										// maxNumber
		for(int i=2;i<maxNumber;i++)
		 checkIfPrime(i);
in.close();
		}

	public static boolean checkIfPrime(int number) {
		//int generatedNumber = 2;
		int i = 2;
		boolean isitPrime = true;
		do {
			int result = number % i;
			if (result == 0) {
				//System.out.println("The number is not prime");
				isitPrime = false;
				break;
			} else
				i++;
		} while (i < number);
		if (isitPrime)
			System.out.print(number + ", ");
		return isitPrime;
	}
	

}
