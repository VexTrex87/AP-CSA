public class TerrainTester {

	public static void main(String[] args) {
		
		double[][] heights = {
				{3, 3, 6, 8, 9, 9, 9, 9, 7, 6},
				{3, 3, 6, 8, 9, 9, 9, 8, 6, 5},
				{2, 3, 5, 7, 8, 7, 7, 5, 3, 2},
				{2, 3, 4, 5, 6, 5, 4, 3, 2, 1},
				{1, 3, 3, 4, 4, 4, 2, 2, 1, 1},
				{1, 1, 3, 3, 3, 3, 2, 1, 1, 0},
				{0, 1, 1, 1, 2, 2, 1, 1, 0, 0},
				{0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		};
		
		Terrain terrain = new Terrain(heights);
		for (double i = 1; i <= 10; i++) {
			for (int j = 0; j < 20; ++j) System.out.println();
			terrain.printFloodMap(i);
			
		    try {
		        Thread.sleep(1000);
		    } catch(InterruptedException ex) {
		        Thread.currentThread().interrupt();
		    }
		}
		
	}

}
