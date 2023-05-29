import java.util.Random;
import java.util.Scanner;

public class Concentration {

	private final String[] CARD_TYPES = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private final int[][] LEVELS = {
			{10, 10},
			{12, 12},
			{16, 16},
			{20, 20},
	};
	private final boolean IS_SIMULATING = false;
	private final int PLAY_DELAY_DURATION = 2000;
	
	private Card[][] board;
	private int cardsRemaining;
	int player1Points;
	int player2Points;
	
	public Concentration() {
		player1Points = 0;
		player2Points = 0;
		
		clearConsole();
		System.out.println("Starting Concentration...");
		delay(PLAY_DELAY_DURATION);
	}
	
	public void setLevel(int level) {
		int rowsCount = LEVELS[level][0];
		int columnsCount = LEVELS[level][1];
		board = new Card[rowsCount][columnsCount];
		cardsRemaining = rowsCount * columnsCount;
		
		clearConsole();
		System.out.println("Generating a " + rowsCount + "x" + columnsCount + " board...");
		delay(PLAY_DELAY_DURATION);
	}
	
	public void createCards() {
    	Random random = new Random();

		for (int i = 0; i < board.length; i++) {
		    for (int j = 0; j < board[i].length; j++) {
		    	int randomIndex = random.nextInt(CARD_TYPES.length);
		        String randomCard = CARD_TYPES[randomIndex];
		        
		        board[i][j] = new Card(randomCard);
		    }
		}
	}
	
	public int[] getCardInput() {
		if (IS_SIMULATING) {
	        Random random = new Random();
	        int randomNumber1 = random.nextInt(board.length) + 1;
	        int randomNumber2 = random.nextInt(board.length) + 1;
	        int[] location = {randomNumber1 - 1, randomNumber2 - 1};
	        return location;
		} else {
	        Scanner scanner = new Scanner(System.in);
	        
	        String input = scanner.nextLine();
	        String[] numbers = input.split(" ");
	        int row = Integer.parseInt(numbers[0]);
	        int column = Integer.parseInt(numbers[1]);
	                
	        int[] location = {row - 1, column - 1};
	        return location;
		}
	}
	
	public int playerPlays() {		
        int[] location1;
        Card card1;
        while (true) {
            System.out.print("Enter the row & column of your 1st card: ");
            
            location1 = getCardInput();
            card1 = board[location1[0]][location1[1]];
            if (card1 == null) {
            	System.out.println("Invalid card, try again");
            } else {
            	break;
            }
        }
        
        int[] location2;
        Card card2;
        while (true) {
            System.out.print("Enter the row & column of your 2nd card: ");

            location2 = getCardInput();
            card2 = board[location2[0]][location2[1]];
            if (card2 == null) {
            	System.out.println("Invalid card, try again");
            } else if (card1 == card2) {
            	System.out.println("Card already selected, try again");
            } else {
            	break;
            }
        }
        
        clearConsole();
        System.out.println("You selected a " + card1.getValue() + " and " + card2.getValue());
        
        if (card1.getValue().equals(card2.getValue())) {
        	System.out.println("You got a match, +1 points! Play again.");
        	board[location1[0]][location1[1]] = null;
        	board[location2[0]][location2[1]] = null;
        	cardsRemaining -= 2;
        	return 1;
        } else {
        	System.out.println("No match. Next player turn");
        	return 0;
        }
	}
	
	public String playGame() {
		clearConsole();
		
		while (true) {
			// player 1 plays
			while (true) {
				if (cardsRemaining == 0 || cardsRemaining == 1) {
					break;
				}
				
				System.out.println("-----PLAYER 1 TURN-----");
				System.out.println("Score: " + player1Points + "-" + player2Points);
				System.out.println("Cards Remaining: " + cardsRemaining);
				printBoard();
				
				int pointsWon = playerPlays();
				player1Points += pointsWon;
				
	            delay(PLAY_DELAY_DURATION);
	            clearConsole();
				
				if (pointsWon == 0) {
					break;
				}

			}
			
			// player 2 plays
			while (true) {			
				if (cardsRemaining == 0 || cardsRemaining == 1) {
					break;
				}
				
				System.out.println("-----PLAYER 2 TURN-----");
				System.out.println("Score: " + player1Points + "-" + player2Points);
				System.out.println("Cards Remaining: " + cardsRemaining);
				printBoard();
				
				int pointsWon = playerPlays();
				player2Points += pointsWon;
				
	            delay(PLAY_DELAY_DURATION);
	            clearConsole();
				
				if (pointsWon == 0) {
					break;
				}
			}
			
			if (cardsRemaining == 0 || cardsRemaining == 1) {
				break;
			}
		}
		
		if (player1Points > player2Points) {
			return "Player 1 wins";
		} else if (player2Points > player1Points) {
			return "Player 2 wins";
		} else {
			return "Tie";
		}
	}
	
	public void printBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
            	Card card = board[row][col];
            	if (card == null) {
                    System.out.print("  ");
            	} else {
                    // System.out.print(card.getValue() + " ");
                    System.out.print("* ");
            	}
            }
            System.out.println();
        }
	}
	
	public void clearConsole() {
        final int linesToClear = 50;
        
        for (int i = 0; i < linesToClear; i++) {
            System.out.println();
        }
	}
	
	public void delay(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
}
