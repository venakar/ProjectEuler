import java.util.ArrayList;
import java.util.Collections;

/**
 * Amicable numbers
Problem 21

Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a != b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; 
therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.

 */

/**
 * @author Venkat
 *
 */
public class Prob_21 {

	/**
	 * 
	 */
	public Prob_21() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		int sum=0;
		ArrayList<Integer> aList = new ArrayList<Integer>();
		for(int i=1;i<10000;i++){
				a=getDivSum(i);
				b=getDivSum(a);
				if(i==b && a!=b){
					System.out.println(a+" "+b);
					if(!aList.contains(i) && !aList.contains(b)){
					aList.add(i);
					//aList.add(b);
					}
				}
				a=0;
				b=0;
		}
		
		for(int p=0;p<aList.size();p++){
			sum = sum + aList.get(p);
		}
		System.out.println(sum);//31626
	}

	private static int getDivSum(int i) {
		// TODO Auto-generated method stub
		int divSum = 0;
		for(int j=1;j<i;j++){
			if(i%j==0){
				divSum = j + divSum;
			}
		}
		//System.out.println(divSum);
		return divSum;
	}

}
