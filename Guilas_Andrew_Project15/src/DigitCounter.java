
public class DigitCounter {	
	public int getDigits(int number) {
		if (number < 0) {
			number *= -1;
		}
		
		if (number >= 1_000_000_000) {
			return 10;
		} else if (number >= 100_000_000) {
			return 9;
		} else if (number >= 10_000_000) {
			return 8;
		} else if (number >= 1_000_000) {
			return 7;
		} else if (number >= 100_000) {
			return 6;
		} else if (number >= 10_000) {
			return 5;
		} else if (number >= 1_000) {
			return 4;
		} else if (number >= 100) {
			return 3;
		} else if (number >= 10) {
			return 2;
		} else {
			return 1;
		}
	}
}
