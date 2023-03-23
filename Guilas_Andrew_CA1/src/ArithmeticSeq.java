
public class ArithmeticSeq {
	private int currentValue;
	private int commonDifference;
	
	public ArithmeticSeq(int currentValue, int commonDifference) {
		this.currentValue = currentValue;
		this.commonDifference = commonDifference;
	}
	
	public int getDifference() {
		return commonDifference;
	}
	
	public int getCurrentTerm() {
		return currentValue;
	}
	
	public int nextTerm() {
		currentValue += commonDifference;
		return currentValue;
	}
}
