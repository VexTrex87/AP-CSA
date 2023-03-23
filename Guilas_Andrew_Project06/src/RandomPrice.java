import java.util.Random;

public class RandomPrice {

	public static void main(String[] args) {
		Random random = new Random();
		float randomPrice = random.nextInt(1000, 1995) / 100F;
		System.out.println("$" + randomPrice);
	}

}
