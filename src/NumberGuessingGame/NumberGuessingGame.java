package NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

// Game where a player guesses a number that the computer picks. 
public class NumberGuessingGame {

	private static final int guesses = 3;
	private static int chances = guesses;
	private static int playerGuess = -1;
	private static int computerSelection = -1;
	private static boolean testingActive = true;
	private static Scanner input = new Scanner(System.in);
	
	public NumberGuessingGame(int range) {
		Random computerPicker = new Random();
		computerSelection = computerPicker.nextInt(range);
		if (testingActive) {
			System.out.println("Number picked is: " + computerSelection);
		} // if
	} // constructor

	public static void main(String[] args) {
		// Computer number is picked.
		do {
			System.out.print("Please pick a positive number for the maximum value: ");
			int pick = input.nextInt();

			if (pick > -1) {
				NumberGuessingGame ngg = new NumberGuessingGame(pick);
				break;
			} else {
				System.out.println("Not a correct guess. Try again.");
			} // if
		} while (true);
		
		// Player input is checked.
		do {
			System.out.print("Please guess a number: ");
			if (input.hasNextInt()) {
				playerGuess = input.nextInt();
			} else {
				System.out.println("Not a correct guess. Try again.");
				continue;
			} // if
		
			if (playerGuess == computerSelection) {
				System.out.println("YOU WIN!");
				break;
			} else {
				chances--;
				if (chances == 0) {
					System.out.println("YOU HAVE LOST!");
					break;
				} // if
				System.out.println("Try again...");
			} // if
		} while (chances > 0);
	} // main
} // class
