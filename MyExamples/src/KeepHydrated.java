import java.util.Scanner;

public class KeepHydrated {
	static double numberOfHours;

	public static void main(String[] args) {
		System.out.println("Enter the number of hours Nathan has been cycling:");
		Scanner in = new Scanner(System.in);
		numberOfHours = in.nextDouble();
		System.out.println(Liters(numberOfHours));

	}

	public static int Liters(double numberOfHours) {
		double numberOfLiters = 0;
		// Your code goes here! Hint: You should change that -1
		if (numberOfHours >0) {

			numberOfLiters = numberOfHours * 0.5;

		}

		else  {
			numberOfLiters =-1;
		}
		return (int)numberOfLiters;

	}

}
