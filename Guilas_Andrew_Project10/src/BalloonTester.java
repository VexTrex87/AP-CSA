
public class BalloonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balloon balloon = new Balloon();
		balloon.inflate(10);
		
		double volume = balloon.getVolume();
		System.out.println(volume);
	}

}
