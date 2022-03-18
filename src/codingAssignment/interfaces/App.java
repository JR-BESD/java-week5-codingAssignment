package codingAssignment.interfaces;

public class App {

	public static void main(String[] args) {
		
			
		AsteriskLogger aLog = new AsteriskLogger();
		System.out.println("Asterisk log:");
		aLog.log("Abstraction");
		System.out.println();
		System.out.println("Asterisk error:");
		aLog.error("Encapsulation");
		System.out.println();
		
		SpacedLogger sLog = new SpacedLogger();
		System.out.println("Spaced log:");
		sLog.log("Inheritance");
		System.out.println();
		System.out.println("Spaced error:");
		sLog.error("Polymorphism");

	}

}
