
public class Terrain {

	private double[][] heights;
	
	public Terrain(double[][] heights) {
		this.heights = heights;
	}
	
	public void printFloodMap(double waterLevel) {
		for (int row = 0; row < heights.length; row++) {
			for (int column = 0; column < heights[row].length; column++) {
				if (heights[row][column] < waterLevel) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}
	
}
