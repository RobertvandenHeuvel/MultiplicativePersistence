
public class DetermineMultPers extends MultiplyDigits {
	long determineMultPers(long input) {
		long startingInput = input;
		long multPers = 0;
		while(input>9) {
		//	System.out.println("multiplicative Persistence = " + multPers);
			input = multiplyDigits(input);
			multPers++;
			//System.out.println();
		}
		//System.out.println("multiplicative persistence of " + startingInput + " = " + multPers);
		return multPers;
	}
}
