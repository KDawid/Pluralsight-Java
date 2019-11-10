package pluralsight.java.course;

public class ConditionalLogic {

	/**
	 * Conditional Logic, Looping and Arrays
	 * @param args
	 */
	public static void main(String[] args) {
		conditionalLogic();
		blockStatements();
		logicalOperators();
		demoCalcEngine();
		looping();
		switchStatement();
		demoCalcEngine2();
	}

	private static void conditionalLogic() {
		// >, >=, <, <=, ==, !=

		// result = condition ? true-value : false-value;

		// if (condition) {
		//	true-statement;
		// }
		// else {
		//	false-statement
		// }

		// if-else statements can chained together (else if)

		conditionalExample();
	}

	private static void conditionalExample() {
		float students = 0.0f;
		float rooms = 4.0f;

		if (students > 0.0f) {
			if (rooms > 0.0f)
				System.out.println(students / rooms);
		} else
			System.out.println("No students");

		System.out.println();
		System.out.println("** end program **");
	}

	private static void blockStatements() {
		// A variable declared within a block is not visible outside of the block
		float students = 30.0f;
		float rooms = 0.0f;

		if (rooms > 0.0) {
			System.out.println(students);
			System.out.println(rooms);
			float avg = students / rooms;
			System.out.println(avg);
		}
		//System.out.println(avg); --> Compilation error
	}

	private static void logicalOperators() {
		// and			&&
		// or			|
		// xor			^
		// negation		!

		// conditional and	&& (only executes right-side if left-side is true)
		// conditional or || (only executes right-side if left side is false)

		logicalExample();
	}

	private static void logicalExample() {
		int students = 150;
		int rooms = 0;

		if (rooms > 0 && students / rooms > 30)
			//first part is false so second is not executed
			System.out.println("Crowded!");

		System.out.println();
		System.out.println("** end program **");
	}

	private static void demoCalcEngine() {
		double val1 = 100.0d;
		double val2 = 50.0d;
		double result;
		char opCode = 'd';

		if (opCode == 'a')
			result = val1 + val2;
		else if (opCode == 's')
			result = val1 - val2;
		else if (opCode == 'd') {
			result = val2 != 0.0d ? val1 / val2 : 0.0d;
		} else if (opCode == 'm')
			result = val1 * val2;
		else {
			System.out.println("Error - invalid opCode");
			result = 0.0d;
		}

		System.out.println(result);
	}

	private static void looping() {
		whileLoop();
		doWhileLoop();
		forLoop();
		arrays();
		forEachLoop();
	}

	private static void whileLoop() {
		// while (condition)
		//		statement;

		// repeatedly executes a statement as long as the condition is true
		//     contition checked at loop start
		//     statement may never execute

		int kVal = 5;
		int factorial = 1;

		while (kVal > 1) {
			factorial *= kVal;
			kVal -= 1;
			//factorial *= kVal--;
		}
		System.out.println(factorial);

	}

	private static void doWhileLoop() {
		// do
		//     statement;
		// while (condition);

		// repeatedly executes a statement as long as the condition is true
		//     contition checked at loop end
		//     statement always executes at least once

		int iVal = 5;
		do {
			System.out.print(iVal);
			System.out.print(" * 2 = ");
			iVal *= 2;
			System.out.println(iVal);
		} while (iVal < 100);
	}

	private static void forLoop() {
		// for (initialize; condition; update)
		//     statement;

		// repeatedly executes a statement as long as the condition is true
		//     contition checked at loop start
		//     provides simplified notation for loop control values

		for (int iVal = 1; iVal < 100; iVal *= 2) {
			System.out.println(iVal);
		}
	}

	private static void arrays() {
		// Provides an ordered collection of elements
		// each element accessed via an index
		// indexes range from 0 to number-of-elements minus 1

		// float[] theVals = new float[3];
		// theVals[0] = 10.0f;
		// theVals[1] = 20.0f;
		// theVals[2] = 15.0f;

		float[] theVals = { 10.0f, 20.0f, 15.0f };

		float sum = 0.0f;
		for (int i = 0; i < theVals.length; i++)
			sum += theVals[i];

		System.out.println(sum);
	}

	private static void forEachLoop() {
		// for (loop-variable-declaration : array)
		//     statement;

		// Executes a statement once for each member in an array
		// - handles getting collection length
		// - handles accessing each value

		float[] theVals = { 10.0f, 20.0f, 15.0f };
		float sum = 0.0f;
		for (float currentVal : theVals)
			sum += currentVal;

		System.out.println(sum);
	}

	private static void switchStatement() {
		// switch (test-value) {
		// case value-1:
		//     statements
		// case value-2:
		//     statements
		// ...
		// case value-n:
		//     statements
		// default:
		//     statements

		// Transfers control to a statement based on a value
		// - simplifies testing against multiple possible matches
		// - only primitive types supported are char and integers
		// - a match can execute more than one statement
		// - use break to aboid 'falling through'
		// - can optionally include default to handle any unmatched values

		int iVal = 25;

		switch (iVal % 2) {
		case 0:
			System.out.print(iVal);
			System.out.println(" is even");
			break;
		case 1:
			System.out.print(iVal);
			System.out.println(" is odd");
			break;
		default:
			System.out.println("oops it broke");
			break;
		}
	}

	private static void demoCalcEngine2() {
		double[] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d };
		double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
		char[] opCodes = { 'd', 'a', 's', 'm' };
		double[] results = new double[opCodes.length];

		for (int i = 0; i < opCodes.length; i++) {
			switch (opCodes[i]) {
			case 'a':
				results[i] = leftVals[i] + rightVals[i];
				break;
			case 's':
				results[i] = leftVals[i] - rightVals[i];
				break;
			case 'd':
				results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
				break;
			case 'm':
				results[i] = leftVals[i] * rightVals[i];
				break;
			default:
				System.out.println("Error - invalid opCode");
				results[i] = 0.0d;
				break;
			}

		}

		for (double theResult : results) {
			System.out.print("result = ");
			System.out.println(theResult);
		}

	}

}
