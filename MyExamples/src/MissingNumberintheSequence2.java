import java.util.Scanner;

public class MissingNumberintheSequence2 {

	public static void main(String[] args) {
		System.out.println("Enter the numbersequence whose missing number  has to be found:");
		Scanner in = new Scanner(System.in);
		int givenSequence = in.nextInt();
		int[] arrayFormofgivenSequence=convertSequenceToArray( givenSequence);
		arrayFormofgivenSequence=bubbleSort(arrayFormofgivenSequence);
		int miss=missingNumberintheSequence2(arrayFormofgivenSequence);

	}

	private static int missingNumberintheSequence2(int[] arrayFormofgivenSequence) 
	{ 
		int miss=0;
		for(int i=0;i<=arrayFormofgivenSequence.length;i++){
			if(((arrayFormofgivenSequence[i+1])-(arrayFormofgivenSequence[i]))!=1)
			{
				 miss=arrayFormofgivenSequence[i+1]-1;
				System.out.println("the missing number in the sequence is "+miss);
				break;
				
			}
			else
			{
				System.out.println("the sequence has no numbers missing.");
				return 0;
				
			}
			
		}
		return miss;
		
	}
	   private static int[] convertSequenceToArray(int givenSequence){
		String temp = Integer.toString(givenSequence);
		int[] arrayFormofgivenSequence = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		   arrayFormofgivenSequence[i] = temp.charAt(i)-'0';
		   System.out.println(arrayFormofgivenSequence[i]);
		   
		}
		int  length=arrayFormofgivenSequence.length;
		//System.out.println("the length of the given sequence is :" +length);
		return arrayFormofgivenSequence;
	   }
	   
	   public static int[] bubbleSort(int[] arrayFormofgivenSequence) {
			boolean swapped = true;
			int j = 0;
			int tmp;
			int minimum;
			int maximum;
			while (swapped) {
				swapped = false;
				j++;
				for (int i = 0; i < arrayFormofgivenSequence.length - j; i++) {
					if (arrayFormofgivenSequence[i] > arrayFormofgivenSequence[i + 1]) {
						tmp = arrayFormofgivenSequence[i];
						arrayFormofgivenSequence[i] = arrayFormofgivenSequence[i + 1];
						arrayFormofgivenSequence[i + 1] = tmp;
						swapped = true;
					}
				}
			}
			System.out.println("the sorted given sequence is");
			for(int i=0;i<arrayFormofgivenSequence.length;i++){
				System.out.println(arrayFormofgivenSequence[i]);
				minimum=arrayFormofgivenSequence[0];
				maximum=arrayFormofgivenSequence[arrayFormofgivenSequence.length-1];
			}
			
			return arrayFormofgivenSequence;
		}
	
	}


