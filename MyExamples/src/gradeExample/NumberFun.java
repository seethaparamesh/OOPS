package gradeExample;

import java.util.Scanner;

public class NumberFun {

	public static void main(String[] args) {
		System.out.println("Enter the square value to find the next square: ");
		
		Scanner in = new Scanner(System.in);
		
		long squareNumber = in.nextLong();
		System.out.println(findNextSquare(squareNumber));
		
		

	}

	public static long findNextSquare(long squareNumber) {
		int sqt=(int)Math.sqrt(squareNumber);
		if((long)(sqt*sqt)==squareNumber){
			System.out.println("the given number is a perfect square");
			return (findNextPerfectSquare(squareNumber));
		}
		else
			{
			System.out.println("the given number is not a perfect square and is hence invalid");
			return(-1);
			}
		
	}

	private static long findNextPerfectSquare(long squareNumber) {
		long number = (long) 0.0;
		long numberfornextPerfectSquare = (long) 0.0;
		long nextPerfectSquare=(long) 0.0;
		number=(long) Math.sqrt(squareNumber);
		numberfornextPerfectSquare = (long) (number + 1.0);
        nextPerfectSquare = numberfornextPerfectSquare * numberfornextPerfectSquare;
        return nextPerfectSquare;
	}
}
