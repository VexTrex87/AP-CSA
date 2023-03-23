import java.awt.Rectangle;

public class AreaTester {

	public static void main(String[] args) {
		Rectangle box = new Rectangle(0, 0, 10, 10);
		double area = box.getHeight() * box.getWidth();
		System.out.println("Expected Area: 100");
		System.out.println("Calculated Area: " + area);
	}

}
