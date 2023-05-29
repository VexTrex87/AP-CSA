
public class Player {

	private int points;
	
	public Player() {
		points = 0;
	}
	
	public void incrementPoints(int amount) {
		points += amount;
	}
	
	public int getPoints() {
		return points;
	}
	
}
