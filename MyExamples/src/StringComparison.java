import java.util.Scanner;

public class StringComparison {

	public static void main(String[] args) {
		
// Get the two strings to be compared from the user 
		System.out.println("Enter the two strings to be compared:");
		Scanner in1 = new Scanner(System.in);// constructor to accept user input
		String string1 = in1.next();
		Scanner in2 = new Scanner(System.in);// constructor to accept user input
		String string2 = in2.next();
		
		//for(int i=0;i<string1.length();i++){
			if(string1.equalsIgnoreCase(string2) )
				System.out.println("the strings are equal");
			else
				System.out.println("not equal");
	
		in1.close();
		in2.close();
	}

}
