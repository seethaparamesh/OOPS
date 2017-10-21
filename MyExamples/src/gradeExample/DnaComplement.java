package gradeExample;

import java.util.Scanner;

public class DnaComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the dna code to be complemented");
		Scanner in = new Scanner(System.in);
		String givenDNA = in.next();
		System.out.println(getOtherHalf(givenDNA));
		

	}

	private static String getOtherHalf(String givenDNA) {
		
		char[] givenDNAarray = givenDNA.toCharArray();
		StringBuffer buff = new StringBuffer();
		for (int i = 0; i < givenDNA.length(); i++) {
			// System.out.println(givenDNAarray[i]);

			switch (givenDNAarray[i]) {
			case 'A':
				buff.append("T");
				break;

			case 'T':
				buff.append("A");
				break;
			case 'G':
				buff.append("C");
				break;
			case 'C':
				buff.append("G");
				break;

			default:

				break;
			}
		}
		return buff.toString();
		
	}

}
