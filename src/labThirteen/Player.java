package labThirteen;

public abstract class Player {

	private String name;
	
	
	//this is the constructor/has no return type
	public Player(String name) {
		this.name = name;
	}
	//getter
	public String getName() {
		return name;
	}
	//return one of ROCK, PAPER, SCISSORS
	abstract public Roshambo generateRoshambo();
	
	public String toString() {
		return "Player " + name;
	}
}
