
public class EasterSunday {
	
	private int n;
	private int p;
	
	public EasterSunday(int y) {
		int a = y % 19;
		int b = y / 100;
		int c = y % 100;
		int d = b / 4;
		int e = b % 4;
		int g = (8 * b + 13) / 25;
		int h = (19 * a + b - d - g + 15) % 30;
		int j = c / 4;
		int k = c % 4;
		int m = (a + 11 * h) / 319;
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		int n = (h - m + r + 90) / 25;
		int p = (h - m + r + n + 19) % 32;
		
		this.n = n;
		this.p = p;
	}
	
	public int getMonth() {
		return n;
	}
	
	public int getDay() {
		return p;
	}

}
