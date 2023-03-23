import java.awt.Point;

class PointTester {

	public static void main(String[] args) {
		Point point1 = new Point(3, 4);
		Point point2 = new Point(-3, -4);
		double distance = point1.distance(point2);
		
		System.out.println("Expected Value: 10");
		System.out.println("Actual Value: " + distance);
	}

}
