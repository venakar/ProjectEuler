import java.util.ArrayList;
import java.util.HashSet;

/**
 * Pandigital prime
Problem 41

We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once. For example, 2143 is a 4-digit pandigital and is also prime.

What is the largest n-digit pandigital prime that exists?

 */

/**
 * @author p541832
 *
 */
public class Prob_41 {

	/**
	 * 
	 */
	public Prob_41() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Integer.MAX_VALUE);
		long max=1000000;//1 more than 987654321
		long[] nonPrimeArr = new long[(int) max];
		for(long i=2;i<max;i++){
			for(long j=2;i*j<max;j++){
				//System.out.println(i+" "+j+" "+i*j);
				nonPrimeArr[(int) (i*j)]=1;
			}
		}
		
		for(int j=0;j<nonPrimeArr.length;j++){
			//if(nonPrimeArr[j]==0)
			//	System.out.println(j);
			if(nonPrimeArr[j]==0 && pandigital(j)){
				System.out.println(j);//7652413
			}
		}
	}

	private static boolean pandigital(long i) {
		// TODO Auto-generated method stub
		String fullNum = String.valueOf(i);
		int fullNumLen = fullNum.length();
		int sum=0;
		for(int s=1;s<=fullNumLen;s++){
			if(fullNum.contains(String.valueOf(s)))
			sum++;
		}
		
		//System.out.println(cnt);
		if(fullNumLen==sum)
		return true;
		return false;
	}

}
