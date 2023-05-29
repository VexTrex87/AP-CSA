import java.util.Scanner;

public class Tester {
	
	public static void main(String[] args) {
		// 1. create game
		
		Concentration concentration = new Concentration();
		
		// 2. set level
		
		System.out.println("1: 10x10");
		System.out.println("2: 12x12");
		System.out.println("3: 16x16");
		System.out.println("4: 20x20");
		System.out.print("Input a level between 1 & 4: ");
		
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();
        while (level < 1 || level > 4) {
            System.out.print("Invalid input. Input a level between 1 & 4: ");
            level = scanner.nextInt();
        }
        
		concentration.setLevel(level - 1);

		// 3. create cards
		
		concentration.createCards();
		
		// 4. play game
		
		String results = concentration.playGame();
		
		// 5. print results
		
		System.out.println(results);
	}
	
}
