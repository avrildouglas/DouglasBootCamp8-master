package robotp;

import java.util.ArrayList;

public class JavaRobotApp {
	
	public static void main(String[] args) {
		ArrayList<String> xstring = new ArrayList<String>();
		
		xstring.add("One");
		xstring.add("Two");
		xstring.add("Three");
		
		
		Robot myNewRobot = new Robot("myNewRobot");
		print (myNewRobot.robotHead.shake());
		print (myNewRobot.robotBody.move());
		print (myNewRobot.robotLegs.kick());
		
		Robot Fifi = new Robot("Fifi");
		Robot Dave = new Robot("Dave");
		
		ArrayList<Robot>myRobots = new ArrayList<Robot>();
		
		myRobots.add(Fifi);
		myRobots.add(Dave);
		myRobots.add(myNewRobot);
		
		print("myNewRobot is # "+ (myRobots.indexOf(myNewRobot)+1)+" in the list");
		print("There are "+ (myRobots.size()+" robots in myRobots"));
		
		print(myRobots.toString());
	}
	private static void print(String s)
	{
		System.out.println(s);
	}

}
