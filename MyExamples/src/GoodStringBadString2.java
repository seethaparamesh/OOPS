import java.util.Scanner;

public class GoodStringBadString2 {

	public static void main(String[] args) {

		int vowelCount = 0;
		int consonantCount = 0;

		System.out.println("enter the input String  :");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		int length = input.length();
		boolean isGood = true;
		for (int i = 0; i < length; i++) {
			if (isVowel(input.charAt(i))) {
				// vowel
				vowelCount++;
				consonantCount = 0;
				if (vowelCount == 3) {
					System.out.println(" Bad String due to Vowel ");
					isGood = false;
					break;
				}
			} else {
				// consonant
				consonantCount++;
				vowelCount = 0;
				if (consonantCount == 5) {
					System.out.println(" Bad String due to consonant ");
					isGood = false;
					break;
				}
			}
		}
		if (isGood)
			System.out.println(" Good String ");
	}

	private static boolean isVowel(char charAt) {
		if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u')
			return true;
		else
			return false;
	}
}
