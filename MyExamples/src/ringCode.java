import java.util.Scanner;

public class ringCode {

	public static void main(String[] args) {
		
		System.out.println("Enter the code to be scanned:");
		Scanner input = new Scanner(System.in);
		String code = input.nextLine();
		char[] cArray = code.toCharArray();// converting the string"code" to a
											// char[] array
		int j = 0;
		/*
		 * for( j=0;j<cArray.length;j++){ System.out.println(cArray[j]); }
		 */ // loop splits each character from "code" and prints them
		if ((code.length() > 0) && (code.length() <= 20)) {
			System.out.println("this code can be tested");
		} else {
			System.out.println("the code entered is invalid");
		}
		// the entered code.length should be atleast 1 digit and <=20 for it to
		// be valid
		for (j = 0; j < cArray.length; j++) {
			// if the character encountered is a letter,then find the
			// next digit in the "code".the next digit is the length of the ring
			// code.
			// the number of digits after length of the ring code is the ring
			// code which indicates the end of
			// prefix and the rest of the "code" is random! :)
			boolean reachedEndOfCode = false;

			if (Character.isLetter(code.charAt(j))) {// alpha part started
				System.out.println(code.charAt(j));
				for (int k = j + 1; k < cArray.length - 1; k++)
				//int k = j + 1;
				{
					if (Character.isDigit(code.charAt(k))) {// length found at
															// index k
						System.out.println(j + " " + k + " ---true");
						int noOfDigits = Character.digit(code.charAt(k), 10);
						System.out.println(k + " position :" + code.charAt(k));
						// the first digit after the letter in the "code"
						System.out.println(noOfDigits);
						String prefixAH = code.substring(0, k + noOfDigits + 1);
						System.out.println(j + " " + k + " ---AH prefix: " + prefixAH);
						String ringCode = code.substring(k + 1, k + 1 + noOfDigits);
						System.out.println("the ringcode of the given code is" + ringCode);
						String restOfTheString = code.substring(k + 1 + noOfDigits, code.length());
						System.out.println("The random of the given code is " + restOfTheString);
						reachedEndOfCode = true;
						break;//correct end condition to get out of the k loop

					} /*else {
						System.out.println(j + " " + k + " ---no digit at this position");
						
					}*/
					
					//k = cArray.length - 1;bad end condition to get out of the k loop
				}
				if (reachedEndOfCode){//to get out of the "j"loop 
					
					break;
				}

			}

		}
	}
}
