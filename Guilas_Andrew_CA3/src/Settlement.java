public class Settlement {
	private int population;
	private Tile city;
	private Tile[][] tiles;
	private boolean[][] isTileWorkable;
	
	public Settlement(int population, Tile city, Tile[][] tiles, boolean[][] isTileWorkable) {
		this.population = population;
		this.city = city;
		this.tiles = tiles;
		this.isTileWorkable = isTileWorkable;
	}
	
	public int getGold() {
		int gold = city.getGold().getResourceCount();
		
		for (int row = 0; row < tiles.length; row++) {
			for (int col = 0; col < tiles[row].length; col++) {
				Tile tile = tiles[row][col];
				if (tile != null && tile.getIsWorkable() && isTileWorkable[row][col]) {
					gold += tile.getGold().getResourceCount();
				}
			}
		}
		
		return gold;
	}
	
	public int getFood() {
		int food = city.getFood().getResourceCount();
		
		for (int row = 0; row < tiles.length; row++) {
			for (int col = 0; col < tiles[row].length; col++) {
				Tile tile = tiles[row][col];
				if (tile != null && tile.getIsWorkable() && isTileWorkable[row][col]) {
					food += tile.getFood().getResourceCount();
				}
			}
		}
		
		return food;
	}
	
	public int getProduction() {
		int production = city.getProduction().getResourceCount();
		
		for (int row = 0; row < tiles.length; row++) {
			for (int col = 0; col < tiles[row].length; col++) {
				Tile tile = tiles[row][col];
				if (tile != null && tile.getIsWorkable() && isTileWorkable[row][col]) {
					production += tile.getProduction().getResourceCount();
				}
			}
		}
		
		return production;
	}
	
}
