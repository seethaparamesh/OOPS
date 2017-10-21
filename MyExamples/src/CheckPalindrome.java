import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		// get the number to be checked for Palindrome from the user
		System.out.println("Please enter the number whose Palindrome is to be checked:");
		Scanner in1 = new Scanner(System.in);// constructor to accept user input
		int number = in1.nextInt();
		int original = number;
		int reverseNumber = 0;
		do {
			reverseNumber = (reverseNumber * 10) + (number % 10);
			System.out.println(reverseNumber);
			number = number / 10;
           } while (number > 0);
		
		if (reverseNumber == original)
			System.out.println("the accepted number is a Palindrome");
		else
			System.out.println("the accepted number is not a Palindrome");
		
		in1.close();
	}

}
