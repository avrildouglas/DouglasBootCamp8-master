package classroom406;
import java.util.Scanner;

public class CalculateDaysInMonth{

	public static void main(String[] args) {
 
		int numDays;
        String Month; 
       //int MonthNum;
		Scanner scannerInput = new Scanner(System.in);  
		
		int MonthNum = scannerInput.nextInt();
		while (MonthNum > 0 || MonthNum < 13){
			System.out.println("Please enter the month: " + MonthNum);
        if (MonthNum == 2)
        	 numDays = 28;
        else if (MonthNum == 1 || MonthNum == 3 || MonthNum == 5 || MonthNum == 7 || MonthNum == 8 
                    || MonthNum == 10 || MonthNum == 12)
            numDays = 31;
        else
            numDays = 30;
        
     /**   if (MonthNum == 1)
            Month = "January";
        else if (MonthNum == 2)
            Month = "February";
        else if (MonthNum == 3)
            Month = "March";
        else if (MonthNum == 4)
            Month = "April";
        else if (MonthNum == 5)
            Month = "May";
        else if (MonthNum == 6)
            Month = "June";
        else if (MonthNum == 7)
            Month = "July";
        else if (MonthNum == 8)
            Month = "August";
        else if (MonthNum == 9)
            Month = "September";
        else if (MonthNum == 10)
            Month = "October";
        else if (MonthNum == 11)
            Month = "November";
        else if (MonthNum == 12)
            Month = "December"; **/
	    System.out.println("The number of days in month " + MonthNum + " is " + numDays);
       // System.out.println(Month);
	}	    
		//while (MonthNum < 13);
		//while (MonthNum > 0 || MonthNum < 13);
  }
}
