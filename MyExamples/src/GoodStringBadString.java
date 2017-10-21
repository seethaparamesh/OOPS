import java.util.Scanner;

public class GoodStringBadString {

	public static void main(String[] args) {
		String[] vowelArray = { "a","e","i","o","u" };
		int vowelCount = 0;
		int consonantCount = 0;
		String[] consonantArray = { "b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z" };
		System.out.println("enter the input String  :");
		Scanner in = new Scanner(System.in);
		String inputArray = in.nextLine();
		int length = inputArray.length();
		System.out.println("Enter the input string in array form:");
		String[] inputArrayString = new String[length]; // declaring an array
														// for the input
		for (int i = 0; i < length; i++) {
			inputArrayString[i] = in.nextLine(); // initialize the array with
													// values
			// from the user
		}
		int vowelOutput = GoodStringBadStringCheckWithVowelArray(inputArrayString, vowelArray);
		int consonantOutput = GoodStringBadStringCheckWithConsonantArray(inputArrayString, consonantArray);
		if (vowelOutput + consonantOutput == 0 )
			System.out.println(" Good String ");
	}

	public static int GoodStringBadStringCheckWithVowelArray(String[] inputArrayString, String[] vowelArray) {
		int vowelCount = 0;
		for (int i = 0; i < inputArrayString.length; i++) {
			boolean isVowel = false;
			for (int j = 0; j < vowelArray.length; j++) {
				if (inputArrayString[i].equals(vowelArray[j])) {
					isVowel = true;
					break;
				}
			}
			if (isVowel)
				vowelCount++;
			else
				vowelCount = 0;
			
			if (vowelCount == 3) {
				System.out.println("Bad String " + "0");
				return 1;
			} 
		}
		
		return 0;

	}

	public static int GoodStringBadStringCheckWithConsonantArray(String[] inputArrayString, String[] consonantArray) {
		int consonantCount = 0;
		for (int i = 0; i < inputArrayString.length; i++) {
			boolean isConsonant = false;
			for (int j = 0; j < consonantArray.length; j++) {
				if (inputArrayString[i] == consonantArray[j]) {
					isConsonant = true;
					break;
				}
			}
			
			if (isConsonant)
				consonantCount++;
			else
				consonantCount = 0;
			
			if (consonantCount == 6) {
				System.out.println("Bad String " + "0");
				return 1;
			}
		}
		return 0;
		
	}

}
