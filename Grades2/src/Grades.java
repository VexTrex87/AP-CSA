import java.util.Scanner;

public class Grades {

	private String studentName;
	private int numScores;
    private int sum = 0;
	
	public Grades(String name, int num) {
		studentName = name;
		numScores = num;
	}
	
	public int getSum() {		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter scores: ");
		
		for (int i = 1; i <= numScores; i++) {
			int score = scanner.nextInt();
			sum += score;
		}
		
		scanner.close();
		return sum;
	}
	
    public void getAverage() {
        int average = sum / numScores;
        System.out.println(studentName + " has an average of " + average);
    }

}
