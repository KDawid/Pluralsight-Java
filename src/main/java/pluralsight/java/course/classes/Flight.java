package pluralsight.java.course.classes;

public class Flight {
	private int passengers;
	private int seats;
	
	public Flight() {
		seats = 150;
		passengers = 0;
	}
	
	public void add1Passenger() {
		if(passengers < seats)
			passengers += 1;
		else
			handleTooMany();
	}
	
	private void handleTooMany() {
		System.out.println("Too many");
	}
	
	public boolean hasRoom(Flight f2) {
		int total = this.passengers + f2.passengers;
		return total < this.seats;
	}
	
	public Flight createNewWithBoth(Flight f2) {
		Flight newFlight = new Flight();
		newFlight.seats = this.seats;
		newFlight.passengers = this.passengers + f2.passengers;
		return newFlight;
	}
	
	public int getPassengers() {
		return passengers;
	}
	
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	
	public int getSeats() {
		return seats;
	}
	
	public void setSeats(int seats) {
		this.seats = seats;
	}

}
