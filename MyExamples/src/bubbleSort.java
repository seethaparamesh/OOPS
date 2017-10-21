import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class bubbleSort {

	public static void main(String[] args) {
		
		bubbleSortMethod();

	}
	//just trying out working on a repository

	public static void bubbleSortMethod() {
		int count = 0;
		int bubbleSortPosition = 0;
		int[] toBeSortedBubble = { 18, 302, 297, 23, 101, 78, 19, 30, 1, 22, 7, 0, 2, 4, 1, 32, 297 };
		do {
			for (bubbleSortPosition = 0; bubbleSortPosition < toBeSortedBubble.length - 1; bubbleSortPosition++) {
				if (toBeSortedBubble[bubbleSortPosition]>toBeSortedBubble[bubbleSortPosition + 1]) {
					int temp = toBeSortedBubble[bubbleSortPosition + 1];
					toBeSortedBubble[bubbleSortPosition + 1] = toBeSortedBubble[bubbleSortPosition];
					toBeSortedBubble[bubbleSortPosition] = temp;
				} 
			}
			count++;
		} while (count < toBeSortedBubble.length);

		PrintArray(toBeSortedBubble);
		
	}
	
	
	public static void PrintArray(int[] toBeSortedBubble) {
		int bubbleSortPosition = 0;
		while (bubbleSortPosition < toBeSortedBubble.length) {
			System.out.print(toBeSortedBubble[bubbleSortPosition++] + " ");
		}
		
	}
	
}