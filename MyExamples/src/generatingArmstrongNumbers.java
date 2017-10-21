import java.util.Scanner;

public class generatingArmstrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     for(int i=10;i<100;i++){
    	 Scanner in = new Scanner(System.in);
 		int number = in.nextInt();
 		int[] inputArray = new int[2]; // declaring an array for the current input number
		for (int j = 0; j < inputArray.length; j++) {
			inputArray[j] = in.nextInt(); // initialize the array with values
											// from the user given number
			}
		double sum=checkIfArmstrong(inputArray);
		if(sum==number){
			System.out.println( number+ "is an Armstrong number");
		}
     }
	}
	
public static double checkIfArmstrong(int[] inputArray){
		
		double sum=0.0;
		int number=0;
		for(int j=0;j<inputArray.length;j++){
			number=inputArray[j];
			System.out.print(number);
		}
		for(int i=0;i<inputArray.length;i++){
			sum+=java.lang.Math.pow(inputArray[i],inputArray.length); 
		}
		System.out.println("the Armstrong sum of the given number is "+sum);
		
		return sum;
	}

}
