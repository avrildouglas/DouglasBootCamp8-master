package testme;
import java.util.Locale;
import java.util.Scanner;

public class TestMeNow {

	   public static void main(String[] args) {

	   String s;
	   //= "Hello World! 3 + 3.0 = 6 true";

	   // create a new scanner with the specified String Object
 		//Scanner keyboard = new Scanner(System.in);
	   Scanner scanner = new Scanner(System.in);

	   // use US locale to be able to identify doubles in the string
	   scanner.useLocale(Locale.US);

	   // find the next double token and print it
	   // loop for the whole scanner
	   while (scanner.hasNext()) {

	   // if the next is a double, print found and the double
	   if (scanner.hasNextDouble()) {
		   
	   System.out.println("enter double :");
	   s = scanner.next();
	   //+ scanner.nextDouble());
	   }

	   // if a double is not found, print "Not Found" and the token
	   System.out.println("Not Found :" + scanner.next());
	   }

	   // close the scanner
	   scanner.close();
	   }
	}