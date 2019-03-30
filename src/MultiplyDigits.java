
public class MultiplyDigits {
	long multiplyDigits(long input) {
		long productOfDigits = 1;
		while (input>0) {
		//	System.out.println("input this round = " + input);
			long digit = input % 10;
		//	System.out.println("digit = " + digit);
			productOfDigits *= digit;
		//	System.out.println("product of digits = " + productOfDigits);
			input /=10;
		}
		return productOfDigits;
	}
}
