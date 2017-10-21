
public class Utility implements UtilityInterface {
	
	public double tempConverter(double temperature) {
		double celcius = (temperature - 32) * 0.5556;
		return celcius;
	}
	
	public int factorial(int number){
		
		int factorial=1;
		if(number>1)
		factorial=number*factorial(number-1);
		return factorial;
		
		
	}
}
