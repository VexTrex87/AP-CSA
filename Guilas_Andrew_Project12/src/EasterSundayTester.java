
public class EasterSundayTester {

	public static void main(String[] args) {
		EasterSunday easterSunday = new EasterSunday(2001);
		int month = easterSunday.getMonth();
		int day = easterSunday.getDay();

		System.out.println("Month: " + month);
		System.out.println("Day: " + day);
	}

}
