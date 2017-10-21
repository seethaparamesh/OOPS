	
public class Die {
	private static int sides;
	private static int value;
	//private Random generator;
	
	
	public static int getValue() {
		return value;
	}



	public static void setValue(int value) {
		Die.value = value;
	}



	public Die(int sides){
		this.sides=sides;
		
	}
	/*public Die(int sides,int seed){
		this.sides=sides;
		this. seed= seed.RandomNumberGenerator();	
	}*/



	public static int getSides() {
		return sides;
	}



	public static void setSides(int sides) {
		Die.sides = sides;
	}
	
	public int roll(){
		this.value=getValue()+1;
		return this.value;
		
	}
	

}
