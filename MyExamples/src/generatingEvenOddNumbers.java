

import java.util.Scanner;

public class generatingEvenOddNumbers {

	static int[] even = new int[20];
	static int[] odd = new int[20];
	static int evenCount = 0;
	static int oddCount = 0;

	public static void main(String[] args) {
		System.out.println("Enter the upper limit until which the numbers need to be generated:");
		Scanner limit = new Scanner(System.in);
		int upperLimit = limit.nextInt();
		limit.close();

		generatingEvenOdd(upperLimit);
		printEvenOddArray();
		reverseArray();
		printEvenOddArray();
	}

	private static void reverseArray() {
		int[] evenReverse = new int[20];
		int er = 0;
		for (int k = evenCount - 1; k >= 0; k--,er++) {
			evenReverse[er] = even[k];
			
		}
		for (int k = 0; k < evenCount; k++) {
			even[k] = evenReverse[k];
		}
		
		for(int k=0;k<oddCount/2;k++){
			int temp=odd[k];
			odd[k]=odd[oddCount-1-k];
			odd[oddCount-1-k]=temp;
			
		}
		
	}
    public static void generatingEvenOdd(int upperLimit) {

		int i;

		for (i = 1; i < upperLimit; i++) {
			if (i % 2 == 0) {
				even[evenCount] = i;
				evenCount++;
			} else {
				odd[oddCount] = i;
				oddCount++;
			}
		}
	}

	public static void printEvenOddArray() {
		System.out.println("Even Array:");
		for (int k = 0; k < evenCount; k++) {
			System.out.print(even[k] + " ");
		}
		System.out.println();
		System.out.println("Odd Array:");
		for (int i = 0; i < oddCount; i++) {
			System.out.print(odd[i] + " ");
		}
		System.out.println();
	}

}
