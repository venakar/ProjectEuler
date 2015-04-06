import java.math.BigInteger;

/**
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26. 
 * What is the sum of the digits of the number 2^1000?
 */

/**
 * @author p541832
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
		int max= 1000;
		BigInteger num = new BigInteger("2");
		BigInteger result = BigInteger.ONE;
		for(int i=0;i<max;i++){
			//System.out.println(result);
			result = num.multiply(result);
		}
		System.out.println(result);
		//10715086071862673209484250490600018105614048117055336074437503883703510511249361224931983788156958581275946729175531468251871452856923140435984577574698574803934567774824230985421074605062371141877954182153046474983581941267398767559165543946077062914571196477686542167660429831652624386837205668069376
		char[] sumNum = String.valueOf(result).toCharArray();
		int add = 0;
		for(int j=0;j<sumNum.length;j++){
			add = add + Integer.parseInt(String.valueOf(sumNum[j]));
		}
		System.out.println(add);
		//1366
	}

}
