import java.util.Scanner;

public class TelephoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter telephone number: ");
		String telephoneNumber = scanner.next();
		scanner.close();
		
		Telephone telephone = new Telephone(telephoneNumber);
		String formattedNumber = telephone.format();
		System.out.println(formattedNumber);
	}

}
