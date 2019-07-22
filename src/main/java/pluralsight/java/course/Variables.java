package pluralsight.java.course;

public class Variables {
	/**
	 * Variables, Data Types and Math Operators
	 */
	public static void main(String[] args) {
		variables();
		dataTypes();
		arithmeticOperators();
		operatorPrecedence();
		typeConversion();
	}

	private static void variables() {
		int myVar;

		myVar = 50;
		System.out.println(myVar);

		int anotherVar = 100;
		System.out.println(anotherVar);

		anotherVar = 200;
		System.out.println(anotherVar);

		System.out.println(myVar);
	}

	private static void dataTypes() {
		///////////////////
		// Integer types //
		///////////////////

		byte numberOfEnglishLetters = 26;
		short feetInAMile = 5280;
		int milesToSun = 92960000;
		long nationalDebt = 18100000000000L;

		//////////////////////////
		// Floating point types //
		//////////////////////////

		float milesInAMarathon = 26.2f;
		double atomWidthInMeters = 0.0000000001d;

		/////////////////////////////////
		// Character and boolean types //
		/////////////////////////////////

		char regularU = 'U';
		char accentedU = '\u00DA';

		boolean iLoveJava = true;

		System.out.println("Primitive types are stored by value");
	}

	private static void arithmeticOperators() {
		/*
		 * Add			+
		 * Subtract		-
		 * Multiply		*
		 * Divide		/
		 * Modulus		%
		 */

		// Prefix / Postfix operators ++, --
		int myVal = 5;
		System.out.println(++myVal);
		System.out.println(myVal);

		myVal = 5;
		System.out.println(myVal++);

		//Compound assignment: +=, -=, *=, /=, %=
		myVal = 50;
		myVal -= 5;
		System.out.println(myVal);

		int result = 100;
		int val1 = 5;
		int val2 = 10;
		result /= val1 * val2;
		System.out.println(result);
	}

	private static void operatorPrecedence() {
		/*
		 * Postfix: x++, x--
		 * Prefix: ++x, --x
		 * Multiplicative: *, /, %
		 * Additive: +, -
		 */

		int valA = 21;
		int valB = 6;
		int valC = 3;
		int valD = 1;

		int result1 = valA - valB / valC;

		int result2 = (valA - valB) / valC;

		System.out.println(result1);
		System.out.println(result2);

		int result3 = valA / valC * valD + valB;
		int result4 = valA / (valC * (valD + valB));

		System.out.println(result3);
		System.out.println(result4);
	}

	private static void typeConversion() {

		//Implicit
		int iVal = 50;
		long lVal = iVal;

		//Explicit
		iVal = (int) lVal;

		//Implicit: to wider integer

		/* Explicit:
		 *     Can widening and narrowing
		 *     Floating point to integer drops fraction
		 *     Use caution with narrowing conversions
		 *     Integer to floating point can lose precision
		 */

		float fVal = 1.0f;
		double dVal = 4.0d;
		byte bVal = 7;
		short sVal = 7;
		lVal = 5;

		short result1 = (short) lVal;
		short result2 = bVal;

		short result3 = (short) (bVal - lVal);

		long result4 = (long) (lVal - fVal);
		float result5 = lVal - fVal;

		float result6 = (float) (lVal - dVal);

		long result7 = sVal - lVal;
		long result8 = (long) (sVal - lVal + dVal);

		System.out.println("Success");
	}
}
