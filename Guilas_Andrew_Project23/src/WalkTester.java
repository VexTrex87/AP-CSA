
public class WalkTester {

	public static void main(String[] args) {
		Walk walk = new Walk(0, 0);
		
		for (int i=0; i<100; i++) {
			walk.randomWalk();
		}
				
		int currentX = walk.getX();
		int currentY  = walk.getY();
		System.out.println("Current position is " + currentX + ", " + currentY);
	}

}
	