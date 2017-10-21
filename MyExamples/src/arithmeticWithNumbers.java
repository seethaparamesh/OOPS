import java.util.Scanner;

public class arithmeticWithNumbers {

	public static void main(String[] args) {
		// TODO to receive input number from user , calculate the digits'sum, the digits'average,the digits'reverse and largest digit 
 Scanner input=new Scanner(System.in);
 System.out.println("enter an integer number:");
 int number=input.nextInt();	
 //to calculate the largest digit in the entered number
 int digit=0,enteredNumber=0,large=0;
 enteredNumber=number;
 while(number>0){
	 digit=number%10;
	 if(digit>large)
		 large=digit;
	 number=number/10;
 }
 System.out.println("the largest digit in the given number "+enteredNumber +" is " +large);
 //to calculate the smallest digit in the entered number
 int digit1=0,enteredNumber1=0;
  int small=9;
 enteredNumber1=enteredNumber;
 while(enteredNumber>0){
	 digit1=enteredNumber%10;
	 if(digit1<=small)
		 small=digit1;
	 enteredNumber=enteredNumber/10;
 }
 System.out.println("the smallest digit in the given number "+enteredNumber1 +" is " +small);
 
 
//calculate the number of digits in the entered number;
 
 int reverse=0;
 int sum=0; int numberOfDigits=0;
	while(enteredNumber1>=1){
	 reverse=enteredNumber1%10;
	 System.out.print(reverse);
	 numberOfDigits=numberOfDigits+1;//increment the No.Of Digits as and as you print the reverse of the number
     sum=sum+reverse;
	 enteredNumber1=enteredNumber1/10;
	}
	System.out.println("   " + "the Number of digits in the given number is :" +numberOfDigits);
	System.out.println("the sum of the digits is"+sum);
	
	int average=0;
	average=sum/numberOfDigits;
	System.out.println("the average of the digits of the  given number is  " +average);
	input.close();
	}

}
