import java.util.Scanner;

public class MissingNumberintheSequence {

	public static void main(String[] args) {
		System.out.println("Enter the numbersequence whose missing number  has to be found:");
		Scanner in = new Scanner(System.in);
		int givenSequence = in.nextInt();
		int length=1;
		missingNumberintheSequence(givenSequence,length);

	}

	private static void missingNumberintheSequence(int givenSequence,int length) {
		// converting the given sequence into an array of numbers
		 
		String temp = Integer.toString(givenSequence);
		int[] arrayFormofgivenSequence = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		   arrayFormofgivenSequence[i] = temp.charAt(i) - '0';
		   //System.out.println(arrayFormofgivenSequence[i]);
		   
		}
		 length=arrayFormofgivenSequence.length;
		System.out.println("the length of the given sequence is :" +length);
		
		for(int j=0;j<arrayFormofgivenSequence.length;j++){
			int sum = ((length) *(length+1))/2;
			sum-=arrayFormofgivenSequence[j];
			System.out.println(sum);
			}
		
	}

}
