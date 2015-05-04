/**
 * Triangular, pentagonal, and hexagonal
Problem 45

Triangle, pentagonal, and hexagonal numbers are generated by the following formulae:
Triangle 	  	Tn=n(n+1)/2 	  	1, 3, 6, 10, 15, ...
Pentagonal 	  	Pn=n(3n-1)/2 	  	1, 5, 12, 22, 35, ...
Hexagonal 	  	Hn=n(2n-1) 	  	1, 6, 15, 28, 45, ...

It can be verified that T285 = P165 = H143 = 40755.

Find the next triangle number that is also pentagonal and hexagonal.

 */

/**
 * @author p541832
 *
 */
public class Prob_45 {

	/**
	 * 
	 */
	public Prob_45() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long tri,pen,hex=0;
		for(long i=1000000000L;i<1600000000L;i++){
			if(triangularNum(i) && PentagonalNum(i) && hexagonalNum(i))
				System.out.println(i);//1533776805
		}
	}
	
	private static boolean PentagonalNum(long i) {
		// TODO Auto-generated method stub
		double x = (Math.sqrt((24*i)+1)+1)/6;
		if(x%1==0)
		return true;
		return false;
	}
	
	private static boolean triangularNum(long i) {
		// TODO Auto-generated method stub
		double x = (Math.sqrt((8*i)+1)-1)/2;
		if(x%1==0)
		return true;
		return false;
	}
	
	private static boolean hexagonalNum(long i) {
		// TODO Auto-generated method stub
		double x = (Math.sqrt((8*i)+1)+1)/4;
		if(x%1==0)
		return true;
		return false;
	}

}
