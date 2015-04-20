import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Longest Collatz sequence
 * 	Problem 14
 * 
 * 	The following iterative sequence is defined for the set of positive integers:
 * 	 n -> n/2 (n is even)
 *   n -> 3n + 1 (n is odd)
 *   Using the rule above and starting with 13, we generate the following sequence:
 *   13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 *   It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 *   
 *   Which starting number, under one million, produces the longest chain?
 *   NOTE: Once the chain starts the terms are allowed to go above one million.
 */

/**
 * @author p541832
 *
 */
public class Prob_14 {

	/**
	 * 
	 */
	public Prob_14() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Integer.MAX_VALUE);
		//910107  992739 60 837799
		long maxValue = 1000000;
		long cnt=1;
		long div=0;
		long num=0;
		long addCnt = 0;
		boolean outerBreak = false;
		HashMap<Long, Long> hMap = new HashMap<Long, Long>();
	
		/*do{
			if(div%2==0){
				div = div/2;
				System.out.println(div);
					cnt++;
			}else{
				div = div*3 + 1;
				System.out.println(div);
					cnt++;
			}  
		}while(div>1);
		System.out.println();
		System.out.println(cnt);*/
	
		for(long i=2;i<=maxValue;i++){
			num = i;
			if(!checkHashNum(hMap,num)){
				do{
					
					if(num%2==0){
						div = num/2;
						if(!checkHashNum(hMap,div)){
							cnt++;
						}else{
							addCnt = getCntNum(hMap,div);
							cnt = cnt+addCnt;
							addHashNum(hMap,i,cnt);
							outerBreak = true;
							break;
						}
						
					}else{
						div = num*3 + 1;
						if(!checkHashNum(hMap,div)){
							cnt++;
						}else{
							addCnt = getCntNum(hMap,div);
							cnt = cnt+addCnt;
							addHashNum(hMap,i,cnt);
							outerBreak = true;
							break;
						}
						
					}
					
					if(div!=1){
						num = div;
					}
					
				}while(div>1);
				
				if(outerBreak){
					cnt=1;
					addCnt =0;
					num=0;
					div=0;
					outerBreak = false;
				}else{
					addHashNum(hMap,i,cnt);
					cnt=1;
					addCnt =0;
					num=0;
					div=0;
					outerBreak = false;
				}
				
			}
		} 
			
		System.out.println(hMap.size());
		System.out.println(Collections.max(hMap.values())); //837799 525
		//System.out.println(hMap.get(837799));
		
		for(long p=0;p<hMap.size();p++){
			//if(hMap.get(p)!=null)
			//System.out.println(p+" "+hMap.get(p));
			if(hMap.get(p)!=null && hMap.get(p)>450)
				System.out.println(p+" "+hMap.get(p));
		}     
		
		


		
	}


	private static Long getCntNum(HashMap<Long, Long> hMap, Long div) {
		// TODO Auto-generated method stub
		return hMap.get(div);
	}

	private static void addHashNum(HashMap<Long, Long> hMap, Long num,
			Long cnt) {
		// TODO Auto-generated method stub
		hMap.put(num, cnt);
		
	}

	private static boolean checkHashNum(HashMap<Long, Long> hMap, Long num) {
		// TODO Auto-generated method stub
		return hMap.containsKey(num);
	}

	

}
