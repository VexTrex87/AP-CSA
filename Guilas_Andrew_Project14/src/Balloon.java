import java.lang.Math;

public class Balloon {
	private double volume;
	
	public Balloon() {
		volume = 0;
	}
	
	public void addAir(double amount) {
		volume += amount;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public double getSurfaceArea() {
		double surfaceArea = Math.cbrt(36 * Math.PI * Math.pow(volume, 2));
		return surfaceArea;
	}
	
	public double getRadius() {
		double radius = Math.cbrt((3 * volume) / (4 * Math.PI));
		return radius;
	}

}
