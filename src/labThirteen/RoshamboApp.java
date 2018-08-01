package labThirteen;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Rock, Paper, Scissors Game!\n");
		String cont = "y";
		// create user as a human player
		String humanName = Validator.getString(scnr, "Please enter your name: ");
		System.out.println("Hello " + humanName + ".");
		HumanPlayer human = new HumanPlayer(humanName, scnr);
		do {
			// creates challenger as a computer player
			int opponent = Validator.getInt(scnr,
					"Who would you like to play against? Enter 1 for Rambo or 2 for Rocky: ", 1, 2);

			Player challenger;
			if (opponent == 1) {
				challenger = new RandomPlayer("Rambo");
				System.out.println("You are now playing against Rambo.");
			} else {
				challenger = new PlayerRock("Rocky");
				System.out.println("You are now playing against Rocky.");
			}

			// game loop structure
			playTheGame(human, challenger);

			cont = Validator.getString(scnr, "Would you like to play again? (y/n): ");
		} while (cont.matches("[yY].*"));
		{
			if (cont.matches("[nN].*")) {
				System.out.println("Thank you for playing. Goodbye.");
				// scnr.close();
			}
		}

	}

	private static void playTheGame(HumanPlayer human, Player challenger) {
		Roshambo input = human.generateRoshambo();

		Roshambo computerOutput = challenger.generateRoshambo();
		System.out.println("You: " + input);
		System.out.println("Challenger: " + computerOutput);
		System.out.println("Let's see who won the game.");
		if (input == Roshambo.PAPER && computerOutput == Roshambo.ROCK) {
			System.out.println(human.getName() + " , CONGRATUALTIONS, YOU WON!");
		} else if (input == Roshambo.PAPER && computerOutput == Roshambo.PAPER) {
			System.out.println("Oh, wow.. It's a draw!");
		} else if (input == Roshambo.SCISSORS && computerOutput == Roshambo.SCISSORS) {
			System.out.println("Oh, wow.. It's a draw!");
		} else if (input == Roshambo.ROCK && computerOutput == Roshambo.ROCK) {
			System.out.println("Oh, wow.. It's a draw!");
		} else if (input == Roshambo.ROCK && computerOutput == Roshambo.SCISSORS) {
			System.out.println("CONGRATULATIONS, YOU WON!");
		} else if (input == Roshambo.SCISSORS && computerOutput == Roshambo.PAPER) {
			System.out.println("Way to go! You Won!");
		} else {
			System.out.println("Aww shucks, you lost..");

		}

	}
}