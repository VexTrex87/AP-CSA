import java.util.Random;

public class Walk {

	int currentX;
	int currentY;
	
	public Walk(int x, int y) {
		currentX = x;
		currentY = y;
	}
	
	public void randomWalk() {
		Random random = new Random();
		int randomDirectionInt = random.nextInt(4);
		if (randomDirectionInt == 0) {
			// forward
			currentY += 1;
		} else if (randomDirectionInt == 1) {
			// backward
			currentY -= 1;
		} else if (randomDirectionInt == 2) {
			// right
			currentX += 1;
		} else {
			// left
			currentX -= 1;
		}
	}
	
	public int getX() {
		return currentX;
	}
	
	public int getY() {
		return currentY;
	}
	
}
