/**
 * Number spiral diagonals
Problem 28

Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:

21 22 23 24 25
20  7  8  9 10
19  6  1  2 11
18  5  4  3 12
17 16 15 14 13

It can be verified that the sum of the numbers on the diagonals is 101.

What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?

 */

/**
 * @author p541832
 *
 */
public class Prob_28 {

	/**
	 * 
	 */
	public Prob_28() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long gap=0;
		long sum = 0;
		long i=1;
		long max = 1001*1001;
		System.out.println(max);
		//System.out.println(Long.MAX_VALUE);
		while(i<=max){
			
			if(i==1){
				sum = sum + i;
				gap = gap + 2;
				i = gap + i;
				//System.out.println("Sum "+sum+" gap "+gap+" i "+i);
			}else{
				for(int j=0;j<4;j++){
					//System.out.println("Sum "+sum+" gap "+gap+" i "+i+" j "+j);
					sum = sum + i;
					if(j!=3)
					i = gap + i;
					
				}
				gap = gap + 2;
				i = gap + i;
			}
		}
		System.out.println("Sum is "+sum);//669171001
	}

}
