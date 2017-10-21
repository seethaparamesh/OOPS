import java.util.Scanner;

public class NearestTo100 {

	public static void main(String[] args) {
		
//Get two numbers from the user and find out which one is the closest to 100
		System.out.println("Enter the two numbers which need to be compared:");
		Scanner in = new Scanner(System.in);// constructor to accept user input
		int number1 = in.nextInt();
		Scanner in1 = new Scanner(System.in);// constructor to accept user input
		int number2 = in1.nextInt();
		int diff1=java.lang.Math.abs(100-number1);//diff1 holds the value of 100-number 1 to check which among diff1 and diff2 iscloser to 100
		int diff2=java.lang.Math.abs(100-number2);//diff2 holds the value of 100-number 2
		if(diff1<diff2)
			System.out.println("The number nearest to 100 is :"+ number1);
		else
			System.out.println("The number nearest to 100 is :"+ number2);

		in.close();
		in1.close();
	}

}
