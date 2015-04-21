/**
 * Digit factorials
Problem 34

145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.

Find the sum of all numbers which are equal to the sum of the factorial of their digits.

Note: as 1! = 1 and 2! = 2 are not sums they are not included.

 */

/**
 * @author p541832
 *
 */
public class Prob_34 {

	/**
	 * 
	 */
	public Prob_34() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Long.MAX_VALUE);
		int total=0;
		for(long i=10;i<99999;i++){
			if(digitFactorial(i)){
				total += i;
			}
		}
		System.out.println(total);//40730 -- an this code for numbers under 999999999 but still got just 2 answers (145,40585)
	}

	private static boolean digitFactorial(long i) {
		// TODO Auto-generated method stub
		int sum=0;
		int len=String.valueOf(i).toString().length();
		for(int j=0;j<len;j++){
			sum = sum + getFactorial(Integer.parseInt(String.valueOf(String.valueOf(i).toString().charAt(j))));
		}
		//System.out.println("sum "+sum);
		if(sum==i)
		return true;
		return false;
	}

	private static int getFactorial(int parseInt) {
		// TODO Auto-generated method stub
		//System.out.println(parseInt);
		int prod =1;
		for(int k=parseInt;k>1;k--){
			//System.out.println(prod+"-"+k);
			prod = prod*k;
		}
		return prod;
	}

}
