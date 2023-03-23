import java.util.Scanner;

public class FrenchTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter country: ");
		String country = scanner.next();
		
		French french = new French();
		System.out.println(french.addArticle(country));
		
		scanner.close();
	}

}
