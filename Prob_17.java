import java.util.HashMap;

/**
 * Number letter counts
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, 
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, 
 * how many letters would be used?
 * NOTE: Do not count spaces or hyphens. 
 * For example, 342 (three hundred and forty-two) contains 23 letters 
 * and 115 (one hundred and fifteen) contains 20 letters.
 * The use of "and" when writing out numbers is in compliance with British usage.

 */

/**
 * @author Venkat
 *
 */
public class Prob_17 {

	/**
	 * 
	 */
	public Prob_17() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(1, "One");
		hMap.put(2, "Two");
		hMap.put(3, "Three");
		hMap.put(4, "Four");
		hMap.put(5, "Five");
		hMap.put(6, "Six");
		hMap.put(7, "Seven");
		hMap.put(8, "Eight");
		hMap.put(9, "Nine");
		hMap.put(10, "Ten");
		hMap.put(11, "Eleven");
		hMap.put(12, "Twelve");
		hMap.put(13, "Thirteen");
		hMap.put(14, "Fourteen");
		hMap.put(15, "Fifteen");
		hMap.put(16, "Sixteen");
		hMap.put(17, "Seventeen");
		hMap.put(18, "Eighteen");
		hMap.put(19, "Nineteen");
		hMap.put(20, "Twenty");
		
		hMap.put(30, "Thirty");
		hMap.put(40, "Forty");
		hMap.put(50, "Fifty");
		hMap.put(60, "Sixty");
		hMap.put(70, "Seventy");
		hMap.put(80, "Eighty");
		hMap.put(90, "Ninety");
		
		hMap.put(100, "Hundred");
		hMap.put(1000, "One Thousand");
		
		hMap.put(0, "and");
		
		StringBuffer sBfr = new StringBuffer();
		
		char[] digits = new char[2];
		for(int i=1;i<=1000;i++){
			digits = String.valueOf(i).toCharArray();
			
			if(i>20 && i<100){
				
				if(i==20){
					sBfr.append(hMap.get(i));
				}else if(i==30){
					sBfr.append(hMap.get(i));
				}else if(i==40){
					sBfr.append(hMap.get(i));
				}else if(i==50){
					sBfr.append(hMap.get(i));
				}else if(i==60){
					sBfr.append(hMap.get(i));
				}else if(i==70){
					sBfr.append(hMap.get(i));
				}else if(i==80){
					sBfr.append(hMap.get(i));
				}else if(i==90){
					sBfr.append(hMap.get(i));
				}else{
					sBfr.append(hMap.get(Integer.parseInt(String.valueOf(digits[0]))*10)+" "+hMap.get(Integer.parseInt(String.valueOf(digits[1]))));
				}
				
			}else if(i>99 && i <1000){
				if(i==100){
					sBfr.append(hMap.get(Integer.parseInt(String.valueOf(digits[0])))+" "+hMap.get(100));
				}else if(i==200){
					sBfr.append(hMap.get(Integer.parseInt(String.valueOf(digits[0])))+" "+hMap.get(100));
				}else if(i==300){
					sBfr.append(hMap.get(Integer.parseInt(String.valueOf(digits[0])))+" "+hMap.get(100));
				}else if(i==400){
					sBfr.append(hMap.get(Integer.parseInt(String.valueOf(digits[0])))+" "+hMap.get(100));
				}else if(i==500){
					sBfr.append(hMap.get(Integer.parseInt(String.valueOf(digits[0])))+" "+hMap.get(100));
				}else if(i==600){
					sBfr.append(hMap.get(Integer.parseInt(String.valueOf(digits[0])))+" "+hMap.get(100));
				}else if(i==700){
					sBfr.append(hMap.get(Integer.parseInt(String.valueOf(digits[0])))+" "+hMap.get(100));
				}else if(i==800){
					sBfr.append(hMap.get(Integer.parseInt(String.valueOf(digits[0])))+" "+hMap.get(100));
				}else if(i==900){
					sBfr.append(hMap.get(Integer.parseInt(String.valueOf(digits[0])))+" "+hMap.get(100));
				}else{
					//sBfr.append(digits[0]+" "+digits[1]+" "+digits[2]);
					
					if(Integer.parseInt(String.valueOf(digits[1])+String.valueOf(digits[2]))>=1 &&
							Integer.parseInt(String.valueOf(digits[1])+String.valueOf(digits[2]))<=10){
						sBfr.append(hMap.get(Integer.parseInt(String.valueOf(digits[0])))+" "+
								   hMap.get(100)+" "+
								   hMap.get(0)+" "+
								   hMap.get(Integer.parseInt(String.valueOf(digits[1])+String.valueOf(digits[2]))));
					}else if(Integer.parseInt(String.valueOf(digits[1])+String.valueOf(digits[2]))>10 &&
							Integer.parseInt(String.valueOf(digits[1])+String.valueOf(digits[2]))<=20){
						sBfr.append(hMap.get(Integer.parseInt(String.valueOf(digits[0])))+" "+
								   hMap.get(100)+" "+
								   hMap.get(0)+" "+
								   hMap.get(Integer.parseInt(String.valueOf(digits[1])+String.valueOf(digits[2]))));
					}else if(hMap.get(Integer.parseInt(String.valueOf(digits[1])+String.valueOf(digits[2])))!=null){
						sBfr.append(hMap.get(Integer.parseInt(String.valueOf(digits[0])))+" "+
								   hMap.get(100)+" "+
								   hMap.get(0)+" "+
								   hMap.get(Integer.parseInt(String.valueOf(digits[1])+String.valueOf(digits[2]))));
					}else{
						sBfr.append(hMap.get(Integer.parseInt(String.valueOf(digits[0])))+" "+
								   hMap.get(100)+" "+
								   hMap.get(0)+" "+
								   hMap.get(Integer.parseInt(String.valueOf(digits[1]))*10)+" "+
								   hMap.get(Integer.parseInt(String.valueOf(digits[2]))));
					}
				}
			}else if(i>999){
				sBfr.append(hMap.get(i));
			}else{
				sBfr.append(hMap.get(i));
			}
		}
		
		System.out.println(sBfr.toString().replaceAll(" ", "").length()); //21124
		
	}

}
