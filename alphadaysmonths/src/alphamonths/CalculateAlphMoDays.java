package alphamonths;

import java.util.Scanner;

public class CalculateAlphMoDays {
	public static void main(String []args){ 
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in); 
		int numDays = 0;
		//String Month; 
 		//String Month = sc.next();	
	//	do {	
			System.out.println("Please enter first 3 letters of a month: ");
	 		String Month = sc1.next();
 /**       if (Month.equalsIgnoreCase("Feb"))
        	 numDays = 28;
        else if (Month.equalsIgnoreCase("Jan") || Month.equalsIgnoreCase("Mar") || Month.equalsIgnoreCase("May") || Month.equalsIgnoreCase("Jul") || Month.equalsIgnoreCase("Aug") 
                    || Month.equalsIgnoreCase("Oct") || Month.equalsIgnoreCase("Dec"))
            numDays = 31;
        else
            numDays = 30;  **/   
	    System.out.println("The number of days in :" + Month + " is " + numDays);
	/**	} while (MonthNum > 0 || MonthNum < 13);
       System.out.println(Month);    
		while (MonthNum < 13);
		while (MonthNum > 0 || MonthNum < 13);**/
  }
}