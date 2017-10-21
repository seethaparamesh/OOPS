import java.util.Scanner;

public class AscendingOfNumbers {

	public static void main(String[] args) {
		
		//Program to get three inputs from the user and display them in ascending order
		System.out.println("Enter three numbers to be written in ascending order:");
		Scanner in1 = new Scanner(System.in);// constructor to accept user input
		int number1 = in1.nextInt();
		Scanner in2 = new Scanner(System.in);// constructor to accept user input
		int number2 = in2.nextInt();
		Scanner in3 = new Scanner(System.in);// constructor to accept user input
		int number3 = in3.nextInt();
		if((number1<number2)&&(number1<number3)){
			System.out.println(number1);
			if(number2<number3){
				System.out.println(number2);
				System.out.println(number3);
			}
				
		}
		if((number2<number1)&&(number2<number3)){
			System.out.println(number2);
			if(number1<number3){
				System.out.println(number1);
				System.out.println(number3);
			}
				
		}
		if((number3<number1)&&(number3<number2)){
			System.out.println(number3);
			if(number1<number2){
				System.out.println(number1);
				System.out.println(number2);
			}
				
		}
		in1.close();
		in2.close();
		in3.close();

	}

}
