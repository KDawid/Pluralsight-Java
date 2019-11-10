package pluralsight.java.course.constructors;

public class Passenger {
	private int checkedBags;
	private int freeBags;

	private double perBagFee;

	public Passenger() {
		// automatically generated if no other constructors are present
	}

	public Passenger(int freeBags) {
		this(freeBags > 1 ? 25.0d : 50.0d); // Last constructor called
		this.freeBags = freeBags;
	}

	public Passenger(int freeBags, int checkedBags) {
		this(freeBags); // Constructor chain
		this.checkedBags = checkedBags;
	}

	public Passenger(double perBagFee) {
		this.perBagFee = perBagFee;
	}

	public static void main(String[] args) {
		Passenger fred = new Passenger(2); // (int) --> double
		Passenger jane = new Passenger(2, 3); // (int, int) --> (int) --> double
	}

}
