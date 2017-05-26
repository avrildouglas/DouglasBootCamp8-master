package nummonths;

import java.util.Scanner;

public class CalculateMoDays {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		int numDays;
		//String Month; 
 		int MonthNum = sc.nextInt();	
	//	do {
			System.out.println("Please enter the month: ");
        if (MonthNum == 2)
        	 numDays = 28;
        else if (MonthNum == 1 || MonthNum == 3 || MonthNum == 5 || MonthNum == 7 || MonthNum == 8 
                    || MonthNum == 10 || MonthNum == 12)
            numDays = 31;
        else
            numDays = 30;      
   	    System.out.println("The number of days in month " + MonthNum + " is " + numDays);
	/**	} while (MonthNum > 0 || MonthNum < 13);
       System.out.println(Month);    
		while (MonthNum < 13);
		while (MonthNum > 0 || MonthNum < 13);**/
  }
}