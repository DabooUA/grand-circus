import java.util.Scanner;

public class Practise1 {
	public static void main(String[] args) {

		// Use the 'Scanner' to get input from the user
		Scanner scanner = new Scanner(System.in);

		// Get input from the user
		System.out.println("Enter your first number: ");

		int firstNumber = scanner.nextInt();

		System.out.println("Enter your second number: ");

		int secondNumber = scanner.nextInt();

		// Get the lengths of both numbers by converting numbers to strings and then
		// counting the length of the string
		int firstNumberLength = String.valueOf(firstNumber).length();
		int secondNumberLength = String.valueOf(secondNumber).length();

		// Validate: Make sure the lengths of both numbers are 3 digits each
		if (firstNumber < 99 || firstNumber > 999) {
			System.out.println("The first number you entered is invalid. Must be between 100 and 999.");
			return;
		}

		if (secondNumber < 99 || secondNumber > 999) {
			System.out.println("The second number you entered is invalid. Must be between 100 and 999.");
			return;
		}

		// FUN PART! Determine the individual digits of the first number using math

		int firstNumberHundredsDigit = firstNumber / 100;

		int firstNumberHundreds = firstNumberHundredsDigit * 100;

		int firstNumberTensDigit = (firstNumber - firstNumberHundreds) / 10;

		int firstNumberTens = firstNumberTensDigit * 10;

		int firstNumberOnesDigit = firstNumber - firstNumberHundreds - firstNumberTens;

		// NEXT FUN PART! Determine the individual digits of the second number using
		// math

		int secondNumberHundredsDigit = secondNumber / 100;

		int secondNumberHundreds = secondNumberHundredsDigit * 100;

		int secondNumberTensDigit = (secondNumber - secondNumberHundreds) / 10;

		int secondNumberTens = secondNumberTensDigit * 10;

		int secondNumberOnesDigit = secondNumber - secondNumberHundreds - secondNumberTens;

		// Totaling numbers together

		int hundredsNumberTotal = firstNumberHundredsDigit + secondNumberHundredsDigit;

		int tensNumberTotal = firstNumberTensDigit + secondNumberTensDigit;

		int onesNumberTotal = firstNumberOnesDigit + secondNumberOnesDigit;

		/*
		 * System.out.println(hundredsNumberTotal); System.out.println(tensNumberTotal);
		 * System.out.println(onesNumberTotal);
		 */

		if (hundredsNumberTotal == tensNumberTotal && tensNumberTotal == onesNumberTotal) {

			System.out.println("True! ");

		} else {
			// (hundredsNumberTotal != 8 || tensNumberTotal != 8 || onesNumberTotal != 8);{
			System.out.println("False! ");
		}

	}
}
