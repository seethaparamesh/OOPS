import java.util.Scanner;

public class PositiveandNegativeElementsInAnArray {

	public static void main(String[] args) {
		// get an array input from the user with positive and negative elements
		System.out.println("Enter the even count of numbers to be entered in the input array:");
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		System.out.println("enter the array values of the input array one below the other:");
		int[] inputArray = new int[count]; // declaring an array for the input
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = in.nextInt(); // initialize the array with values
											// from the user
		}
		printArray(inputArray);
		// surroundArraywithNegativeElements(inputArray);
		int[] reverseInputArray=ReversebubbleSort(inputArray);
		printArray(reverseInputArray);
		int[] outputArray=surroundArraywithNegativeElements(inputArray);
		
		
	}

	public static int[] ReversebubbleSort(int[] inputArray) { // do a reverse bubble sort so that the output array is a descending one since there are negative elements too in the input array 
		boolean swapped = true;
		//int j = 0;
		int tmp;
		while (swapped) {
			swapped = false;
			//j++;
			for (int i = 0; i<inputArray.length-1; i++) { //there is no need to go and compare till the last element since there is no [i+1]th element to be compared with inputArray[i=4], only until the penultimate element is fine 
				if (inputArray[i] < inputArray[i + 1]) {
					tmp = inputArray[i];
					inputArray[i] = inputArray[i + 1];
					inputArray[i + 1] = tmp;
					swapped = true;
				}
			}
		}
		
		int[] reverseInputArray=inputArray;
		return reverseInputArray;
	}

	private static int[] surroundArraywithNegativeElements(int[] inputArray) {
		// to create a method in which all the positive array elements are
		// surrounded by negative elements
		int[] outputArray = new int[inputArray.length];
		// sort the input array
		int[] reverseInputArray=ReversebubbleSort(inputArray);
		int length= reverseInputArray.length;
		for (int j =0;j<(length/2); j++) {
			System.out.println(reverseInputArray[j]);
			System.out.println(reverseInputArray[j+(length/2)]);
		}
      return outputArray;
	}

	// printing whatever values the user has entered
	public static void printArray(int[] inputArray) {
		System.out.print("The values that you have entered are :");
		for (int j = 0; j < inputArray.length; j++) {
			System.out.print(inputArray[j] + " ");
		}
		System.out.println();

	}

	/*
	 * STEPS: First, sort through the input array to find the positive and
	 * negative numbers and then put them in ascending order Secondly, put the
	 * first number (input array) in first position of output array since it is
	 * already positive THirdly, check if second number is positive or negative
	 * , if positive then place it in (i+2)th position , if negative place it in
	 * (i+1)st position continue doing that until end of array is reached,
	 * placing positive elements followed by negative elements in the output
	 * array
	 */
}
