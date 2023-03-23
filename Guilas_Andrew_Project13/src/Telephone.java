
public class Telephone {
	private String telephoneNumber;
	
	public Telephone(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	public String format() {
		String areaCode = telephoneNumber.substring(0, 3);
		String nextCharacters = telephoneNumber.substring(3, 6);
		String lastCharacters = telephoneNumber.substring(6, 10);
		String formattedNumber = "(" + areaCode + ") " + nextCharacters + "-" + lastCharacters;
		return formattedNumber;
	}
}
