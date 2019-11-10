package pluralsight.java.course.classes;

public class Main {

	public static void main(String[] args) {
		flights();
		myClass();
		flights2();
		math();
		flights3();

	}

	private static void flights() {
		Flight flight1 = new Flight();
		Flight flight2 = new Flight();

		flight2.add1Passenger();
		System.out.println(flight2.getPassengers());

		flight2 = flight1;
		System.out.println(flight2.getPassengers());

		flight1.add1Passenger();
		flight1.add1Passenger();

		System.out.println(flight2.getPassengers());
	}

	private static void myClass() {
		MyClass m = new MyClass();
		m.showSum(7.5f, 1.4f, 3);
		System.out.println("I'm back!");
	}

	private static void flights2() {
		Flight lax1 = new Flight();
		Flight lax2 = new Flight();

		Flight lax3 = null;
		if (lax1.hasRoom(lax2))
			lax3 = lax1.createNewWithBoth(lax2);
		if (lax3 != null)
			System.out.println(lax3.getPassengers());
	}

	private static void math() {
		MathEquation[] equations = new MathEquation[4];
		equations[0] = create(100.0d, 50.0d, 'd');
		equations[1] = create(25.0d, 92.0d, 'a');
		equations[2] = create(225.0d, 17.0d, 's');
		equations[3] = create(11.0d, 3.0d, 'm');

		for (MathEquation equation : equations) {
			equation.execute();
			System.out.print("result = ");
			System.out.println(equation.getResult());
		}

	}

	public static MathEquation create(double leftVal, double rightVal, char opCode) {
		MathEquation equation = new MathEquation();
		equation.setLeftVal(leftVal);
		equation.setRightVal(rightVal);
		equation.setOpCode(opCode);

		return equation;
	}

	private static void flights3() {
		Flight slcToNyc = new Flight();
		slcToNyc.setSeats(150);
		System.out.println(slcToNyc.getSeats());
	}

}
