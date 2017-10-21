import java.util.Scanner;

public class CeiltheFloor {

	public static void main(String[] args) {
		System.out.println("Enter the number whose ceil and floor needs to be calculated:");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		System.out.println("Enter the number of numbers in array:");
		
		int cnt = in.nextInt();
		System.out.println("enter the array values of the input array one below the other:");
		int[] inputArray = new int[cnt]; // declaring an array for the input
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = in.nextInt(); // initialize the array with values
											// from the user
		}

		//int ceil = CeilInUnsortedArray(inputArray, number, cnt);
		 int floor = FloorInUnsortedArray(inputArray, number,cnt);
		//int[] sortedInputArray = bubbleSort(inputArray);
		//int ceilofsortedarray = CeilinSortedArray(sortedInputArray, number);
		//int floorofsortedarray = FloorinSortedArray(sortedInputArray, number);

		// CeilAndFloorinSortedArray(sortedInputArray, number);

	}

	/*
	 * private static void CeilAndFloorinSortedArray(int[] sortedInputArray, int
	 * number) { int length = sortedInputArray.length; int ceil = 0, floor = 0;
	 * System.out.println("------------- AH ------------"); if (number <
	 * sortedInputArray[0]) {
	 * System.out.println("the floor of the given number " + number +
	 * " does not exist"); ceil = sortedInputArray[0]; }
	 * 
	 * if (number > sortedInputArray[length - 1]) {
	 * System.out.println("the ceil of the given number " + number +
	 * " does not exist"); floor = sortedInputArray[length - 1]; }
	 * 
	 * for (int i = 0; i < length - 1; i++) { if (number > sortedInputArray[i]
	 * && number < sortedInputArray[i + 1]) { ceil = sortedInputArray[i + 1];
	 * floor = sortedInputArray[i]; } if (number == sortedInputArray[i]) { ceil
	 * = sortedInputArray[i]; floor = sortedInputArray[i]; } if (number ==
	 * sortedInputArray[i + 1]) { ceil = sortedInputArray[i + 1]; floor =
	 * sortedInputArray[i + 1]; } }
	 * 
	 * if (ceil != 0) System.out.println("the ceil of the given number is " +
	 * ceil); if (floor != 0)
	 * System.out.println("the floor of the given number is " + floor); }
	 */
	// FINDING THE CEIL AND FLOOR IN AN UNSORTED ARRAY

	public static int CeilInUnsortedArray(int[] inputArray, int number, int cnt) {
		int ceil = 0;
		int difference = 0;
		boolean ceilFound = false;
		int[] diff = new int[cnt];
		for (int i = 0; i <= inputArray.length - 1; i++) {
			if (number == inputArray[i]) {
				ceil = inputArray[i];
				System.out.println("The ceil of the given number is" + ceil);
				return inputArray[i];
			}
			difference = inputArray[i] - number;
			diff[i] = difference;
			//System.out.println(diff[i]);
		}
		int smallest = 0;
		for (int j = 0; j <= inputArray.length - 1; j++) {

			// Find the first number in array>0 (as initial
			// value for int smallest)

			if (diff[j] > 0) {
				smallest = diff[j];
				ceil = inputArray[j];
				ceilFound=true;
				break;// Break out of loop, when you find the first number >0
			}
		}

		for (int j = 0; j < diff.length; j++) // Loop to find the smallest
												// number in array[]
		{
			if (smallest > diff[j] && diff[j] > 0) {
				smallest = diff[j];
				ceil = inputArray[j];
				ceilFound=true;
			}
		}
		if (ceilFound) {
		//System.out.println("The smallest difference of the given number " + number + " is " + smallest);
		System.out.println("the ceil of the given number is " + ceil);
		}
		else
			System.out.println("Ceil does not exist");

		return ceil;

	}

	public static int FloorInUnsortedArray(int[] inputArray, int number,int cnt) {
		int floor = 0;
		int difference = 0;
		boolean floorFound=false;
		int lastIndex=inputArray.length-1;
		int[] diff = new int[cnt];
		for (int i = 0; i <= inputArray.length - 1; i++) {
			if (number == inputArray[i]) {
				floor = inputArray[i];
				System.out.println("the floor of the given number is" + floor);
				return floor;
			}

			difference = inputArray[i] - number;
			diff[i]=difference;
			System.out.println(diff[i]);
		
		if ((difference > 0)&&(i==lastIndex)) {
			System.out.println("the floor of the given number " + number + " does not exist");
			
		}
		}
		int largestNegative=greatestNegative(diff);
		System.out.println("The largest negative of the given number is "+largestNegative);
		System.out.println("the floor of the given number is" + floor);
		return floor;
	}
	public static int greatestNegative(int[] diff) {
	    int largestNegative = 0;
	    int[] inputArray = new int[6]; 
	    int floor=0;
	    for (int i = 0; i < diff.length; i++) {
	        if (diff[i] < 0) {
	            if (largestNegative == 0 || diff[i] > largestNegative) {
	            	largestNegative = diff[i];
	                floor=inputArray[i];
	            }
	        }
	    }
	    //System.out.println("the floor of the given number is" + floor);
	    return largestNegative;
	}


	// FINDING THE CEIL AND FLOOR IN A SORTED ARRAY
	public static int[] bubbleSort(int[] inputArray) {
		boolean swapped = true;
		int tmp;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < inputArray.length - 1; i++) {
				// there is no need to go and compare till the last
				// element since there is no [i+1]th element to be
				// compared with inputArray[i=4], only until the
				// penultimate element is fine
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

	public static int CeilinSortedArray(int[] sortedInputArray, int number) {
		int ceil = 0;
		int length = sortedInputArray.length;
		// if the given number is larger than the largest number in the given
		// array, then floor does not exist. since the array is
		// sorted, start from the last element of the array and if number is
		// greater than that last element, then floor does not exist
		int lastIndex = length - 1;

		if (number > sortedInputArray[lastIndex])
			System.out.println("the ceil of the given number " + number + " does not exist");
		else if (number == sortedInputArray[lastIndex]) {
			System.out.println("the ceil of the given number " + number + " is " + sortedInputArray[lastIndex]);
			return sortedInputArray[lastIndex];
		}

		// the following 'for 'loop is to find out the floor of the given number

		for (int i = 0; i < length - 1; i++) {

			if (number == sortedInputArray[i]) {
				ceil = sortedInputArray[i];
				System.out.println("the ceil of the given number is " + ceil);
				break;
			} else if (number > sortedInputArray[i]) {
				if (number < sortedInputArray[i + 1]) {
					ceil = sortedInputArray[i + 1];
					System.out.println("the ceil of the given number is " + ceil);
					break;
				}
			} else if (number < sortedInputArray[i]) {
				ceil = sortedInputArray[i];
				System.out.println("the ceil of the given number is " + ceil);
				break;
			}

		}

		return ceil;
	}

	private static int FloorinSortedArray(int[] sortedInputArray, int number) {

		int floor = 0;
		int length = sortedInputArray.length;
		// if the given number is less than the largest number in the given
		// array, then floor does not exist. since the array is
		// sorted, start from the last element of the array and if number is
		// less than that last element, then floor does not exist
		int firstIndex = 0;

		if (number < sortedInputArray[firstIndex]) {
			System.out.println("the floor of the given number " + number + " does not exist");

		}

		// the following 'for 'loop is to find out the floor of the given number
		for (int i = 0; i < sortedInputArray.length - 1; i++) {

			if (number == sortedInputArray[i]) {
				floor = sortedInputArray[i];
				System.out.println("the floor of the given number is" + floor);
				break;
			}

			else if ((number > sortedInputArray[i])) {
				if (number < sortedInputArray[i + 1]) {
					floor = sortedInputArray[i];
					System.out.println("the floor of the given number is" + floor);
					break;
				}

				else if (number == sortedInputArray[i + 1]) {
					floor = sortedInputArray[i + 1];
					System.out.println("the floor of the given number is" + floor);
					break;
				} else if (number > sortedInputArray[length - 1]) {

					{
						floor = sortedInputArray[length - 1];
						System.out.println("the floor of the given number is" + floor);
						break;
					}
				}
			}

		}
		return floor;
	}

}