package gradeExample;

import java.util.Scanner;

public class EurekaNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the upper and lower limit of the integers(more than 1 digit numbers) between which the Eureka numbers have to be found:");
        Scanner in = new Scanner(System.in);
		int lowerLimit = in.nextInt();
		int upperLimit = in.nextInt();
		System.out.println(calculateEurekaNumbers(lowerLimit,upperLimit));

	}

	private static int calculateEurekaNumbers(int lowerLimit, int upperLimit) {
		int eurekaCalculation=0;
	for(int i=lowerLimit;i<=upperLimit;i++){
		//separating the digits of the numbers
		eurekaCalculation=0;
		String number = String.valueOf(i);
		for(int j = 0; j < number.length(); j++) {
		int k = Character.digit(number.charAt(j), 10);
		    System.out.println("digit: " + k);
		   eurekaCalculation+=(int)Math.pow(k, j+1);
		    }
		System.out.println(eurekaCalculation);
	
		if (eurekaCalculation==i)
		{ 
			System.out.println("the number " +i+ "is a Eureka number");
			System.out.println();
		}
		else{}
			//System.out.println("the number " +i+ "is not a Eureka number");
	}
	return eurekaCalculation;
	}	

}
