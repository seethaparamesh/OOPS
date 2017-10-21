
public class FooCorporationPayroll {

	public static void main(String[] args) {
		
		// Write a method to print pay based on base pay and hours worked
		printPay(10.0, 16.0);
		printPay(10.0, 41.0);
		printPay(7.0, 41.0);
		printPay(1000.0, 61.0);
	}

	public static void printPay(double basePay, double noOfHours) {
		double pay = basePay * noOfHours;;
		if ((noOfHours > 60) || (basePay < 8))
			System.out.println("Invalid data");
		else if (noOfHours > 40) {
			double overTimeHours = noOfHours - 40;
			double overTimePay = overTimeHours * basePay * 1.5;
			pay = overTimePay + pay;
			System.out.println("Your pay is " + pay);
		} else if (noOfHours <= 40) {
			
			System.out.println("Your pay is " + pay);
		}
	}

}
