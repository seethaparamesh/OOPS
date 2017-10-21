import java.util.Scanner;

public class ReverseOfANumber {

	public static void main(String[] args) {
		
//To receive a number from user and calculate the reverse and print it

System.out.println("Enter the number whose reverse needs to be found");
		Scanner in = new Scanner(System.in);// constructor to accept user input
		int number = in.nextInt();
		while(number>=1){
			int result=0;
			result=number%10;
			System.out.print(result);
			number=number/10;
		}
		in.close();
	}

}
