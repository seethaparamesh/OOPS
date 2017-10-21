import java.util.Scanner;

public class ReverseNumberPyramid {

	public static void main(String[] args) {
		
		System.out.println("Enter the last number until which the numbers need to be displayed:");
		Scanner in = new Scanner(System.in);// constructor to accept user input
		int lastNumber = in.nextInt();
		for (int i = lastNumber; i > 0; i--) {// i=lastNumber is the number being printed
			for (int spacing = 1; spacing <= lastNumber - i; spacing++)// to
																		// space
																		// out
																		// the
																		// printing
																		// of
																		// numbers
																		// to
																		// get
																		// the
																		// pyramid
																		// structure
				System.out.print(" ");

			for (int j = 1; j <= i; j++) {// 'j' is still used as a counter for
											// printing
											// 'i' s for the 'i'th time

				System.out.print(i + " ");// print i,'i' times until i
											// <=lastNumber on the same line
			}
			System.out.println("");

		}
		in.close();
	}

}
