import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Largest product in a grid
 * 

In the 20×20 grid below, four numbers along a diagonal line have been marked in red.

08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08
49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00
81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65
52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91
22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80
24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50
32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70
67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21
24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72
21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95
78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92
16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57
86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58
19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40
04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66
88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69
04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36
20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16
20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54
01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48

08 02 22 97 
49 49 99 40  
81 49 31 73 
52 70 95 23 

The product of these numbers is 26 × 63 × 78 × 14 = 1788696.

What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?

 */

/**
 * @author Venkat
 *
 */
public class Prob_11 {

	/**
	 * 
	 */
	public Prob_11() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bigNum = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08 " +
						"49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00 " +
						"81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65 " +
						"52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91 " +
						"22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80 " +
						"24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50 " +
						"32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70 " +
						"67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21 " +
						"24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72 " +
						"21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95 " +
						"78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92 " +
						"16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57 " +
						"86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58 " +
						"19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40 " +
						"04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66 " +
						"88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69 " +
						"04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36 " +
						"20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16 " +
						"20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54 " +
						"01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48 ";
		
		int[][] smallNums = new int[20][20];
		String[] strArray = bigNum.split(" ");
		
		/** Store all the 2 digit numbers in array **/
		int arrayIndex = 0;
		for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					//System.out.println(i+" "+j);
					smallNums[i][j] = Integer.parseInt(strArray[arrayIndex]);
					arrayIndex++;
				} 
			}

		
		//System.out.println(smallNums.length);
		
		int prod = 1;
		List<Integer> list = new ArrayList<>();
		//Iterate Array of integers and then print the values
		for(int p=0;p<20;p++){
			for(int q=0;q<20;q++){
				if(p-3<0||q-3<0||p+3>19||q+3>19){
					continue;
				}else{
					prod = 1;
					for(int a=0;a<4;a++){
						prod = prod * smallNums[p][a];
						list.add(prod);
						//System.out.println(p+" "+a+" "+smallNums[p][a]+" "+prod);
					}
					
					
					prod = 1;
					for(int b=0;b<4;b++){
						prod = prod * smallNums[b][q];
						list.add(prod);
						//System.out.println(b+" "+q+" "+smallNums[b][q]+" "+prod);
					}
					
					
					prod = 1;
					for(int s=4;s>0;s--){
						prod = prod * smallNums[p][s];
						list.add(prod);
						//System.out.println(p+" "+s+" "+smallNums[p][s]+" "+prod);
					}
					
					
					prod = 1;
					for(int t=4;t>0;t--){
						prod = prod * smallNums[t][q];
						list.add(prod);
						//System.out.println(t+" "+q+" "+smallNums[t][q]+" "+prod);
					}
					
					
					prod = 1;
					for(int n=0;n<4;n++){
						prod = prod * smallNums[p+n][q+n];
						list.add(prod);
						//System.out.println(p+n+" "+q+n+" "+smallNums[p+n][q+n]+" "+prod);
					}
					
					
					prod = 1;
					for(int d=0;d<4;d++){
						prod = prod * smallNums[p-d][q-d];
						list.add(prod);
						//System.out.println(p-d+" "+(q-d)+" "+smallNums[p-d][q-d]+" "+prod);
					}
					
					
					prod = 1;
					
					for(int n=0;n<4;n++){
							prod = prod * smallNums[p+n][q-n];
							list.add(prod);
							//System.out.println(p+n+" "+(q-n)+" "+smallNums[p+n][q-n]+" "+prod);
						}
				
					
					
					prod = 1;

					for(int m=0;m<4;m++){
						prod = prod * smallNums[p-m][q+m];
						list.add(prod);
						//System.out.println(p-m+" "+q+m+" "+smallNums[p-m][q+m]+" "+prod);
					}
					
					//System.out.println(smallNums[p][q]+" "+p+" "+q);
				}
				//System.out.println("cnt++; "+cnt);
				//System.out.println(smallNums[p-3][q-3]);
				//System.out.println(smallNums[p][q]+" "+p+" "+q);
			}
		}
		
		Collections.sort(list);
		System.out.println(Collections.max(list));//70600674
		
		
	}

}
