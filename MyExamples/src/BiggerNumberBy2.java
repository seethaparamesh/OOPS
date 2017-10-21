import java.util.Scanner;

public class BiggerNumberBy2 {

	public static void main(String[] args) {
		
		//Accept two numbers from user: If first number is bigger than second number by  2 ,print first number,else print second number
		//else print invalid
		System.out.println("Enter the two numbers to be compared: ");
		Scanner in = new Scanner(System.in);// constructor to accept user input
		int number1 = in.nextInt();
		Scanner in1 = new Scanner(System.in);// constructor to accept user input
		int number2 = in1.nextInt();
		if(number1-number2==2){
			System.out.println("The bigger number is "+number1);
		}
		else if(number2-number1==2){
			System.out.println("The bigger number is "+number2);
		}
		else System.out.println("INvalid");
		in.close();
		in1.close();
	}

}
