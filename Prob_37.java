/**
 * Truncatable primes
Problem 37

The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.

Find the sum of the only eleven primes that are both truncatable from left to right and right to left.

NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.

 */

/**
 * @author p541832
 *
 */
public class Prob_37 {

	/**
	 * 
	 */
	public Prob_37() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=1000000;
		int[] nonPrimeArr = new int[max];
		for(int i=2;i<max;i++){
			for(int j=2;i*j<max;j++){
				//System.out.println(i+" "+j+" "+i*j);
				nonPrimeArr[i*j]=1;
			}
		}
		String str=null;
		int sum=0;
		for(int k=0;k<nonPrimeArr.length;k++){
			
			if(k>10 && nonPrimeArr[k]==0){
				str=String.valueOf(k);
				//System.out.println("str "+str);
				if(str.startsWith("2") || str.startsWith("3") || str.startsWith("5") ||	str.startsWith("7")){
					if(str.endsWith("2") || str.endsWith("3") || str.endsWith("5") || str.endsWith("7")){
						if(checkTruncPrime(str,nonPrimeArr)){
							//cnt++;
							sum = sum + k;
							System.out.println(str);
						}
					}
				}
			}
		}
		System.out.println("sum of 11 trunc primes is >>"+sum);//748317
	}

	private static boolean checkTruncPrime(String str, int[] nonPrimeArr) {
		// TODO Auto-generated method stub
		int checkCnt=0;
		int checkNums = (str.length()-1)*2;
		//System.out.println(str+" "+checkNums+" "+str.length());
		for(int p=1;p<str.length();p++){
			if(nonPrimeArr[Integer.parseInt(str.substring(p))]==0){
				checkCnt++;
			}else{
				return false;
			}
		}
		
		for(int q=str.length();q>1;q--){
			if(nonPrimeArr[Integer.parseInt(str.substring(0,str.length()-q+1))]==0){
				checkCnt++;
			}else{
				return false;
			}
		}
		
		if(checkCnt==checkNums)
		return true;
		return false;
	}

}
