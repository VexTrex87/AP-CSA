import java.util.Scanner;

public class IncomeTaxTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your income: $");
		double income = scanner.nextDouble();
		
		IncomeTax incomeTax = new IncomeTax(income);
		double tax = incomeTax.calculate();
		System.out.println("Your income tax is $" + tax);
		
		scanner.close();
	}

}
