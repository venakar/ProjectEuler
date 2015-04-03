import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 * Counting Sundays
Problem 19

You are given the following information, but you may prefer to do some research for yourself.

    1 Jan 1900 was a Monday.
    Thirty days has September, April, June and November.
    All the rest have thirty-one,
    Saving February alone,
    Which has twenty-eight, rain or shine.
    And on leap years, twenty-nine.
    A leap year occurs on any year evenly divisible by 4, 
    but not on a century unless it is divisible by 400.

How many Sundays fell on the first of the month during 
the twentieth century (1 Jan 1901 to 31 Dec 2000)?

 */

/**
 * @author Venkat
 *
 */
public class Prob_19 {

	/**
	 * 
	 */
	public Prob_19() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hMonth = new HashMap<Integer, Integer>();
		HashMap<Integer, String> hWeek = new HashMap<Integer, String>();
		hMonth.put(1, 31);
		hMonth.put(2, 28);
		hMonth.put(3, 31);
		hMonth.put(4, 30);
		hMonth.put(5, 31);
		hMonth.put(6, 30);
		hMonth.put(7, 31);
		hMonth.put(8, 31);
		hMonth.put(9, 30);
		hMonth.put(10, 31);
		hMonth.put(11, 30);
		hMonth.put(12, 31);
		
		hWeek.put(1, "Mon");
		hWeek.put(2, "Tue");
		hWeek.put(3, "Wed");
		hWeek.put(4, "Thu");
		hWeek.put(5, "Fri");
		hWeek.put(6, "Sat");
		hWeek.put(0, "Sun");
		
		int monthDays=0;
		int day = 0;
		int sundays = 0;
		for(int i=1901;i<2000;i++){
			for(int j=1;j<=hMonth.size();j++){
				if(j==2 && i%4==0 && i!=1900){
					monthDays = hMonth.get(j) +1;
				}else{
					monthDays = hMonth.get(j);
				}
					for(int k=1;k<=monthDays;k++){
							day++; 
							//System.out.println(k+"-"+j+"-"+i+" "+hWeek.get(day%7));//+" "+hWeek.get(k%7)
							if(hWeek.get(day%7).equals("Sun") && k==1)
								sundays++;
					}
			}
		}
		System.out.println("Num of sundays which fell on 1st of every month between 1901 to 2000 is "+sundays); 
		
		//Solution based on Java Utility Calendar
		/* Calendar start = GregorianCalendar.getInstance();
		 
	        start.set(start.MONTH, start.JANUARY);
	        start.set(start.DATE, 1);
	        start.set(start.YEAR, 1901);
	        
	        Calendar end = GregorianCalendar.getInstance();
	        end.set(end.MONTH, end.DECEMBER);
	        end.set(end.DATE, 31);
	        end.set(end.YEAR, 2000);
	        
	        int out = 0;
	        while (start.before(end)) {
	            if (start.get(start.DAY_OF_WEEK) == start.SUNDAY && 
	                            start.get(start.DAY_OF_MONTH) == 1) {
	               // System.out.println(start);
	                out ++;
	            }
	            start.add(Calendar.MONTH, 1);
	        }
	        System.out.println(out);  */
	}

}
