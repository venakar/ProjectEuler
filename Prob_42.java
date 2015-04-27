import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Coded triangle numbers
Problem 42

The nth term of the sequence of triangle numbers is given by, tn = ½n(n+1); so the first ten triangle numbers are:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

By converting each letter in a word to a number corresponding to its alphabetical position and adding these values we form a word value. For example, the word value for SKY is 19 + 11 + 25 = 55 = t10. If the word value is a triangle number then we shall call the word a triangle word.

Using words.txt (right click and 'Save Link/Target As...'), a 16K text file containing nearly two-thousand common English words, how many are triangle words?

 */

/**
 * @author p541832
 *
 */
public class Prob_42 {

	/**
	 * 
	 */
	public Prob_42() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double triangleNum=0;
		int cnt=1;
		ArrayList<Integer> traingleNums = new ArrayList<Integer>();
		HashMap<Character,Integer> alphMap = new HashMap<Character,Integer>();
		ArrayList<String> namesList = new ArrayList<String>();
		
		for(int i=1;i<100;i++){
			triangleNum=(0.5)*(i)*(i+1);
			traingleNums.add((int) triangleNum);
		}
		
	/*	for(int t=0;t<traingleNums.size();t++)
			System.out.println(t+" "+traingleNums.get(t)); */
		
		for(char ch='A';ch<='Z';ch++){
			alphMap.put(ch, cnt);
			cnt++;
		}
		
		try {
			String str = "";
			for (String line : Files.readAllLines(Paths.get("C:/temp/p042_words.txt"))) {
			str = line;
			}
			String[] splitStr = str.replace("\"","").split(",");
			//System.out.println(splitStr[splitStr.length-1]);
			for(int j=0;j<splitStr.length;j++){
				namesList.add(splitStr[j]);
			}
			Collections.sort(namesList);			
			System.out.println(namesList.size());
			
			int sum=0;
			int size=0;
			int counter=0;
			for(int k=0;k<namesList.size();k++){
				size=namesList.get(k).length();
				//System.out.println(namesList.get(k)); //
				for(int p=0;p<size;p++){
					//System.out.println(alphMap.get(namesList.get(k).charAt(p))); //
					sum = sum + alphMap.get(namesList.get(k).charAt(p));
				}
				//System.out.println(sum); //
				if(traingleNums.contains(sum)){
					counter++;
				}
				sum=0;	
			}
			
			System.out.println(counter); //162
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
