package NumberGuessingGame;

import java.util.Scanner;

// Game where a player guesses a number that the computer picks. 
public class NumberGuessingGame {

	public NumberGuessingGame() {

	} // constructor

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please guess a number: ");

		if (input.hasNextInt()) {
			int guess = input.nextInt();
			System.out.println(guess);
		} else {
			System.out.println("Not a correct guess. Try again.");
		} // if
	} // main

} // class
