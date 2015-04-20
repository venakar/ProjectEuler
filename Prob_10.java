/**Summation of primes
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

/**
 * @author p541832
 *
 */
public class Prob_10 {

	/**
	 * 
	 */
	public Prob_10() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int cnt = 0;
		//long sum =0;
		//int number = 100;
	/*	for(int i=1;i<2000000;i++){
			cnt = 0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					cnt++;
				}
			}
			if(cnt==2){
				cnt = 0;
				sum = sum + i;
				System.out.println(i+" Is a Prime Number "+sum);
			}
		}
		

private static boolean isprime(long num) {
		if(num == 2) return true;
		for(int i=2;i<=num/2;++i){
		if(num%i==0)
		return false;
		}
		return true;
}

public static void main(String[] args) {
	System.out.println(new Date());
	double[] arrayPrimes = new double[2000000];
	int[] isPrime = new int[2000000];
	for(int i=2;i<2000000;++i){
	if(isPrime[i-1] == 0 ){
		for(int k=1;k*i<2000000;++k){
		isPrime[k*i-1]=2;
		}
		isPrime[i-1] =1;
	}
	}
	long sum=0;
	for(int j=2;j<2000000;++j) {
	if(isPrime[j-1]==1)
	sum+=j;
	}
	System.out.println(sum);
	System.out.println(new Date());
}



		System.out.println("sum of all the primes below two million is "+sum); */
		//Started @ 2.31 PM - Not completed even @ 3.54 PM - Used 24 % of CPU and 2.5 GB of memory
		//The above piece of code is very basic and 0 % efficient
		//Need to study algorithm which will make it run faster
	  
		/*int n= 10, status = 1, num = 3;
	      
	      if (n >= 1)
	      {
	         System.out.println("First "+n+" prime numbers are :-");
	         System.out.println(2);
	      }
	 
	      for ( int count = 2 ; count <=n ;  )
	      {
	         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
	         {
	            if ( num%j == 0 )
	            {
	               status = 0;
	               break;
	            }
	         }
	         if ( status != 0 )
	         {
	            System.out.println(num);
	            count++;
	         }
	         status = 1;
	         num++;
	      }  */
		int MAX = 2000000;
		long[] array = new long[MAX];
		
		for(long i=2;i<=MAX;i++){
			long p =1;
			//System.out.println("----");
			if(array[(int) p] ==0){
			for(long j =2; p<=MAX;j++){
				
						p = j * i;
						//System.out.println(p+" "+i+" "+j);
						if(p>=MAX || array[(int) p]>0){
							continue;
						}else if(p<=MAX){
							array[(int) p] = 1;
						}
				}
			}
		}
		
		long sum = 0;
		for(long t=2;t<array.length;t++){
			
			if(array[(int) t]==0){
				sum = sum + t;
				//System.out.println(t+" ");
			}
			
		} 
		System.out.println(sum+" ");
		
	}

}
