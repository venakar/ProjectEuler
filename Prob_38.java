import java.util.ArrayList;
import java.util.HashSet;

/**
 * Pandigital multiples
Problem 38

Take the number 192 and multiply it by each of 1, 2, and 3:

    192 × 1 = 192
    192 × 2 = 384
    192 × 3 = 576

By concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)

The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).

What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n > 1?

 */

/**
 * @author p541832
 *
 */
public class Prob_38 {

	/**
	 * 
	 */
	public Prob_38() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Integer.MAX_VALUE);
		String panNum="";
		long panNumber=1;
		long prod=1;
		for(int i=1;i<10000;i++){
			for(int j=1;j<9999999;j++){
				prod=i*j;
				panNum=panNum+String.valueOf(prod);
				if(panNum.contains("0"))
					break;
				if(panNum.length()>9)
					break;
				panNumber=Long.valueOf(panNum);
			
				if(panNumber>900000000 && panNumber<999999999){
					//System.out.println(i+" "+j+" "+panNumber+" "+prod);
					if(pandigital(panNum)){
						System.out.println(i+" "+j+" "+panNumber);//9327 2 932718654
					}
				}
			}
			panNum="";
			panNumber=1;
		}
	}

	private static boolean pandigital(String prod) {
		// TODO Auto-generated method stub
		String fullNum = prod;
		if(fullNum.length()!=9)
			return false;
		ArrayList<Integer> valueList = new ArrayList<Integer>();
		
		int cnt=0;
		for(int p=0;p<fullNum.length();p++){
			if(Integer.parseInt(String.valueOf(fullNum.charAt(p)))>0){
				valueList.add(Integer.parseInt(String.valueOf(fullNum.charAt(p))));
			}else{
				return false;
			}
		}
		HashSet<Integer> hs=new HashSet<>(valueList);
		for(int h:hs){
			cnt = cnt + h;
		}
		
		//System.out.println(cnt);
		if(cnt==45)
		return true;
		return false;
	}

}
