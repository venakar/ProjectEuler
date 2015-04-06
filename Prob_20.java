import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Factorial digit sum
Problem 20

n! means n × (n - 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!

 */

/**
 * @author Venkat
 *
 */
public class Prob_20 {

	/**
	 * 
	 */
	public Prob_20() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger prod = BigInteger.ONE;
		int sum=0;
		
		for(int i=100;i>=1;i--){
			prod = prod.multiply(BigInteger.valueOf(i));
		}
		
		for(int j = 0 ; j < prod.toString().length();j++){
			sum += Integer.parseInt(String.valueOf(prod.toString().charAt(j)));
		}
		System.out.println(sum);
		System.out.println(prod+" "+sum);
	}

}
