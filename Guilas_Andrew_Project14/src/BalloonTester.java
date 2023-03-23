import java.lang.Math;

public abstract class BalloonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balloon balloon = new Balloon();

		balloon.addAir(100);
		System.out.println("Volume: " + Math.round(balloon.getVolume() * 100.0) / 100.00);
		System.out.println("Surface Area: " + Math.round(balloon.getSurfaceArea() * 100.0) / 100.0);
		System.out.println("Radius: " + Math.round(balloon.getRadius() * 100.0) / 100.0);
		
		balloon.addAir(100);
		System.out.println("Volume: " + Math.round(balloon.getVolume() * 100.0) / 100.0);
		System.out.println("Surface Area: " + Math.round(balloon.getSurfaceArea() * 100.0) / 100.0);
		System.out.println("Radius: " + Math.round(balloon.getRadius() * 100.0) / 100.0);
		
	}

}
