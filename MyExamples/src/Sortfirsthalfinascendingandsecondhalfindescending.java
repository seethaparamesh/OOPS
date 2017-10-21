import java.util.Scanner;

public class Sortfirsthalfinascendingandsecondhalfindescending {

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
				//printArray(inputArray);
				int[] outputArray = bubbleSort(inputArray);
				printArray(outputArray);
				
				int[] Sortfirsthalfinascendingandsecondhalfindescending = Sortfirsthalfinascendingandsecondhalfindescending(outputArray);
				printArray(Sortfirsthalfinascendingandsecondhalfindescending);
				//int[] reverseoutputArray = ReversebubbleSort (inputArray);
				//printArray(reverseoutputArray);

	}
	public static int[] bubbleSort(int[] inputArray) { 
		boolean swapped = true;
		//int j = 0;
		int tmp;
		while (swapped) {
			swapped = false;
			//j++;
			for (int i = 0; i<inputArray.length-1; i++) { //there is no need to go and compare till the last element since there is no [i+1]th element to be compared with inputArray[i=4], only until the penultimate element is fine 
				if (inputArray[i] > inputArray[i + 1]) {
					tmp = inputArray[i];
					inputArray[i] = inputArray[i + 1];
					inputArray[i + 1] = tmp;
					swapped = true;
				}
			}
		}
		return inputArray;
	
	}
	
	
	
	
	public static int[] Sortfirsthalfinascendingandsecondhalfindescending(int[] outputArray) {
		
		int midpoint = outputArray.length/2;
		
	/*	for (int j = 0; j < midpoint; j++) {
			System.out.print(outputArray[j] + " ");
		}
		System.out.println();*/

		boolean swapped = true;
		
		//int j = 0;
		int tmp;
		while (swapped) {
			swapped = false;
			//j++;
			for (int i = 3; i<outputArray.length-1; i++) { //there is no need to go and compare till the last element since there is no [i+1]th element to be compared with inputArray[i=4], only until the penultimate element is fine 
				if (outputArray[i] < outputArray[i + 1]) {
					tmp = outputArray[i];
					outputArray[i] = outputArray[i + 1];
					outputArray[i + 1] = tmp;
					swapped = true;
				}
			}
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
			return inputArray;
		
		}
		
		
}
