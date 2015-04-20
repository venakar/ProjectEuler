import java.math.BigInteger;

/**
 * Digit fifth powers
Problem 30

Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

    1634 = 14 + 64 + 34 + 44
    8208 = 84 + 24 + 04 + 84
    9474 = 94 + 44 + 74 + 44

As 1 = 14 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.

 */

/**
 * @author p541832
 *
 */
public class Prob_30 {

	/**
	 * 
	 */
	public Prob_30() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
		for(long i=1001;i<999999;i++){
			//System.out.println(i);
			if(isPowerOfFour(i)){
				//System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

	private static boolean isPowerOfFour(long i) {
		// TODO Auto-generated method stub
		BigInteger mulValue = BigInteger.ZERO;
		BigInteger digitValue = null;
		String digit = null;
		for(int j=0;j<String.valueOf(i).length();j++){
			digit = String.valueOf(String.valueOf(i).charAt(j));
			digitValue = new BigInteger(digit);
			mulValue = mulValue.add(digitValue.pow(5));
		}
		//System.out.println(mulValue+" "+i);
		if(mulValue.toString().equals(String.valueOf(i)))
		return true;
		return false;
	}

}
