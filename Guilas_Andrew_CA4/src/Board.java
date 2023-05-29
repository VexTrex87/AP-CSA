import java.util.Random;

public class Board {

	private final int[][] LEVELS = {{4, 4}, {10, 10}, {12, 12}, {16, 16}, {20, 20}}; // level 0 is for debugging

	private Card[][] cards;
	private int cardsRemaining;
	private int length;
	
	public Board(int level) {
    	Random random = new Random();

		length = LEVELS[level][0];
		cards = new Card[length][length];
		cardsRemaining = length * length;
    	
		for (int i = 0; i < length; i++) {
		    for (int j = 0; j < length; j++) {
		    	int randomIndex = random.nextInt(5);
		        if (randomIndex == 0) {
		        	cards[i][j] = new CardPig();
		        } else if (randomIndex == 1) {
		        	cards[i][j] = new CardFace();
		        } else if (randomIndex == 2) {
		        	cards[i][j] = new CardSkull();
		        } else if (randomIndex == 3) {
		        	cards[i][j] = new CardFire();
		        } else if (randomIndex == 4) {
		        	cards[i][j] = new CardHeart();
		        }
		    }
		}
	}
	
	public Card[][] getCards() {
		return cards;
	}
	
	public Card getCard(int row, int column) {
		return cards[row][column];
	}
	
	public int getCardsRemaining() {
		return cardsRemaining;
	}
	
	public int getBoardLength() {
		return length;
	}
	
	public void removeCards(int row, int column) {
    	cards[row][column] = null;
    	cardsRemaining--;
	}
	
}
