public class Tile {

	private boolean isWorkable;
	private Food food;
	private Production production;
	private Gold gold;
	
	public Tile(boolean isWorkable, int food, int production, int gold) {
		this.isWorkable = isWorkable;
		this.food = new Food(food);
		this.production = new Production(production);
		this.gold = new Gold(gold);
	}
	
	public Food getFood() {
		return food;
	}
	
	public Production getProduction() {
		return production;
	}
	
	public Gold getGold() {
		return gold;
	}
	
	public boolean getIsWorkable() {
		return isWorkable;
	}
	
}
