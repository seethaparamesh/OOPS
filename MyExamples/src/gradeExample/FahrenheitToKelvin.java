package gradeExample;
	
import java.util.Scanner;
//Wind Chill = 35.74 + 0.6215T – 35.75(V^0.16) + 0.4275T(V^0.16)
//java.lang.Math.pow(3,4)
//The formula is valid for temperature in the range between -58°F
//and 41°F and wind speed greater than or equal to 2.
public class FahrenheitToKelvin {

	public static void main(String[] args) {
		
System.out.println("Enter the Fahrenheit temperature to be converted :");
Scanner in = new Scanner(System.in);
int fahrenheitTemp = in.nextInt();
System.out.println("Enter the windspeed:");
double windSpeed=in.nextInt();
double celciusTemp=0;
celciusTemp =((fahrenheitTemp-32)*5)/9;
System.out.println("The celcius temp for the given Fahrenheit is "+celciusTemp+ "C");
double kelvinTemp=0;
kelvinTemp=celciusTemp+273.15;
System.out.println("the Kelvin equivalent for the given Fahrenheit is " +kelvinTemp+" K ");
double windChillTemp=0;
if(((fahrenheitTemp>=-58)&&(fahrenheitTemp<=41)) && (windSpeed>=2))
{
windChillTemp=(35.74)+(0.6215*fahrenheitTemp)–((35.75)*(java.lang.Math.pow(windSpeed,0.16))) + ((0.4275*fahrenheitTemp)*(java.lang.Math.pow(windSpeed,0.16)));
System.out.println("the windchill temperature for the given Fahrenheit is "+windChillTemp);	
}
else
	System.out.println("Invalid input");
}

}
