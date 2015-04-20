import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Non-abundant sums
 * Problem 23
 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. 
 * For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, 
 * which means that 28 is a perfect number.
 * 
 * A number n is called deficient if the sum of its proper divisors is less than n 
 * and it is called abundant if this sum exceeds n.
 * 
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, 
 * the smallest number that can be written as the sum of two abundant numbers is 24. 
 * 
 * By mathematical analysis, it can be shown that all integers greater than 28123 
 * can be written as the sum of two abundant numbers. However, this upper limit cannot be 
 * reduced any further by analysis even though it is known that the greatest number that 
 * cannot be expressed as the sum of two abundant numbers is less than this limit.
 * 
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.

 */

/**
 * @author p541832
 *
 */
public class Prob_23 {

	/**
	 * 
	 */
	public Prob_23() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum= 0;
		int nonAbundantNum = 0;
		ArrayList<Integer> aList = new ArrayList<Integer>();
		for(int i=1;i<=28123;i++){
			sum = 0;
			for(int j=1;j<i;j++){
				if(i%j==0){
					sum = sum + j;
					//System.out.println(i+" "+j);
					if(sum>i){
						aList.add(i);
						//System.out.println(i+" Num is a abundant Number with divisor sums "+sum);
						
					}
				}
			}
		}
		
		System.out.println(aList.size());
		
		
		
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		for(int p=0;p<aList.size();p++){
			for(int k=0;k<aList.size();k++){
				nonAbundantNum = aList.get(p) + aList.get(k);
				hMap.put(nonAbundantNum, nonAbundantNum);
				nonAbundantNum = 0;
			}
		}
		
		System.out.println(hMap.size());
		
		int add = 0;
		for(int l=0;l<=28123;l++){
			if(!hMap.containsValue(l))
			add = add + l;
		}
		System.out.println(add);//4179871
	}

}
