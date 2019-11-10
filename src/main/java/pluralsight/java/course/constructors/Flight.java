package pluralsight.java.course.constructors;

public class Flight {
	private int flightNumber, passengers, seats = 150;
	private boolean[] isSeatAvailable;
	private char flightClass;

	// Initialization block
	{
		isSeatAvailable = new boolean[seats];

		for (int i = 0; i < seats; i++) {
			isSeatAvailable[i] = true;
		}
	}

	public Flight() {
	}

	public Flight(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Flight(char flightClass) {
		this.flightClass = flightClass;
	}

}
