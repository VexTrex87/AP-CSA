import java.util.Scanner;

public class DateTester {

	public static void main(String[] args) {
		System.out.println("This tool tells you the crime you would commit based on your horoscope.");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the month you were born: ");
		int month = scanner.nextInt();
		
		System.out.print("Enter the day you were born: ");
		int day = scanner.nextInt();
		
		Date date = new Date(month, day);
		String generatedHoroscope = date.getFortune();
		System.out.println(generatedHoroscope);
		
		scanner.close();
	}

}
