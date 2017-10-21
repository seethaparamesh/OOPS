import java.util.Scanner;

public class FahrenheittoCelcius {

	public static void main(String[] args) {
		
		System.out.println("Enter the temperature in Fahrenheit to be converted to Celcius:");
		Scanner ftemp = new Scanner(System.in);// constructor to accept user
												// input
		float temp = ftemp.nextFloat();
		Utility util=new Utility();
		
		
		double celcius = util.tempConverter(temp);
		System.out.println("The converted Celcius equivalent for the given Fahrenheit temperature is");
		System.out.println(celcius);
		ftemp.close();
	}



}
