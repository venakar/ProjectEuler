import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Sub-string divisibility
Problem 43

The number, 1406357289, is a 0 to 9 pandigital number because it is made up of each of the digits 0 to 9 in some order, but it also has a rather interesting sub-string divisibility property.

Let d1 be the 1st digit, d2 be the 2nd digit, and so on. In this way, we note the following:

    d2d3d4=406 is divisible by 2
    d3d4d5=063 is divisible by 3
    d4d5d6=635 is divisible by 5
    d5d6d7=357 is divisible by 7
    d6d7d8=572 is divisible by 11
    d7d8d9=728 is divisible by 13
    d8d9d10=289 is divisible by 17

Find the sum of all 0 to 9 pandigital numbers with this property.

 */

/**
 * @author p541832
 *
 */
public class Prob_43 {

	/**
	 * 
	 */
	public Prob_43() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum=0;
		long num=0;
		HashSet<String> hs=new HashSet<>(permutationFinder("0123456789"));
		ArrayList<String> sortedList = new ArrayList(hs);
		Collections.sort(sortedList);
		
		System.out.println(sortedList.size());
		for(long i=0;i<sortedList.size();i++){
			if(!String.valueOf(sortedList.get((int) i)).startsWith("0")){
				num = Long.valueOf(sortedList.get((int) i));
				if(primeDivisible(num)){
					//System.out.println(i);
					sum = sum + num;
				}
			}
		}
		System.out.println(sum);//16695334890
	}
	
	private static boolean primeDivisible(long i) {
		// TODO Auto-generated method stub
		String num = String.valueOf(i);
		if(Integer.parseInt(num.substring(1, 4))%2==0 && Integer.parseInt(num.substring(2, 5))%3==0 && 
				Integer.parseInt(num.substring(3, 6))%5==0 && Integer.parseInt(num.substring(4, 7))%7==0 && 
						Integer.parseInt(num.substring(5, 8))%11==0 && Integer.parseInt(num.substring(6, 9))%13==0 && 
								Integer.parseInt(num.substring(7, 10))%17==0 )
			return true;
		return false;
	}

	 public static Set<String> permutationFinder(String str) {
	        Set<String> perm = new HashSet<String>();
	        //Handling error scenarios
	        if (str == null) {
	            return null;
	        } else if (str.length() == 0) {
	            perm.add("");
	            return perm;
	        }
	        char initial = str.charAt(0); // first character
	        String rem = str.substring(1); // Full string without first character
	        Set<String> words = permutationFinder(rem);
	        for (String strNew : words) {
	            for (int i = 0;i<=strNew.length();i++){
	                perm.add(charInsert(strNew, initial, i));
	            }
	        }
	        return perm;
	    }

	    public static String charInsert(String str, char c, int j) {
	        String begin = str.substring(0, j);
	        String end = str.substring(j);
	        return begin + c + end;
	    }

}
