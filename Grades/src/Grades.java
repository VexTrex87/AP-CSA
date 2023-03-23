import java.util.Scanner;

public class Grades {

	private String studentName;
	private int numScores;
	
	public Grades(String name, int num) {
		studentName = name;
		numScores = num;
	}
	
	public int getSum() {
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in).useDelimiter(" *");
		System.out.print("Enter scores: ");
		
		for (int i = 1; i <= numScores; i++) {
			int score = scanner.nextInt();
			sum += score;
			System.out.println(score + " " + sum);
		}
		
		scanner.close();
		return sum;
	}
	
}
