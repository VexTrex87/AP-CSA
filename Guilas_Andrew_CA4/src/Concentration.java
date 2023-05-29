import java.util.Random;

public class Concentration {

	private final boolean IS_DEBUGGING = false; // computer plays instead of 2 players for debugging
	private final boolean HIDE_CARDS = true;
	private final int PLAY_DELAY = 3000;
	private final int DEBUG_DELAY = 100;
	
	private Board board;
	Player player1;
	Player player2;
	Console console;
	
	public Concentration() {
		player1 = new Player();
		player2 = new Player();
		console = new Console();
		
		// 1. title screen
		console.clear();
		console.printTitleScreen(IS_DEBUGGING);
		console.delay(PLAY_DELAY);
		
		// 2. select level
		console.clear();
		console.printLevelScreen();
		int level = console.getSelectedLevel();        
        
        // 3. create cards
		console.clear();
		console.printLoadingScreen();
		board = new Board(level);
		console.delay(PLAY_DELAY);
	}

	public int[] getRandomCard() {
		Random random = new Random();
		int randomNumber1 = random.nextInt(board.getBoardLength()) + 1;
		int randomNumber2 = random.nextInt(board.getBoardLength()) + 1;
		int[] location = {randomNumber1 - 1, randomNumber2 - 1};
		return location;
	}
	
	public int[] getCardLocation() {
        while (true) {
            System.out.print("Enter the row & column of a card (ex. \"1 1\"): ");
            
            int[] location = (IS_DEBUGGING ? getRandomCard() : console.getCardInput());
            Card card = board.getCards()[location[0]][location[1]];
            if (card == null) {
            	System.out.println("Invalid card, try again");
            } else {
            	return location;
            }
        }
	}
	
	public int playPlayer(Player player, String playerName) {		
		console.clear();
		System.out.println("-----" + playerName + " TURN-----");
		System.out.println("Score: " + player1.getPoints() + "-" + player2.getPoints());
		System.out.println("Cards Remaining: " + board.getCardsRemaining());
		console.printBoard(board.getCards(), HIDE_CARDS);
		
        int[] location1 = getCardLocation();
        Card card1 = board.getCard(location1[0], location1[1]);

        int[] location2 = getCardLocation();
        Card card2 = board.getCard(location2[0], location2[1]);
        
        console.clear();
        card1.printCard();
        card2.printCard();
        System.out.println("You selected a " + card1.getValue() + " and " + card2.getValue());
        
        if (card1.getValue().equals(card2.getValue())) {
        	board.removeCards(location1[0], location1[1]);
        	board.removeCards(location2[0], location2[1]);
        	player.incrementPoints(1);
        	
        	System.out.println("+1 points.");
        	System.out.println(card1.getMessage() + " Play again.");
    		System.out.println("Score: " + player1.getPoints() + "-" + player2.getPoints());
    		System.out.println("Cards Remaining: " + board.getCardsRemaining());
    		console.delay(IS_DEBUGGING ? DEBUG_DELAY : PLAY_DELAY);
			
			return 1;
        } else {
        	System.out.println("No match. Next player turn");
    		System.out.println("Score: " + player1.getPoints() + "-" + player2.getPoints());
    		System.out.println("Cards Remaining: " + board.getCardsRemaining());
    		console.delay(IS_DEBUGGING ? DEBUG_DELAY : PLAY_DELAY);

        	return 0;
        }
	}
	
	public String playGame() {		
		while (board.getCardsRemaining() > 1) {
			// player 1 plays until they don't find a pair
			while (board.getCardsRemaining() > 1) {
				int pointsWon = playPlayer(player1, "PLAYER 1");				
				if (pointsWon == 0) {
					break;
				}
			}
			
			// player 2 plays until they don't find a pair
			while (board.getCardsRemaining() > 1) {			
				int pointsWon = playPlayer(player2, "PLAYER 2");
				if (pointsWon == 0) {
					break;
				}
			}
		}
		
		console.clear();
		if (player1.getPoints() > player2.getPoints()) {
			return "Player 1 wins!";
		} else if (player2.getPoints() > player1.getPoints()) {
			return "Player 2 wins!";
		} else {
			return "Tie";
		}	
	}
	
}
