import java.util.Scanner;

public class NumberPyramid1 {

	

			public static void main(String[] args) {
				
				// lastNumber is the maximum number until which the numbers need to be
				// displayed
				System.out.println("Enter the last number until which the numbers need to be displayed:");
				Scanner in = new Scanner(System.in);// constructor to accept user input
				int lastNumber = in.nextInt();
				for (int i = 1; i <= lastNumber; i++) {// i is the number being printed
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

					for (int j = 1; j <= i; j++) {// 'j' is used as a counter for
													// printing
													// 'i' s for the 'i'th time

						System.out.print(j + " ");// print j (the output we want)because for every i, j takes values from 1 till i  
					}
					System.out.println("");

				}
				in.close();

			
		

	}

}
