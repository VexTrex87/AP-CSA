import java.util.Scanner;

public class DigitCounterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitCounter digitCounter = new DigitCounter();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number: ");
		int number = scanner.nextInt();
		System.out.println(number + " has " + digitCounter.getDigits(number) + " digits");
		
		scanner.close();
	}

}
