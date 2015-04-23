import java.math.BigInteger;

/**
 * Self powers
Problem 48

The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.

 */

/**
 * @author p541832
 *
 */
public class Prob_48 {

	/**
	 * 
	 */
	public Prob_48() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger bigNum = null;
		BigInteger bigProd = BigInteger.ZERO;
		for(int i=1;i<1001;i++){
			bigNum = new BigInteger(String.valueOf(i));
			bigProd = bigProd.add(bigNum.pow(i));
		}
		System.out.println(bigProd.toString().length());
		System.out.println(bigProd.toString().substring(bigProd.toString().length()-10, bigProd.toString().length()));//9110846700
	}

}
