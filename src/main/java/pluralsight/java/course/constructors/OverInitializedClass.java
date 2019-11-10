package pluralsight.java.course.constructors;

public class OverInitializedClass {
	private int theField = 1; // first

	public int getTheField() {
		return theField;
	}

	{
		theField = 2; // second
	}

	public OverInitializedClass() {
		theField = 3; // third
	}
}
