import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Guessinggame {

	public static void main(String[] args) throws IOException {
		
		Random r = new Random();
		int generatedNumber = r.nextInt(100);
		int guessCount = 0;
		// System.out.println(generatedNumber);
		System.out.println("Enter an integer");
		Scanner in = new Scanner(System.in);
		while (true) {
			int myGuess = in.nextInt();
			guessCount++;
			// }//
			// public int compareNumbers(int generatedNumber,int myGuess){
			// while(myGuess<=100){

			// }
			if (generatedNumber == myGuess) {
				// int guessCount;
				System.out.println("You guessed the number right, the " + guessCount + "time !Therefore your score is :"
						+ guessCount);
				break;
			} else if (generatedNumber < myGuess) {
				System.out.println("Guess is too high. Please try again");

			} else
				System.out.println("Guess is too low.Please try again");
		}
	}

}
