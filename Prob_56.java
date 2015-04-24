import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Powerful digit sum
Problem 56

A googol (10100) is a massive number: one followed by one-hundred zeros; 100100 is almost unimaginably large: one followed by two-hundred zeros. Despite their size, the sum of the digits in each number is only 1.

Considering natural numbers of the form, ab, where a, b < 100, what is the maximum digital sum?

 */

/**
 * @author Venkat
 *
 */
public class Prob_56 {

	/**
	 * 
	 */
	public Prob_56() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger num = BigInteger.ONE;
		BigInteger b = null;
		BigInteger prod = BigInteger.ONE;
		int sum = 0;
		ArrayList<Integer> sumList = new ArrayList<>();
		for(int i=1;i<101;i++){
			for(int j=1;j<101;j++){
				b =  new BigInteger(String.valueOf(j));
				prod = b.pow(i);
				sumList.add(digitSum(prod));
				prod = BigInteger.ONE;
			}
		}
		System.out.println(Collections.max(sumList));//972
	}

	private static Integer digitSum(BigInteger prod) {
		// TODO Auto-generated method stub
		int sum=0;
		char[] str = prod.toString().toCharArray();
		for(int i=0;i<str.length;i++){
			sum = sum + Integer.parseInt(String.valueOf(str[i]));
		}
		return sum;
	}

}
