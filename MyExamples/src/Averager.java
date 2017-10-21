import java.util.Scanner;

public class Averager {

	public static void main(String[] args) {
		
		System.out.println("Enter the count of numbers whose average is to be found:");
		// Get count
		Scanner in = new Scanner(System.in);// constructor to accept user input
		int count = in.nextInt();
		// get all the numbers
	double sum = 0;
		for (int i = 0; i < count; i++)
			sum += in.nextInt();

		// Find average
		double average = sum / count;

		// print the result
		System.out.println(average);
		in.close();
	}

}
