import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Digit power sum
Problem 119

The number 512 is interesting because it is equal to the sum of its digits raised to some power: 5 + 1 + 2 = 8, and 83 = 512. Another example of a number with this property is 614656 = 284.

We shall define an to be the nth term of this sequence and insist that a number must contain at least two digits to have a sum.

You are given that a2 = 512 and a10 = 614656.

Find a30.

 */

/**
 * @author Venkat
 *
 */
public class Prob_119 {

	/**
	 * 
	 */
	public Prob_119() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger prod = BigInteger.ONE;
		BigInteger num = BigInteger.ONE;
		ArrayList<Long> aList = new ArrayList<>();
		for(int i=1;i<100;i++){
			for(int j=1;j<10;j++){
				num = new BigInteger(String.valueOf(i));
				prod = num.pow(j);
				if(prod.longValue()>10 && getSumOfDigit(prod.longValue())==i){
					//System.out.println(prod+" "+i+"^"+j);
					aList.add(prod.longValue());
				}
			}
		}
		Collections.sort(aList);
		for(int k=0;k<aList.size();k++){
			System.out.println(k+" "+aList.get(k));
		}
		
	/*	for(long i=10;i<max;i++){
			for(long j=1;j<10;j++){
			
				num = new BigInteger(String.valueOf(getSumOfDigit(i)));
				
				if(num.intValueExact()%10==0)
				break;
				
				if(i>3000 && num.intValueExact()<10)
				break;
				
				prod = num.pow((int) j);
				
				yes=false;
				
				if(prod.compareTo(new BigInteger(String.valueOf(i)))>1)
				break;
				
				if(digitPowerSum(prod,(int) i)){
					cnt++;
					System.out.println(cnt+" "+i+" "+num+"^"+j);
					if(cnt==30){
					System.exit(0);
					}
					yes=true;
				}
				if(yes)
				break;
			}
		}*/
	}

	private static int getSumOfDigit(long i) {
		// TODO Auto-generated method stub
		int sum=0;
		String str = String.valueOf(i);
		char[] numArr=str.toString().toCharArray();
		for(int k=0;k<numArr.length;k++){
			sum = sum + Integer.parseInt(String.valueOf(numArr[k]));
		}
		return sum;
	}

	private static boolean digitPowerSum(BigInteger prod, int i) {
		// TODO Auto-generated method stub
		if(prod.toString().equals(String.valueOf(i)))
		return true;
		return false;
	}

}
