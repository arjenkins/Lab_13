package labThirteen;

public class RandomPlayer extends Player {

	public RandomPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		int random2 = (int) (Math.random() * 3);

		return Roshambo.values()[random2];

	}

}
