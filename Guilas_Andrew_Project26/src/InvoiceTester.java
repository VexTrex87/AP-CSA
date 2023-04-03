import java.util.Scanner;

public class InvoiceTester {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Invoice invoice = new Invoice();
		
		while (true) {
			System.out.print("Enter price (-1 to cancel): ");
			double price = scanner.nextDouble();
			if (price == -1) {
				break;
			}
			
			System.out.print("Enter quantity: ");
			int count = scanner.nextInt();
			
			System.out.print("Enter pet(Y/N): ");
			String isPetInput = scanner.next();
			boolean isPet;
			if (isPetInput.equals("Y")) {
				isPet = true;
			} else if (isPetInput.equals("N")) {
				isPet = false;
			} else {
				System.out.print("Invalid input");
				continue;
			}
			
			Item item = new Item(price, isPet, count);
			invoice.add(item);
		}
		
		double discount = Math.round(invoice.getDiscount() * 100.00) / 100.00;
		System.out.println("Discount: $" + discount);
		
	}

}
