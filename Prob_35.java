import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Circular primes
Problem 35

The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.

There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.

How many circular primes are there below one million?

 */

/**
 * @author p541832
 *
 */
public class Prob_35 {

	/**
	 * 
	 */
	public Prob_35() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Long> primeList = new ArrayList<Long>();
		HashMap<Long, Long> nonPrime = new HashMap<Long, Long>();
		long prod=1;
		long max=1000000;
		for(long i=2;i<max;i++){
			for(long j=2;i*j<max;j++){
				prod = i*j;
				if(nonPrime.get(prod)==null){
					nonPrime.put(prod, prod);
				}else if(prod<max && nonPrime.get(prod)!=null && prod!=nonPrime.get(prod)){
					nonPrime.put(prod, prod);
				}
				
			}
		}
		for(long k=2;k<max;k++){
			if(nonPrime.get(k)==null){
				primeList.add(k);
			}
		}
		System.out.println();
		int cnt=0;
		for(int p=0;p<primeList.size();p++){
			//System.out.println(primeList.get(p));
			if(checkcirularPrime(primeList.get(p),primeList)){
				cnt++;
			}
		}
		System.out.println("For "+max+" there are "+primeList.size()+" primes in which total Num of circular primes is >> "+cnt);
		//For 1000000 there are 78498 primes in which total Num of circular primes is >> 55
	}

	private static boolean checkcirularPrime(Long p, ArrayList<Long> primeList) {
		// TODO Auto-generated method stub
		int len = String.valueOf(p).length();
		long[] circularNums = new long[len];
		int number = Integer.parseInt(String.valueOf(p));
		int newnumber = 0;
		String str=null;
		for(int num=0;num<len;num++){
			//System.out.println(len+"---"+number+"---");
			//System.out.println(Integer.parseInt(String.valueOf(number).trim().substring(1, len)+""+String.valueOf(number).trim().charAt(0)));
			str = String.valueOf(number).trim().substring(1, len)+String.valueOf(number).trim().charAt(0);
			newnumber = Integer.parseInt(str.trim());
			//System.out.println(newnumber);
			circularNums[num] = newnumber;
			number = newnumber;
			len = String.valueOf(number).length();
		}
		for(int j=0;j<circularNums.length;j++){
			//System.out.println(circularNums[j]);
			if(!primeList.contains(circularNums[j])){
				return false;
			}
		}
		return true;
	}
	
	
	

}
