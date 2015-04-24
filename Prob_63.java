import java.math.BigInteger;

/**
 * Powerful digit counts
Problem 63

The 5-digit number, 16807=75, is also a fifth power. Similarly, the 9-digit number, 134217728=89, is a ninth power.

How many n-digit positive integers exist which are also an nth power?

 */

/**
 * @author Venkat
 *
 */
public class Prob_63 {

	/**
	 * 
	 */
	public Prob_63() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger prod = BigInteger.ONE;
		BigInteger num = null;
		int cnt=0;
		int max=100;
		for(int i=1;i<max;i++){
			for(int j=1;j<max;j++){
			num = new BigInteger(String.valueOf(j));
			prod = num.pow(i);
			if(checkPowDigit(prod,i))
				cnt++;
			}
			prod = BigInteger.ONE;
		}
		System.out.println(cnt);
	}

	private static boolean checkPowDigit(BigInteger prod, int i) {
		// TODO Auto-generated method stub
		if(prod.toString().length()==i)
		return true;
		return false;
	}

}
