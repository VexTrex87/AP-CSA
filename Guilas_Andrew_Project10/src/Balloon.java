
public class Balloon {

	private double radius = 0;
	
	public void inflate(double amount) {
		radius += amount;
	}
	
	public double getVolume() {
		double volume = (4) * Math.PI * (radius * radius * radius) / (3);
		return volume;
	}
	
}
