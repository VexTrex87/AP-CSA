
public abstract class Card {

	private String value;
	private String emoji;
	private String message;
	
	public Card(String value, String emoji, String message) {
		this.value = value;
		this.emoji = emoji;
		this.message = message;
	}
	
	public String getValue() {
		return value;
	}
	
	public void printCard() {
        System.out.println(".------.");
        System.out.println("|" + emoji + "    |");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|    " + emoji + "|");
        System.out.println("`------'");
	}	
	public String getEmoji() {
		return emoji;
	}	
	
	public String getMessage() {
		return message;
	}
}
