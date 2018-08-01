package labThirteen;

import java.util.Scanner;

public class HumanPlayer extends Player {

	private Scanner scnr;

	// constructor w/ 2 parameter
	public HumanPlayer(String name, Scanner scnr) {
		super(name);
		this.scnr = scnr;
	}

	@Override
	public Roshambo generateRoshambo() {
		String choice = Validator.getStringMatchingRegex(scnr,
				"Would you like to play rock, paper, or scissors?"
						+ " Please enter the selecction in lowercase letters or the system will generate an erorr. ",
				"rock|paper|scissors");

		if (choice.equals("rock")) {
			return Roshambo.ROCK;
		} else if (choice.equals("paper")) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;

		}
	}
}