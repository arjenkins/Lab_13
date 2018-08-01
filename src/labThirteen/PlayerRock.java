package labThirteen;

public class PlayerRock extends Player {

	public PlayerRock(String name) {
		super(name);
		
	}
	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}
}
