
public class FindingFactors {

	public static void main(String[] args) {
		
		int factorial = 88;
		/*for (int i = 2; i <= factorial; i++) {
			if (factorial % i == 0) {
				System.out.println(i + "is a factor of " + factorial);
			}

			int continueFactorial = factorial / i;
			factorial = continueFactorial;
			System.out.println(factorial);
			if (factorial % i == 0) {
				continueFactorial = factorial / i;
				factorial = continueFactorial;
				System.out.println(factorial);
			} else {
				System.out.println(i + "is a factor of " + factorial);

			}
			if (factorial % i == 0) {
				continueFactorial = factorial / i;
				factorial = continueFactorial;
				System.out.println(factorial);

			} else {
				System.out.println(i + "is a factor of " + factorial);

			}
		}
		
		 * else { System.out.println(i + "is not a factor of " + factorial); }
		 */
		
		
		System.out.println("==============");
		while(factorial != 1){
			
			
			for (int i = 2; i <= factorial; i++) {
				boolean result = CheckIfFactor(factorial, i);
				if (result == true) {
					factorial = factorial/i;
					break;
				}
			}
			
			
		}
		
		
	}

	// 22, 2 - true
	// 22, 3 - false
	// print my result if successful
	public static boolean CheckIfFactor(int number, int factor) {
		if (number % factor == 0) {

			System.out.println(factor + "is a factor of" + number);
			return true;
		} else {
			return false;
			// System.out.println(factor + "is not a factor of" + number);

		}
	}

}
