import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Names scores
 * Problem 22
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over 
 * five-thousand first names, begin by sorting it into alphabetical order. 
 * Then working out the alphabetical value for each name, 
 * multiply this value by its alphabetical position in the list to obtain a name score.
 * For example, when the list is sorted into alphabetical order, COLIN, 
 * which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. 
 * So, COLIN would obtain a score of 938 × 53 = 49714.
 * What is the total of all the name scores in the file?

 */

/**
 * @author p541832
 *
 */
public class Prob_22 {

	/**
	 * 
	 */
	public Prob_22() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> alphMap = new HashMap<Character,Integer>();
		ArrayList<String> namesList = new ArrayList<String>();
		HashMap<Integer, String> namesMap = new HashMap<Integer, String>();
		int cnt=1;
		for(char ch='A';ch<='Z';ch++){
			//System.out.println(ch+" "+cnt);
			alphMap.put(ch, cnt);
			cnt++;
		}
		
		try {
			String str = "";
			for (String line : Files.readAllLines(Paths.get("C:/temp/p022_names.txt"))) {
			//	System.out.println(line);
				str = line;
			}
			//System.out.println(str);
			String[] splitStr = str.replace("\"","").split(",");
			
			for(int j=0;j<splitStr.length;j++){
				namesList.add(splitStr[j]);
			}
			Collections.sort(namesList);
			
			System.out.println(namesList.size());
			
			for(int k=0;k<namesList.size();k++){
				namesMap.put(k,namesList.get(k));
			}
			
			BigInteger totalSum = BigInteger.ZERO;
			BigInteger bigTotal = BigInteger.ZERO;
			BigInteger totalmul = BigInteger.ONE;
			BigInteger index = BigInteger.ONE;
			String name= "";
			for(int p=0;p<namesMap.size();p++){
				name = namesMap.get(p).trim().toString();
				for(int l=0;l<name.length();l++){
					System.out.println(namesMap.get(p)+" "+name.charAt(l)+" "+alphMap.get(name.charAt(l)));
					totalSum = totalSum.add(new BigInteger(String.valueOf(alphMap.get(name.charAt(l)))));
				}
				
				totalmul =  totalSum.multiply(index);
				bigTotal = bigTotal.add(totalmul);
				System.out.println(totalSum+ " *  "+index+" = "+totalmul);
				index = index.add(BigInteger.ONE);
				totalSum = BigInteger.ZERO;
				
			}
			System.out.println(bigTotal); //import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Names scores
 * Problem 22
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over 
 * five-thousand first names, begin by sorting it into alphabetical order. 
 * Then working out the alphabetical value for each name, 
 * multiply this value by its alphabetical position in the list to obtain a name score.
 * For example, when the list is sorted into alphabetical order, COLIN, 
 * which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. 
 * So, COLIN would obtain a score of 938 × 53 = 49714.
 * What is the total of all the name scores in the file?

 */

/**
 * @author p541832
 *
 */
public class Prob_22 {

	/**
	 * 
	 */
	public Prob_22() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> alphMap = new HashMap<Character,Integer>();
		ArrayList<String> namesList = new ArrayList<String>();
		HashMap<Integer, String> namesMap = new HashMap<Integer, String>();
		int cnt=1;
		for(char ch='A';ch<='Z';ch++){
			//System.out.println(ch+" "+cnt);
			alphMap.put(ch, cnt);
			cnt++;
		}
		
		try {
			String str = "";
			for (String line : Files.readAllLines(Paths.get("C:/temp/p022_names.txt"))) {
			//	System.out.println(line);
				str = line;
			}
			//System.out.println(str);
			String[] splitStr = str.replace("\"","").split(",");
			
			for(int j=0;j<splitStr.length;j++){
				namesList.add(splitStr[j]);
			}
			Collections.sort(namesList);
			
			System.out.println(namesList.size());
			
			for(int k=0;k<namesList.size();k++){
				namesMap.put(k,namesList.get(k));
			}
			
			BigInteger totalSum = BigInteger.ZERO;
			BigInteger bigTotal = BigInteger.ZERO;
			BigInteger totalmul = BigInteger.ONE;
			BigInteger index = BigInteger.ONE;
			String name= "";
			for(int p=0;p<namesMap.size();p++){
				name = namesMap.get(p).trim().toString();
				for(int l=0;l<name.length();l++){
					System.out.println(namesMap.get(p)+" "+name.charAt(l)+" "+alphMap.get(name.charAt(l)));
					totalSum = totalSum.add(new BigInteger(String.valueOf(alphMap.get(name.charAt(l)))));
				}
				
				totalmul =  totalSum.multiply(index);
				bigTotal = bigTotal.add(totalmul);
				System.out.println(totalSum+ " *  "+index+" = "+totalmul);
				index = index.add(BigInteger.ONE);
				totalSum = BigInteger.ZERO;
				
			}
			System.out.println(bigTotal); //871198282
			//System.out.println(Long.MAX_VALUE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

			//System.out.println(Long.MAX_VALUE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
