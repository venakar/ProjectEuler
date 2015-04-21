/**
 * Digit cancelling fractions
Problem 33

The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to simplify it may incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling the 9s.

We shall consider fractions like, 30/50 = 3/5, to be trivial examples.

There are exactly four non-trivial examples of this type of fraction, less than one in value, and containing two digits in the numerator and denominator.

If the product of these four fractions is given in its lowest common terms, find the value of the denominator.

 */

/**
 * @author p541832
 *
 */
public class Prob_33 {

	/**
	 * 
	 */
	public Prob_33() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prod=1;
		for(int num=10;num<99;num++){
			for(int denom=10;denom<99;denom++){
				if(num!=denom){
					if(checkHasSameDigits(num,denom)){
						if(!divByTen(num,denom)){
							if(checkTrivialFraction(num,denom)){
								System.out.println(num+"/"+denom);
								//Answer 1/4 * 1/5 * 2/5 * 4/8 => 100
							}
						}
					}
				}
			}
		}
	}

	private static boolean divByTen(int num, int denom) {
		// TODO Auto-generated method stub
		if(num%10==0 || denom%10==0)
			return true;
		return false;
	}

	private static boolean checkTrivialFraction(int num, int denom) {
		// TODO Auto-generated method stub
		int digitNum,digitDenom;
		
		if(String.valueOf(num).charAt(0)==String.valueOf(denom).charAt(0)){
			digitNum=Integer.parseInt(String.valueOf(String.valueOf(num).charAt(1)));
			digitDenom=	Integer.parseInt(String.valueOf(String.valueOf(denom).charAt(1)));
	
		}else if(String.valueOf(num).charAt(0)==String.valueOf(denom).charAt(1)){
			digitNum=Integer.parseInt(String.valueOf(String.valueOf(num).charAt(1)));
			digitDenom=	Integer.parseInt(String.valueOf(String.valueOf(denom).charAt(0)));
		
		}else if(String.valueOf(num).charAt(1)==String.valueOf(denom).charAt(0)){
			digitNum=Integer.parseInt(String.valueOf(String.valueOf(num).charAt(0)));
			digitDenom=	Integer.parseInt(String.valueOf(String.valueOf(denom).charAt(1)));
		
		}else{
			digitNum=Integer.parseInt(String.valueOf(String.valueOf(num).charAt(0)));
			digitDenom=	Integer.parseInt(String.valueOf(String.valueOf(denom).charAt(0)));
		
		}
		float origDiv = num/(float)denom;
		float digitDiv = digitNum/(float)digitDenom;
		//System.out.println(num+" "+denom);
		
		//System.out.println(origDiv+" "+digitDiv);
		if(origDiv==digitDiv && origDiv<1){
			System.out.println(digitNum+"/"+digitDenom);
			return true;
		}
		
		return false;
	}

	private static boolean checkHasSameDigits(int num, int denom) {
		// TODO Auto-generated method stub
		if(String.valueOf(num).charAt(0)==String.valueOf(denom).charAt(0)
				|| String.valueOf(num).charAt(0)==String.valueOf(denom).charAt(1)
				|| String.valueOf(num).charAt(1)==String.valueOf(denom).charAt(0)
				|| String.valueOf(num).charAt(1)==String.valueOf(denom).charAt(1)){
			return true;
		}
		return false;
	}

}
