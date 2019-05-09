import java.math.BigInteger;
/*
Question: What is the first number in the Fibonacci sequence to contain over 1000 digits?
*/
class FibonacciDigits {
	public static void main(String args[]) {
		// Due to the bit restrictions BigInteger usage is ideal
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ZERO;
		int digitNumber = 0; // Current counter to determine the term
		while(b.toString().length() <= 1000){
			// Adding up fibonacci values and changing the temp value
			b = a.add(b);
			a = b.subtract(a);
			digitNumber++;
			if (b.toString().length() == 1000) {
				System.out.println("The desired number is: " + b);
				System.out.println("----- ");
				System.out.println("and the Term Number is: " + digitNumber);
				break;
			}
		}
	}
}