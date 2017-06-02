//Author: Avril Douglas

package robotp;

public class Robot {

	Head robotHead;
	BodyClass robotBody;
	Legs robotLegs;
	String robotName;

	public Robot(String rName) {
		this.robotName = rName;
		this.robotHead = new Head();
		this.robotBody = new BodyClass();
		this.robotLegs = new Legs();
		}
	
	@Override

	public String toString(){
		return "Robot [robotName=" + robotName + "]";
	}
	}
