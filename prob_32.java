import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Pandigital products
Problem 32

We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.

The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, multiplier, and product is 1 through 9 pandigital.

Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.
HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.

 */

/**
 * @author p541832
 *
 */
public class Prob_32 {

	/**
	 * 
	 */
	public Prob_32() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long prod = 1;
		long sum = 0;
		
		//System.out.println(addSum);
		ArrayList<Long> mulList = new ArrayList<Long>();
		for(long i=1;i<9999;i++){
		/** Manu added the additional condition prod<9999 to make the code run faster. 30 seconds Vs < 1 second **/
			for(long j=1;j<9999 && i*j<9999;j++){
				prod = i*j;
				
				//System.out.println(i+"*"+j+"="+prod);
				if(pandigital(i,j,prod)){
					//System.out.println(i+"*"+j+"="+prod);
					mulList.add(prod);
				}
			}
		}
		HashSet<Long> mulSet=new HashSet<>(mulList);
		for(long e:mulSet){
			//System.out.println(e);
			sum = sum +e;
		}
		System.out.println(sum);//45228
	}

	private static boolean pandigital(long i, long i2, long prod) {
		// TODO Auto-generated method stub
		String fullNum = String.valueOf(i)+String.valueOf(i2)+String.valueOf(prod);
		if(fullNum.length()!=9)
			return false;
		ArrayList<Integer> valueList = new ArrayList<Integer>();
		//System.out.println(fullNum);
		
		int cnt=0;
		for(int p=0;p<fullNum.length();p++){
			if(Integer.parseInt(String.valueOf(fullNum.charAt(p)))>0){
				//System.out.println(Integer.parseInt(String.valueOf(fullNum.charAt(p))));
				valueList.add(Integer.parseInt(String.valueOf(fullNum.charAt(p))));
			}else{
				return false;
			}
		}
		HashSet<Integer> hs=new HashSet<>(valueList);
		for(int h:hs){
			cnt = cnt + h;
		}
		
		//System.out.println(cnt);
		if(cnt==45)
		return true;
		return false;
	}

}
