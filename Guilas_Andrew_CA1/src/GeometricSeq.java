
public class GeometricSeq {
	private double currentValue;
	private double commonRatio;
	
	public GeometricSeq(double currentValue, double commonRatio) {
		this.currentValue = currentValue;
		this.commonRatio = commonRatio;
	}
	
	public double getRatio() {
		return commonRatio;
	}
	
	public double getCurrentTerm() {
		return currentValue;
	}
	
	public double nextTerm() {
		currentValue *= commonRatio;
		return currentValue;
	}
}
