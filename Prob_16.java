import java.math.BigInteger;

/**
 * 

215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?

 */

/**
 * @author Venkat
 *
 */
public class Prob_16 {

	/**
	 * 
	 */
	public Prob_16() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger num = new BigInteger("2");
		num.multiply(num);
		System.out.println(num.pow(1000));
	}

}
