package mowing;

import java.util.Scanner;

public class CalculateMowingAct {

    public static void main( String[] args )
   {
   		Scanner keyboard = new Scanner(System.in); 
    	double length;
    	double width;
    	double squareyard;
    	double amttime;
    	double amthours = 0;
    	double amtmins;

    	System.out.print("What is the length of the lawn? ");
    	length = keyboard.nextDouble();
    	
       	System.out.print("What is the width of the lawn? ");
       	width = keyboard.nextDouble();     	
 
       	squareyard = length * width;
       	amttime = squareyard / 20;
       	//amthours = amttime / 60;
       	//amtmins = amttime % 60; 
   
       	if (amttime > 60)
       		amthours = amttime / 60;
       		amtmins = amttime % 60; 
            System.out.println("It takes " + amthours + "hours and " + amtmins +" minutes to mow the lawn.");

      // 	amttime = amthours + ":" + amtmins;
   //       else if (amttime < 61)
 //          	amttime = squareyard / 20;
        
        System.out.println("The length of the lawn is: " + length + " yards.");
        System.out.println("The width of the lawn is: " + width + " yards.");
        System.out.println("The square yardage of the lawn is: " + squareyard + " sq yd.");
      //  System.out.println("It takes " + amttime + " minutes to mow the lawn.");
       
        System.out.println("It takes " + amthours + " hours and " + amtmins +" minutes to mow the lawn.");
      }
}