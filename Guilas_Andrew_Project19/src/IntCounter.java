import java.util.Scanner;

public class IntCounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useDelimiter(" *");
		System.out.print("Enter integers: ");
		
		int minInt = Integer.MAX_VALUE;
		int maxInt = Integer.MIN_VALUE;
		int evenCount = 0;
		int oddCount = 0;
		int total = 0;
		String integers = "";
		String duplicates = "";
		
		while (scanner.hasNextInt()) {
			int nextInt = scanner.nextInt();
			
			if (nextInt < minInt) {
				minInt = nextInt;
			}			
			
			if (nextInt > maxInt) {
				maxInt = nextInt;
			}	
			
			if (nextInt % 2 == 0) {
				evenCount += 1;
			} else {
				oddCount += 1;
			}
			
			total += nextInt;

			if (integers.contains(String.valueOf(nextInt)) == true && 
				duplicates.contains(String.valueOf(nextInt)) == false)
			{
				duplicates += nextInt + " ";
			}
			
			integers += nextInt + " ";
		}
		
		System.out.println("Min is " + minInt);
		System.out.println("Max is " + maxInt);
		System.out.println("There are " + evenCount + " even integers");
		System.out.println("There are " + oddCount + " even integers");
		System.out.println("Cumulative total is " + total);
		System.out.println("Duplicates: " + duplicates);
		
		scanner.close();
	}

}
