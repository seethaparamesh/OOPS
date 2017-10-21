import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		
//get a number from the user and calculate the sum of its digits
		System.out.println("Enter the last number until which the numbers need to be displayed:");
		Scanner in = new Scanner(System.in);// constructor to accept user input
		int number = in.nextInt();
		//calculate the modulo of the number that you have received 
		int sum=0;
		while(number>=1){
		int result=number%10;
		//System.out.println(result);
		sum=sum+result;
		number=number/10;
		}
		System.out.println(sum);
		in.close();
	 
		
	}
}
