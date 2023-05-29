import java.util.Scanner;

public class Console {
	public void clear() {
        final int linesToClear = 50;
        
        for (int i = 0; i < linesToClear; i++) {
            System.out.println();
        }
	}
	
	public void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
	public void printTitleScreen(boolean IS_DEBUGGING) {
		System.out.println("   _____                                         _                    _     _                 ");
        System.out.println("  / ____|                                       | |                  | |   (_)                ");
        System.out.println(" | |        ___    _ __     ___    ___   _ __   | |_   _ __    __ _  | |_   _    ___    _ __  ");
        System.out.println(" | |       / _ \\  | '_ \\   / __|  / _ \\ | '_ \\  | __| | '__|  / _` | | __| | |  / _ \\  | '_ \\ ");
        System.out.println(" | |____  | (_) | | | | | | (__  |  __/ | | | | | |_  | |    | (_| | | |_  | | | (_) | | | | |");
        System.out.println("  \\_____|  \\___/  |_| |_|  \\___|  \\___| |_| |_|  \\__| |_|     \\__,_|  \\__| |_|  \\___/  |_| |_|");
        System.out.println("                                                                                              ");
        delay(3000);
        
        if (IS_DEBUGGING) {
        	System.out.println("Debugging: ON");
        }
	}
	
	public void printLevelScreen() {
		System.out.println("Level Selection:");
		System.out.println("1: 10x10");
		System.out.println("2: 12x12");
		System.out.println("3: 16x16");
		System.out.println("4: 20x20");
		System.out.print("Select a level between 1 & 4: ");
	}
	
	public void printLoadingScreen() {
        String[] rules = {
                "1. In Concentration, two players take turns drawing two cards.",
                "2. On your turn, if you draw a pair of the same cards, you get a point.",
                "3. That pair of cards are taken out and you keep drawing until you don't find a pair.",
                "4. The game ends when all the cards have been drawn.",
                "5. The winner is the player with the most points.",
                "Starting game...",
            };
        
        System.out.println("Rules:");
        for (String rule : rules) {
        	System.out.println(rule);
        	delay(3000);
        }
	}
	
	public void printBoard(Card[][] board, boolean hideCards) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
            	Card card = board[row][col];
            	if (card == null) {
            		if (hideCards) {
                        System.out.print("  ");
            		} else {
                        System.out.print("❌ ");
            		}
            	} else {
            		if (hideCards) {
                        System.out.print("* ");
            		} else {
                        System.out.print(card.getEmoji() + " ");
            		}
            	}
            }
            System.out.println();
        }
	}
	
	public int getSelectedLevel() {
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();
        while (level < 0 || level > 4) {
            System.out.print("Invalid input. Input a level between 1 & 4: ");
            level = scanner.nextInt();
        }
        return level;
	}
	
	public int[] getCardInput() {
		Scanner scanner = new Scanner(System.in);
	        
		String input = scanner.nextLine();
		String[] numbers = input.split(" ");
		int row = Integer.parseInt(numbers[0]);
		int column = Integer.parseInt(numbers[1]);
	                
		int[] location = {row - 1, column - 1};
		return location;
	}
	
}
