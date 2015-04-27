/**
 * Coin sums
Problem 31

In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:

    1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).

It is possible to make £2 in the following way:

    1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p

How many different ways can £2 be made using any number of coins?

 */

/**
 * @author p541832
 *
 */
public class Prob_31 {

	/**
	 * 
	 */
	public Prob_31() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		int cnt=0;
		
		int one=1;
		int two=2;
		int five=5;
		int ten=10;
		int twenty=20;
		int fifty=50;
		int hundred=100;
		int twohundred=200;
		
		for(int i=0;i<=200;i++){
			for(int j=0;j<=100;j++){
				for(int k=0;k<=40;k++){
					for(int p=0;p<=20;p++){
						for(int q=0;q<=10;q++){
							for(int t=0;t<=4;t++){
								for(int r=0;r<=2;r++){
									for(int b=0;b<=1;b++){
									total = i*one +j*two+ k*five+ p*ten+ q*twenty+ t*fifty+ r*hundred + b*twohundred;
									if(total==200)
										cnt++;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(cnt);//73682
		}
}
