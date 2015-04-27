/**
 * Champernowne's constant
Problem 40

An irrational decimal fraction is created by concatenating the positive integers:

0.123456789101112131415161718192021...

It can be seen that the 12th digit of the fractional part is 1.

If dn represents the nth digit of the fractional part, find the value of the following expression.

d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000

 */

/**
 * @author p541832
 *
 */
public class Prob_40 {

	/**
	 * 
	 */
	public Prob_40() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sbr = new StringBuilder();
		int tot=0;
		for(int i=1;i<1000000;i++){
			sbr.append(String.valueOf(i));
		}
		//d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000
		System.out.println(sbr.toString().length());
        tot = Integer.parseInt(String.valueOf(sbr.charAt(0)))*
        		Integer.parseInt(String.valueOf(sbr.charAt(9)))*
        		Integer.parseInt(String.valueOf(sbr.charAt(99)))*
        		Integer.parseInt(String.valueOf(sbr.charAt(999)))*
        		Integer.parseInt(String.valueOf(sbr.charAt(9999)))*
        		Integer.parseInt(String.valueOf(sbr.charAt(99999)))*
        		Integer.parseInt(String.valueOf(sbr.charAt(999999)));
        System.out.println(tot);//210
	}

}
