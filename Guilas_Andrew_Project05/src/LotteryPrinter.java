import java.util.Random;

public class LotteryPrinter {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.print("Play this combination--it'll make you rich! ");
		System.out.print(random.nextInt(1, 70) + " ");
		System.out.print(random.nextInt(1, 70) + " ");
		System.out.print(random.nextInt(1, 70) + " ");
		System.out.print(random.nextInt(1, 70) + " ");
		System.out.print(random.nextInt(1, 70) + " ");
	}

}
