package test;
import java.util.Scanner;
public class testme {
  public static void main(String[] args) {
    char grade;
    String input;
    @SuppressWarnings("resource")
	Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter grade awarded");

    input = keyboard.nextLine();

    grade = input.charAt(0);

    switch (grade) {
      case 'A':
        System.out.println("Grade was between 89.5 and 100");
        break;  
      case 'B':
        System.out.println("Grade was between 79.5 and 89.49"); 
        break;  
      case 'C':
        System.out.println("Grade was between 69.5 and 79.49");
        break; 
      case 'D':
        System.out.println("Grade was between 59.5 and 69.49");
        break;
      case 'F':
        System.out.println("Grade was below 59.5");
        break;
      default:
        System.out.println("Invalid grade inputted");
        break;
    }
  }
}